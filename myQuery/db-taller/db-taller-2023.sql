CREATE table personas(
    seq_persona serial not null,
    cedula_identidad varchar(15),
    nombres varchar(40) not null,
    apellido_paterno varchar(40) not null,
    apellido_materno varchar(40),
    fotografia varchar(255),
    telefono_celular varchar(20),
    cod_tipo varchar(1) not null,
    cod_estado integer  default 1,
    constraint seq_p PRIMARY KEY (seq_persona)
);


insert into personas VALUES (1, '10025234', 'Israel', 'Alvarez', 'Castro', '', '69621635', 'A', 1 );
insert into personas VALUES (2, '10025234', 'Peter', '', 'Castro', '', '69621635', 'A' );

SELECT * from personas;

--====================== usuarios ==================================
create table usuarios(
    usuario varchar(20) not null,
    contrasenia varchar(200) not null,
    seq_persona serial not null,
    cod_estado integer default 1,
    foreign key (seq_persona) references personas,
    constraint pk_u PRIMARY KEY (usuario)
);

insert into usuarios values ('Israel', '123456', 1, 1);
insert into usuarios values ('Tux', '123123', 2, 1);

select * from usuarios;

--=======================Tiene=================================

create table tiene(
    usuario varchar(20) not null,
    id_rol integer not null,
    foreign key (usuario) references usuarios(usuario),
    foreign key (id_rol) references roles(id_rol)
);

select * from tiene;


insert into tiene values('Israel', 1000);
insert into tiene values('Tux', 1002);

--=======================Roles=================================

create table roles(
    id_rol integer not null,
    nombre varchar(40) not null,
    cod_estado integer default 1 not null,
    constraint pk_idrol primary key (id_rol)
);

insert into roles values( 1000, 'administrativo', 1);
insert into roles values( 1001, 'tecnico', 1);
insert into roles values( 1002, 'planificado', 1);
insert into roles values( 1003, 'cliente', 1);

select * from roles;

