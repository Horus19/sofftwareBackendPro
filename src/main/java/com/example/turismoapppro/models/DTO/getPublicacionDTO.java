package com.example.turismoapppro.models.DTO;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class getPublicacionDTO implements Serializable {
    private static final long serialVersionUID = -6269560311471266270L;

    private Long id;
    private String titulo;
    private String municipio;
    private String usuario;
    private String descripcion;
    private String resenias;


}