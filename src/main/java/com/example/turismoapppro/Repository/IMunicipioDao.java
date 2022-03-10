package com.example.turismoapppro.Repository;

import com.example.turismoapppro.models.entity.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IMunicipioDao extends JpaRepository<Municipio, Long> {
}
