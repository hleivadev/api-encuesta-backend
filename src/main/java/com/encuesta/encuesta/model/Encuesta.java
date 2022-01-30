package com.encuesta.encuesta.model;


import javax.persistence.*;
import java.io.Serializable;

/**
 * Entidad encuesta
 *
 */
@Entity
public class Encuesta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false , updatable = false)
    private Long id;
    @Column(name = "email", unique=true)
    private String email;
    private String nameTipoMusica;

    public Encuesta() {
    }

    public Encuesta(Long id, String email, String nameTipoMusica) {
        this.id = id;
        this.email = email;
        this.nameTipoMusica = nameTipoMusica;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNameTipoMusica() {
        return nameTipoMusica;
    }

    public void setNameTipoMusica(String nameTipoMusica) {
        this.nameTipoMusica = nameTipoMusica;
    }

    @Override
    public String toString() {
        return "Encuesta{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", nameTipoMusica='" + nameTipoMusica + '\'' +
                '}';
    }
}
