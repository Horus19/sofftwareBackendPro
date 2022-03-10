package com.example.turismoapppro.models.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@Table(name = "imagenes")
public class Imagen implements Serializable {
    private  static  final long serialVersionUID = -4215902333095746166L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "url")
    private String url;
    @Column(name = "publicacion_id")
    private Long idPublicacion;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "publicacion_id", insertable = false, updatable = false)
    private Publicacion publicacion;

}
