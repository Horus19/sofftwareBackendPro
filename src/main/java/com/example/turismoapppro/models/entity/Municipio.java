package com.example.turismoapppro.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@NoArgsConstructor
@Table(name = "municipios")
public class Municipio implements Serializable {

    public void setPublicaciones(List<Publicacion> publicaciones) {
        this.publicaciones = publicaciones;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;
    private String nombre;
    @JsonIgnoreProperties({"publicaciones", "hibernateLazyInitializer", "handler"})
    @OneToMany(mappedBy = "municipio", cascade = CascadeType.ALL )
    private List<Publicacion> publicaciones;

    public List<Publicacion> getPublicaciones() {
        return publicaciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private  static  final long serialVersionUID = 1L;
}
