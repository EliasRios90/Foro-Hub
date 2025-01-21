package com.foro_hub.foro_hub.domain.usuario;

import jakarta.validation.constraints.NotBlank;

public record DatosRegistrarUsuario(
        @NotBlank
        String nombre,
        @NotBlank
        String email,
        @NotBlank
        String contrasenia
) {
}
