package com.example.turismoapppro.Service.Interfaces;

import com.example.turismoapppro.models.DTO.PublicacionDTO;
import com.example.turismoapppro.models.DTO.getPublicacionDTO;
import com.example.turismoapppro.models.entity.Publicacion;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface IPublicacionService {
    List<getPublicacionDTO> findAll();

    getPublicacionDTO findById(Long id);

    Boolean savePublicacion(PublicacionDTO publicacionDTO);

    Optional<Publicacion> update(PublicacionDTO publicacionDTO);


    List<getPublicacionDTO> findAllByMunicipio(Long idMunicipio);

    List<getPublicacionDTO> findAllByUsuario(Long idUsuario);

    void delete(Long id);
}
