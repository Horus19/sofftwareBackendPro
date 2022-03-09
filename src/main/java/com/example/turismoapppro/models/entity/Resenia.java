package com.example.turismoapppro.models.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "resenias")
public class Resenia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Publicacion getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private Publicacion publicacion;

}
