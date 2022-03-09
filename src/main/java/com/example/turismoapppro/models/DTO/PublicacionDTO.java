package com.example.turismoapppro.models.DTO;

import com.example.turismoapppro.models.entity.Imagen;

import java.util.List;

public class PublicacionDTO {
    private String titulo;
    private String descripcion;
    private Long Id_user;
    private Long Id_municipio;
    //private List<Imagen> imagenList;

    public PublicacionDTO(String titulo, String description, Long id_user, Long id_municipio) {
        this.titulo = titulo;
        this.descripcion = description;
        Id_user = id_user;
        Id_municipio = id_municipio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescription() {
        return descripcion;
    }

    public void setDescription(String description) {
        this.descripcion = description;
    }

    public Long getId_user() {
        return Id_user;
    }

    public void setId_user(Long id_user) {
        Id_user = id_user;
    }

    public Long getId_municipio() {
        return Id_municipio;
    }

    public void setId_municipio(Long id_municipio) {
        Id_municipio = id_municipio;
    }
}
