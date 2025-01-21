package com.foro_hub.foro_hub.domain.respuesta;

import com.foro_hub.foro_hub.domain.topico.Topico;
import com.foro_hub.foro_hub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity(name = "Respuesta")
@Table(name = "respuestas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Respuesta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String mensaje;
    private LocalDateTime fecha_creacion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "autor_id")
    private Usuario autor;
    private String solucion;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "topico_id", nullable = false)//clave foranea con la que se relaciona
    private Topico topico;

    public Respuesta(DatosRegistrarRespuesta datosRegistrarRespuesta){
        this.mensaje = datosRegistrarRespuesta.mensaje();
        this.fecha_creacion = datosRegistrarRespuesta.fechaCreación();
        this.autor = datosRegistrarRespuesta.autor();
        this.solucion = datosRegistrarRespuesta.solucion();
        this.topico = datosRegistrarRespuesta.topico();
    }
}
