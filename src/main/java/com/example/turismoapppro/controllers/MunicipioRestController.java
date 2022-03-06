package com.example.turismoapppro.controllers;

import com.example.turismoapppro.models.entity.Municipio;
import com.example.turismoapppro.models.services.IMunicipioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MunicipioRestController {
    @Autowired
    private IMunicipioService municipioService;
    @GetMapping("/municipios")
    public List<Municipio> index(){
        return municipioService.findAll();
    }
}
