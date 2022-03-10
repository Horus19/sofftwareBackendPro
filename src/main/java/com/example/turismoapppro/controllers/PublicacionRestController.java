package com.example.turismoapppro.controllers;

import com.example.turismoapppro.models.DTO.PublicacionDTO;
import com.example.turismoapppro.models.DTO.getPublicacionDTO;
import com.example.turismoapppro.models.entity.Publicacion;
import com.example.turismoapppro.Service.Interfaces.IMunicipioService;
import com.example.turismoapppro.Service.Interfaces.IPublicacionService;
import com.example.turismoapppro.Service.Interfaces.IUsuarioService;
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

    IUsuarioService usuarioService;

    IPublicacionService publicacionService;

    IMunicipioService municipioService;

    @GetMapping("/publicaciones/{id}")
    @ResponseStatus(HttpStatus.OK)
    public getPublicacionDTO show(@PathVariable Long id) {
        return publicacionService.findById(id);
    }

    @GetMapping("/publicaciones")
    @ResponseStatus(HttpStatus.OK)
    public List<getPublicacionDTO> index() {
        return this.publicacionService.findAll();
    }
    @GetMapping("/publicacionById/{id}")
    public getPublicacionDTO ShowById(@PathVariable Long id){
        return this.publicacionService.findById(id);
    }

    @DeleteMapping("/publicacionById/{id}")
    public void delete(@PathVariable Long id){
        this.publicacionService.delete(id);
    }


    @PostMapping("/publicaciones")
    public ResponseEntity<Boolean> create(@RequestBody PublicacionDTO publicacionDTO) {
        var response = this.publicacionService.savePublicacion(publicacionDTO);
        if (response == null)
            return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @PutMapping("/publicaciones")
    public ResponseEntity<Boolean> update(@RequestBody PublicacionDTO publicacionDTO) {
        var response = this.publicacionService.update(publicacionDTO);
        if (!response.isPresent())
            return new ResponseEntity<>(false, HttpStatus.NOT_FOUND);
        return new ResponseEntity<>(true, HttpStatus.OK);
    }
    @GetMapping("/publicacionesByMunicipio/{id}")
    public ResponseEntity<List<getPublicacionDTO>> getPublicacionesByIdMunicipio(@PathVariable Long id){
        var response = this.publicacionService.findAllByMunicipio(id);
        if(response.isEmpty())
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
    @GetMapping("/publicacionesByUser/{id}")
    public ResponseEntity<List<getPublicacionDTO>> getPublicacionesByUser(@PathVariable Long id){
        var response = this.publicacionService.findAllByUsuario(id);
        if(response.isEmpty())
            return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @Autowired
    public void setUsuarioService(IUsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    @Autowired
    public void setPublicacionService(IPublicacionService publicacionService) {
        this.publicacionService = publicacionService;
    }
    @Autowired
    public void setMunicipioService(IMunicipioService municipioService) {
        this.municipioService = municipioService;
    }
}
