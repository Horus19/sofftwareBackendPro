package com.example.turismoapppro.controllers;

import com.example.turismoapppro.Service.Interfaces.IMunicipioService;
import com.example.turismoapppro.Service.Interfaces.IPublicacionService;
import com.example.turismoapppro.Service.Interfaces.IUsuarioService;
import com.example.turismoapppro.models.DTO.getPublicacionDTO;
import com.example.turismoapppro.models.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class UsuarioRestController {
    IUsuarioService usuarioService;

    IPublicacionService publicacionService;

    IMunicipioService municipioService;

    @GetMapping("/usuarios/{username}")
    @ResponseStatus(HttpStatus.OK)
    public Usuario show(@PathVariable String username) {
        return usuarioService.findByUsername(username);
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
