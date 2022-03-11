package com.example.turismoapppro.models.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@NoArgsConstructor
@Table(name = "publicaciones")
public class Publicacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name="usuario_id")
    private Long Id_user;

    @Column(name="municipio_id")
    private Long Id_municipio;

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    @Column(name="url_image")
    private String url_image;


    @JsonIgnoreProperties({"publicaciones", "hibernateLazyInitializer", "handler", "password"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
    private Usuario usuario;

//    @JsonIgnoreProperties({"publicacion", "hibernateLazyInitializer", "handler"})
//    @OneToMany(mappedBy = "publicacion", cascade = CascadeType.ALL )
//    @JoinColumn(name = "usuario_id", insertable = false, updatable = false)
//    private List<Imagen> Imagenes;

    @JsonIgnoreProperties({"publicaciones", "hibernateLazyInitializer", "handler"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "municipio_id", insertable = false, updatable = false)
    private Municipio municipio;

//    @OneToMany(mappedBy = "publicacion", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(insertable = false, updatable = false)
//    private List<Resenia> resenias;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

//    public List<Imagen> getImagenes() {
//        return Imagenes;
//    }
//
//    public void setImagenes(List<Imagen> imagenes) {
//        Imagenes = imagenes;
//    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

//    public List<Resenia> getResenias() {
//        return resenias;
//    }
//
//    public void setResenias(List<Resenia> resenias) {
//        this.resenias = resenias;
//    }

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
