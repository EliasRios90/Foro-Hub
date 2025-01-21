create table respuestas(
    id bigint not null auto_increment,
    mensaje text not null,
    fecha_creacion datetime not null,
    autor_id bigint not null,
    solucion text not null,

    primary key(id),
    constraint fk_respuestas_autor_id foreign key(autor_id) references usuarios(id)
);