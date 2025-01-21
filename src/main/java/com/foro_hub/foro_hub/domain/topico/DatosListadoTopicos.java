package com.foro_hub.foro_hub.domain.topico;

import com.foro_hub.foro_hub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosListadoTopicos(
        Long id,
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        String nombreAutor
) {
        public DatosListadoTopicos(Topico topico){
                this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha_creacion(), topico.getAutor().getNombre());
        }
}
