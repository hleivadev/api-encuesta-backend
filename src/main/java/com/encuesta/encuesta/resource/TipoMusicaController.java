package com.encuesta.encuesta.resource;

import com.encuesta.encuesta.model.TipoMusica;
import com.encuesta.encuesta.service.TipoMusicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tipomusica")
public class TipoMusicaController {
    /**
     * Inyeccion de dependencias
     */
    private final TipoMusicaService tipoMusicaService;

    /**
     * Constructor
     * @param tipoMusicaService
     */
    public TipoMusicaController(TipoMusicaService tipoMusicaService) {
        this.tipoMusicaService = tipoMusicaService;
    }

    @CrossOrigin()
    @GetMapping("/all")
    public ResponseEntity<List<TipoMusica>>getAllTipoMusica(){
        List<TipoMusica> listTipoMusicas = tipoMusicaService.findAllTipoMusica();
        return new ResponseEntity<>(listTipoMusicas, HttpStatus.OK);
    }

    @CrossOrigin()
    @PostMapping("/add")
    public ResponseEntity<TipoMusica> addTipoMusica(@RequestBody TipoMusica tipoMusica){
        TipoMusica newtipoMusica = tipoMusicaService.addTipoMusica(tipoMusica);
        return new ResponseEntity<>(newtipoMusica,HttpStatus.CREATED);
    }
}
