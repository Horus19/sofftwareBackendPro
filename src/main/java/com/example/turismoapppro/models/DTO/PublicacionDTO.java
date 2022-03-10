package com.example.turismoapppro.models.DTO;

import com.example.turismoapppro.models.entity.Imagen;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PublicacionDTO {
    private  Long id;
    private String titulo;
    private String descripcion;
    private Long Id_user;
    private Long Id_municipio;
    private List<Imagen> imagenList;


}
