package com.example.turismoapppro.Mappers;

import com.example.turismoapppro.models.DTO.PublicacionDTO;
import com.example.turismoapppro.models.DTO.getPublicacionDTO;
import com.example.turismoapppro.models.entity.Publicacion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface IPublicacionMapper {
    IPublicacionMapper INSTANCE = Mappers.getMapper(IPublicacionMapper.class);


    @Mappings({
            @Mapping(target = "id",source = "id"),
            @Mapping(target = "titulo",source = "titulo"),
            @Mapping(target = "municipio",source = "municipio.nombre"),
            @Mapping(target = "id_municipio",source = "municipio.id"),
            @Mapping(target = "usuario",source = "usuario.username"),
            @Mapping(target = "descripcion",source = "descripcion"),
            @Mapping(target = "resenias", ignore = true)
    })
    getPublicacionDTO togetPublicacionDTO(Publicacion publicacion);

    List<getPublicacionDTO> togetPublicacionDTOList(List<Publicacion> publicacionList);

}
