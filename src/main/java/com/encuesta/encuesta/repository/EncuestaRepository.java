package com.encuesta.encuesta.repository;

import com.encuesta.encuesta.model.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * interfaz Encuesta
 */
@Repository
public interface EncuestaRepository extends JpaRepository<Encuesta, Encuesta> {

    @Query ("select en.email " +
            "from Encuesta en " +
            "where en.email = :email ")
    String findByEmail(String email);

}
