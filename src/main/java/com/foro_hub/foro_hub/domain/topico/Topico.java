package com.foro_hub.foro_hub.domain.topico;

import com.foro_hub.foro_hub.domain.curso.Curso;
import com.foro_hub.foro_hub.domain.respuesta.Respuesta;
import com.foro_hub.foro_hub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity(name = "Topico")
@Table(name = "topicos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha_creacion;
    private Boolean estado;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "autor_id", nullable = false)
    private Usuario autor;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "curso_id", nullable = false)
    private Curso curso;
    @OneToMany(mappedBy = "topico")
    private List<Respuesta> respuestas;

    public Topico(DatosRegistrarTopico datosRegistrarTopico){
        this.titulo = datosRegistrarTopico.titulo();
        this.mensaje = datosRegistrarTopico.mensaje();
        this.fecha_creacion = datosRegistrarTopico.fecha_creacion();
        this.estado = datosRegistrarTopico.estado();
        this.autor = datosRegistrarTopico.autor();
        this.curso = datosRegistrarTopico.curso();
        this.respuestas = datosRegistrarTopico.respuestas();
    }

    public void actualizarTopico(DatosActualizarTopico datosActualizarTopico){
        if(datosActualizarTopico.titulo() != null){
            this.titulo = datosActualizarTopico.titulo();
        }
        if(datosActualizarTopico.mensaje() != null){
            this.mensaje = datosActualizarTopico.mensaje();
        }
    }

    public void desactivarTopico() {
        this.estado = false;
    }
}
