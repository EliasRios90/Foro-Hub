package com.foro_hub.foro_hub.controller;

import com.foro_hub.foro_hub.domain.curso.Curso;
import com.foro_hub.foro_hub.domain.curso.CursoRepository;
import com.foro_hub.foro_hub.domain.curso.DatosRegistrarCurso;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoRepository cursoRepository;

    @PostMapping
    public void registrarCursos(@RequestBody @Valid DatosRegistrarCurso datosRegistrarCurso){
        cursoRepository.save(new Curso(datosRegistrarCurso));
    }
}
