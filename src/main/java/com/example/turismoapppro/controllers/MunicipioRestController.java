package com.example.turismoapppro.controllers;

import com.example.turismoapppro.models.entity.Municipio;
import com.example.turismoapppro.models.services.IMunicipioService;
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
public class MunicipioRestController {
    @Autowired
    private IMunicipioService municipioService;
    @GetMapping("/municipios")
    public List<Municipio> index(){
        return municipioService.findAll();
    }

    @GetMapping("/municipios/{id}")
    public ResponseEntity<?> show(@PathVariable Long id){
        Municipio municipio = municipioService.findById(id);
        Map<String, Object> response = new HashMap<>();
        if(municipio == null){
            response.put("mensaje","El municipio ID:".concat(id.toString()).concat(" no existe en la base de datos!"));
            return  new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Municipio>(municipio, HttpStatus.OK);
    }

    @PostMapping("/municipios")
    public ResponseEntity<?> create(@RequestBody Municipio municipio){
        Municipio municipioNew = null;
        Map<String, Object> response = new HashMap<>();
        try {
            municipioNew = municipioService.save(municipio);
        }
        catch (DataAccessException e){
            response.put("mensaje","Error al realizar el insert en la base de datos");
            response.put("ERROR", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return  new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje","El municipio ha sido creado con exito");
        response.put("municipio", municipioNew);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @PutMapping("/municipios/{id}")
    public ResponseEntity<?> update(@RequestBody Municipio municipio, @PathVariable Long id){
        Municipio municipioActual = municipioService.findById(id);
        Municipio municipioUpdated = null;
        Map<String, Object> response = new HashMap<>();
        if(municipioActual == null){
            response.put("mensaje", "Error: no se pudo editar, el municipio ID:".concat(id.toString()).concat(" no existe en la base de datos"));
            return  new ResponseEntity<Map<String, Object>>(response, HttpStatus.NOT_FOUND);
        }
        try {
            municipioActual.setNombre(municipio.getNombre());
            municipioUpdated = municipioService.save(municipioActual);
        }
        catch (DataAccessException e){
            response.put("mensaje","Error al actualizar el municipio en la base de datos");
            response.put("ERROR", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return  new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje","El municipio ha sido actualizado con exito");
        response.put("municipio", municipioUpdated);
        return new ResponseEntity<Map<String, Object>>(response, HttpStatus.CREATED);
    }

    @DeleteMapping("/municipios/{id}")
    public ResponseEntity<?> delete(@PathVariable long id){
        Map<String, Object> response = new HashMap<>();
        try {
            municipioService.delete(id);
        } catch (DataAccessException e) {
            response.put("mensaje", "Error al eliminar el municipio de la base de datos");
            response.put("error", e.getMessage().concat(": ").concat(e.getMostSpecificCause().getMessage()));
            return new ResponseEntity<Map<String, Object>>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        response.put("mensaje", "El municipio ha sido eliminado con exito!");
        return  new ResponseEntity<Map<String, Object>>(response, HttpStatus.OK);
    }

}
