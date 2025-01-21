package com.foro_hub.foro_hub.controller;

import com.foro_hub.foro_hub.domain.respuesta.DatosRegistrarRespuesta;
import com.foro_hub.foro_hub.domain.respuesta.Respuesta;
import com.foro_hub.foro_hub.domain.respuesta.RespuestaRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {
    @Autowired
    private RespuestaRepository respuestaRepository;

    @PostMapping
    public void registrarRespuesta(@RequestBody @Valid DatosRegistrarRespuesta datosRegistrarRespuesta){
        respuestaRepository.save(new Respuesta(datosRegistrarRespuesta));
    }
}
