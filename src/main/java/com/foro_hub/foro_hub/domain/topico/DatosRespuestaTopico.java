package com.foro_hub.foro_hub.domain.topico;

import com.foro_hub.foro_hub.domain.curso.Curso;
import com.foro_hub.foro_hub.domain.respuesta.Respuesta;
import com.foro_hub.foro_hub.domain.usuario.Usuario;

import java.time.LocalDateTime;
import java.util.List;

public record DatosRespuestaTopico(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Boolean estado,
        Usuario autor,
        Curso curso,
        List<Respuesta> respuestas
) {
}
