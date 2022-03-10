package com.example.turismoapppro.Service.Interfaces;

import com.example.turismoapppro.models.entity.Municipio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IMunicipioService {
    List<Municipio> findAll();

    Municipio findById(Long id);

    Municipio save(Municipio municipio);

    void delete(Long id);
}
