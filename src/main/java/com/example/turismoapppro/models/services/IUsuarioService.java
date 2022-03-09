package com.example.turismoapppro.models.services;

import com.example.turismoapppro.models.entity.Publicacion;
import com.example.turismoapppro.models.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
    public Publicacion findPublicacionById(Long id);
    public Publicacion savePublicacion(Publicacion publicacion);
    public void deletePublicacionByID(Long id);
}
