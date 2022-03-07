package com.example.turismoapppro.models.services;

import com.example.turismoapppro.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
}
