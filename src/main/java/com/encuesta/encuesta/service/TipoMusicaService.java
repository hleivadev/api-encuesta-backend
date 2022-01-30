package com.encuesta.encuesta.service;

import com.encuesta.encuesta.model.TipoMusica;
import com.encuesta.encuesta.repository.TipoMusicaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoMusicaService {
    private final TipoMusicaRespository tipoMusicaRespository;

    @Autowired
    public TipoMusicaService(TipoMusicaRespository tipoMusicaRespository) {
        this.tipoMusicaRespository = tipoMusicaRespository;
    }

    /**
     * Obtiene un listados de tipos de musica o generos
     * @return
     */
    public List<TipoMusica> findAllTipoMusica(){
        return tipoMusicaRespository.findAll();
    }

    /**
     * Obtiene por ID el tipo de genero
     * @param id
     * @return
     */
    public String findTipoMusicaById(Long id){
        return tipoMusicaRespository.getById(id).getNameTipoMusica();
    }

    /**
     * Guarda los tipos de musica o genero
     * @param tipoMusica
     * @return
     */
    public TipoMusica addTipoMusica(TipoMusica tipoMusica){
        return tipoMusicaRespository.save(tipoMusica);
    }
}
