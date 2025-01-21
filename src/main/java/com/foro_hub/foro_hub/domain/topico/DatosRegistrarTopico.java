package com.foro_hub.foro_hub.domain.topico;

import com.foro_hub.foro_hub.domain.curso.Curso;
import com.foro_hub.foro_hub.domain.respuesta.Respuesta;
import com.foro_hub.foro_hub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.List;

public record DatosRegistrarTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        LocalDateTime fecha_creacion,
        @NotNull
        Boolean estado,
        @NotNull
        Usuario autor,
        @NotNull
        Curso curso,
        @NotNull
        List<Respuesta> respuestas
) {
}
