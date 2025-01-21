package com.foro_hub.foro_hub.domain.usuario;

public record DatosListadoUsuarios(
        String nombre,
        String email
) {
    public DatosListadoUsuarios(Usuario usuario){
        this(usuario.getNombre(), usuario.getEmail());
    }
}
