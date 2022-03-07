package com.example.turismoapppro.controllers;

import com.example.turismoapppro.models.entity.Municipio;
import com.example.turismoapppro.models.services.IMunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
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
    //@ResponseStatus(HttpStatus.OK)
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
    @ResponseStatus(HttpStatus.CREATED)
    public Municipio create(@RequestBody Municipio municipio){
        return municipioService.save(municipio);
    }

    @PutMapping("/municipios/{id}")
    public Municipio update(@RequestBody Municipio municipio, @PathVariable Long id){
        Municipio municipioActual = municipioService.findById(id);
        municipioActual.setNombre(municipio.getNombre());
        return municipioService.save(municipioActual);
    }

    @DeleteMapping("/municipios/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id){
        municipioService.delete(id);
    }



}
