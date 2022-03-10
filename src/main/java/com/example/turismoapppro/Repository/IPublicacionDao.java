package com.example.turismoapppro.Repository;

import com.example.turismoapppro.models.entity.Publicacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IPublicacionDao extends JpaRepository<Publicacion, Long> {
    @Query("FROM Publicacion p WHERE p.Id_municipio = :idMunicipio")
    List<Publicacion> findAllById_municipio(Long idMunicipio);

    @Query("FROM Publicacion p WHERE p.Id_user = :idUser")
    List<Publicacion> findAllByIdUser(Long idUser);
}
