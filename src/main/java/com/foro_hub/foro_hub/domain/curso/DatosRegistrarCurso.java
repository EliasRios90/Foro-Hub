package com.foro_hub.foro_hub.domain.curso;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DatosRegistrarCurso(
        @NotBlank
        String nombre,
        @NotNull
        Categoria categoria
) {
}
