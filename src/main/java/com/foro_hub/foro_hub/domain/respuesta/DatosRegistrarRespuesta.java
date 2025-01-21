package com.foro_hub.foro_hub.domain.respuesta;

import com.foro_hub.foro_hub.domain.topico.Topico;
import com.foro_hub.foro_hub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosRegistrarRespuesta(
        @NotBlank
        String mensaje,
        @NotNull
        Topico topico,
        @NotNull
        LocalDateTime fechaCreación,
        @NotNull
        Usuario autor,
        @NotBlank
        String solucion
) {
}
