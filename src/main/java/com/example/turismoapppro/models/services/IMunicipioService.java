package com.example.turismoapppro.models.services;

import com.example.turismoapppro.models.entity.Municipio;

import java.util.List;

public interface IMunicipioService {
    public List<Municipio> findAll();
    public Municipio findById(Long id);
    public Municipio save(Municipio municipio);
    public void delete(Long id);
}
