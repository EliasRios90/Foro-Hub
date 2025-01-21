create table topicos(
    id bigint not null auto_increment,
    titulo varchar(500) not null,
    mensaje text not null,
    fecha_creacion datetime not null,
    estado tinyint(1) not null,
    autor_id bigint not null,
    curso_id bigint not null,
    respuestas_id bigint not null,

    primary key(id),
    constraint fk_topicos_autor_id foreign key(autor_id) references usuarios(id),
    constraint fk_topicos_curso_id foreign key(curso_id) references cursos(id),
    constraint fk_topicos_respuestas_id foreign key(respuestas_id) references respuestas(id)
);