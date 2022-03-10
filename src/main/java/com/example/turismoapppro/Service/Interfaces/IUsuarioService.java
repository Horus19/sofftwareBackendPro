package com.example.turismoapppro.Service.Interfaces;

import com.example.turismoapppro.models.DTO.PublicacionDTO;
import com.example.turismoapppro.models.entity.Publicacion;
import com.example.turismoapppro.models.entity.Usuario;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public interface IUsuarioService {
    Usuario findByUsername(String username);

    Usuario findById(Long id);

}
