package com.encuesta.encuesta.resource;

import com.encuesta.encuesta.model.Encuesta;
import com.encuesta.encuesta.service.EncuestaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin()
@RestController
@RequestMapping(value = "/encuesta", method = {RequestMethod.GET, RequestMethod.POST})
public class EncuestaController {
    /**
     * Inyeccion de dependencias
     */
    private final EncuestaService encuestaService;

    /**
     * Constructor
     * @param encuestaService
     */
    public EncuestaController(EncuestaService encuestaService) {
        this.encuestaService = encuestaService;
    }

    /**
     * obtiene una lista de encuestas
     * @return ResponseEntity<List<Encuesta>>
     */
    @CrossOrigin()
    @GetMapping("/all")
    public ResponseEntity<List<Encuesta>> getAllEncuesta(){
        List<Encuesta> listEncuesta = encuestaService.findAllEncuesta();
        return new ResponseEntity<>(listEncuesta, HttpStatus.OK);
    }

    /**
     * Controlador para guardar encuestas
     * @param encuesta
     * @return
     */
    @CrossOrigin()
    @PostMapping("/add")
    public ResponseEntity<Encuesta> addEncuesta(@RequestBody Encuesta encuesta) {
        Encuesta  newEncuesta = encuestaService.addEncuesta(encuesta);
        return new ResponseEntity<>(newEncuesta, HttpStatus.CREATED);
    }

}
