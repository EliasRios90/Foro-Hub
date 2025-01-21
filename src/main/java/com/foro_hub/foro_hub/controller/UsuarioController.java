package com.foro_hub.foro_hub.controller;

import com.foro_hub.foro_hub.domain.usuario.DatosListadoUsuarios;
import com.foro_hub.foro_hub.domain.usuario.DatosRegistrarUsuario;
import com.foro_hub.foro_hub.domain.usuario.Usuario;
import com.foro_hub.foro_hub.domain.usuario.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public void registrarUsuario(@RequestBody @Valid DatosRegistrarUsuario datosRegistrarUsuario){
        usuarioRepository.save(new Usuario(datosRegistrarUsuario));
    }

    /*@GetMapping
    public List<DatosListadoUsuarios> listadoUauarios(){
        return usuarioRepository.findAll().stream().map(DatosListadoUsuarios::new).toList();
    }*/

    @GetMapping
    public Page<DatosListadoUsuarios> listadoUauarios(@PageableDefault(size = 3) Pageable paginacion){
        return usuarioRepository.findAll(paginacion).map(DatosListadoUsuarios::new);
    }
}
