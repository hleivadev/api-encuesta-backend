package com.encuesta.encuesta.service;

import com.encuesta.encuesta.model.Encuesta;
import com.encuesta.encuesta.repository.EncuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EncuestaService {
    /**
     * Inyeccion de dependencias
     */
    private final EncuestaRepository encuestaRepository;

    /**
     * Constructor
     * @param encuestaRepository
     */
    @Autowired
    public EncuestaService(EncuestaRepository encuestaRepository) {
                this.encuestaRepository = encuestaRepository;
    }

    /**
     * Metodo que obtiene una lista de encuestas
     *
     * @return
     */
    public List<Encuesta> findAllEncuesta(){
        return encuestaRepository.findAll();
    }

    /**
     * Metodo para guardar las encuestas
     *
     * @param encuesta
     * @return
     */
    public Encuesta addEncuesta(Encuesta encuesta) {
        return encuestaRepository.save(encuesta);
    }

}
