package com.example.turismoapppro.controllers;

import com.example.turismoapppro.models.DTO.PublicacionDTO;
import com.example.turismoapppro.models.entity.Municipio;
import com.example.turismoapppro.models.entity.Publicacion;
import com.example.turismoapppro.models.services.IMunicipioService;
import com.example.turismoapppro.models.services.IPublicacionService;
import com.example.turismoapppro.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PublicacionRestController {
    @Autowired
    IUsuarioService usuarioService;

    @Autowired
    IPublicacionService publicacionService;

    @Autowired
    IMunicipioService municipioService;

    @GetMapping("/publicaciones/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Publicacion show(@PathVariable Long id) {
        return usuarioService.findPublicacionById(id);
    }

    @GetMapping("/publicaciones")
    @ResponseStatus(HttpStatus.OK)
    public List<Publicacion> index() {
        return this.publicacionService.findAll();
    }

    @GetMapping("/publicacionById/{id}")
    public Publicacion ShowById(@PathVariable Long id){
        return this.publicacionService.findById(id);
    }

    @DeleteMapping("/publicacionById/{id}")
    public void delete(@PathVariable Long id){
        this.usuarioService.deletePublicacionByID(id);
    }

    @PostMapping("/publicaciones")
    public ResponseEntity<?> create(@RequestBody PublicacionDTO publicacionDTO){
        Publicacion publicacion1 = new Publicacion();
        publicacion1.setTitulo(publicacionDTO.getTitulo());
        publicacion1.setDescripcion(publicacionDTO.getDescription());
        publicacion1.setUsuario(this.usuarioService.findById(publicacionDTO.getId_user()));
        publicacion1.setMunicipio(this.municipioService.findById(publicacionDTO.getId_municipio()));
        Publicacion publicacionNew = null;
        Map<String, Object> response = new HashMap<>();
        try {
            publicacionNew = this.usuarioService.savePublicacion(publicacion1);
        }
        catch (DataAccessException e){
            response.put("mensaje","Error al realizar el insert en la base de datos");
            response.put("ERROR", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return  new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje","la Publicacion ha sido creado con exito");
        response.put("Publicacion", publicacionNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }
}
