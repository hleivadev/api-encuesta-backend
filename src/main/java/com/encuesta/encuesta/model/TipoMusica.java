package com.encuesta.encuesta.model;


import javax.persistence.*;
import java.io.Serializable;


/**
 * entidad tipo de musica, generos
 *
 * */
@Entity
public class TipoMusica implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false , updatable = false)
    private Long id;
    private String nameTipoMusica;

    public TipoMusica() {
    }

    public TipoMusica(Long id, String nameTipoMusica) {
        this.id = id;
        this.nameTipoMusica = nameTipoMusica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameTipoMusica() {
        return nameTipoMusica;
    }

    public void setNameTipoMusica(String nameTipoMusica) {
        this.nameTipoMusica = nameTipoMusica;
    }

    @Override
    public String toString() {
        return "TipoMusica{" +
                "id=" + id +
                ", nameTipoMusica='" + nameTipoMusica + '\'' +
                '}';
    }
}
