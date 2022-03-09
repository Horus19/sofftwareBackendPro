package com.example.turismoapppro.controllers;

import com.example.turismoapppro.models.entity.Publicacion;
import com.example.turismoapppro.models.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class PublicacionRestController {
    @Autowired
    IUsuarioService usuarioService;
    @GetMapping("/publicaciones/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Publicacion show(@PathVariable Long id) {
        return usuarioService.findPublicacionById(id);
    }

}
