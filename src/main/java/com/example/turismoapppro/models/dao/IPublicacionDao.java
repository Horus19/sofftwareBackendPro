package com.example.turismoapppro.models.dao;

import com.example.turismoapppro.models.entity.Publicacion;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IPublicacionDao extends CrudRepository <Publicacion, Long> {
}
