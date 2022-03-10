package com.example.turismoapppro.Repository;

import com.example.turismoapppro.models.entity.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IImagenesDAO extends JpaRepository<Imagen, Long> {
}
