package com.example.turismoapppro.models.services;

import com.example.turismoapppro.models.entity.Publicacion;

import java.util.List;

public interface IPublicacionService {
    public List<Publicacion> findAll();
    public Publicacion findById(Long id);
    public void delete(Long id);
}
