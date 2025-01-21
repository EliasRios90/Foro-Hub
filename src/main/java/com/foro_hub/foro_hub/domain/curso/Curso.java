package com.foro_hub.foro_hub.domain.curso;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "Curso")
@Table(name = "cursos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    public Curso(DatosRegistrarCurso datosRegistrarCurso){
        this.nombre = datosRegistrarCurso.nombre();
        this.categoria = datosRegistrarCurso.categoria();
    }
}
