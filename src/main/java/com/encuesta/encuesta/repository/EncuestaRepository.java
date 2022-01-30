package com.encuesta.encuesta.repository;

import com.encuesta.encuesta.model.Encuesta;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * interfaz Encuesta
 */
public interface EncuestaRepository extends JpaRepository<Encuesta, Long> {

}
