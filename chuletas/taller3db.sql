--tables main
create table cprocesos(
	codp   integer not null,
	nombre varchar(40) not null,
	enlace varchar(40) not null,
	ayuda  varchar(50),
	estado integer not null,
	constraint pk_cp primary key (codp)
)

create table cmenus (
	codm   integer not null,
	nombre varchar(40) not null,
	estado integer not null,
	constraint pk_cm primary key(codm)
)

create table croles(
	codr integer not null,
	nombre varchar(40) not null,
	estado integer not null,
	constraint pk_cr primary key(codr)
)

create table cpersonas(
	codp integer not null,
	nombre varchar(40) not null,
	ap varchar(40),
	am varchar(40),
	estado integer not null,
	fnac date not null,
	genero varchar(1) not null,
	direc varchar(50),
	celular varchar(20),
	foto varchar(30),
	ecivil varchar(1) not null,
	--login not null
	--password not null
	constraint pk_cpe primary key(codp)
)

create table cdatos(
	login varchar(10) not null,
	codp integer,
	estado integer not null,
	password varchar(200) not null,
	constraint pk_lo primary key(login),
	foreign key(codp) references cpersonas(codp)
)

create table mepro(
	codm integer not null,
	foreign key (codm) references cmenus(codm), --REF:MENUS
	codp integer not null,
	foreign key (codp) references cprocesos(codp), --REF:PROCESOS
	primary key (codm , codp)
)

create table rolme(
	codr integer not null,
	foreign key (codr) references croles(codr), --REF:ROLES
	codm integer not null,
	foreign key (codm) references cmenus(codm), --REF:MENUS
	primary key (codr , codm)
)

create table usurol(
	codr integer not null,
	foreign key (codr) references croles(codr), --REF:ROLES
	login varchar(10) not null,
	foreign key (login) references cdatos(login), --REf:DATOS
	primary key (codr , login)
)


--set datos
--MENUS
insert into cmenus ( codm , nombre , estado ) values ( 1 , 'ALUMNO' , 1 );
insert into cmenus ( codm , nombre , estado ) values ( 2 , 'DOCENTES' , 1 );
insert into cmenus ( codm , nombre , estado ) values ( 3 , 'MATERIAS' , 1 );
insert into cmenus ( codm , nombre , estado ) values ( 4 , 'TUTORES' , 1 );
insert into cmenus ( codm , nombre , estado ) values ( 5 , 'PROYECTOS' , 1 );
insert into cmenus ( codm , nombre , estado ) values ( 6 , 'CONFIGURAR' , 1);

--PROCESOS
insert into cprocesos ( codp , nombre , enlace , ayuda ,estado )
values ( 1 , 'Backup de datos' , '' , 'Backup de datos' , 1 );
insert into cprocesos ( codp , nombre , enlace , ayuda ,estado )
values ( 2 , 'Reportes de Personal' , '' , 'Reportes' , 1 );
insert into cprocesos ( codp , nombre , enlace , ayuda ,estado )
values ( 3 , 'Controladores' , '' , 'Controladores' , 1 );
insert into cprocesos ( codp , nombre , enlace , ayuda ,estado )
values ( 4 , 'Gestion Alumnos' , '' , 'Gestion Alumnos' , 1 );
insert into cprocesos ( codp , nombre , enlace , ayuda ,estado )
values ( 5 , 'Reporte de Alumnos' , '' , 'Reporte de Alumnos' , 1 );
insert into cprocesos ( codp , nombre , enlace , ayuda ,estado )
values ( 6 , 'Proyectos Alumnos' , '' , 'Proyectos Alumnos' , 1 );
insert into cprocesos ( codp , nombre , enlace , ayuda ,estado )
values ( 7 , 'Taller III' , '' , 'Tesis' , 1 );


--MEPRO  
insert into mepro ( codm , codp ) values ( 6 , 1 );
insert into mepro ( codm , codp ) values ( 6 , 2 );
insert into mepro ( codm , codp ) values ( 6 , 3 );
insert into mepro ( codm , codp ) values ( 1 , 4 );
insert into mepro ( codm , codp ) values ( 1 , 5 );
insert into mepro ( codm , codp ) values ( 5 , 6 );
insert into mepro ( codm , codp ) values ( 3 , 7 );

--croles
insert into croles ( codr , nombre , estado ) values (1 , 'Jurado',1 );
insert into croles ( codr , nombre , estado ) values (2 , 'Alumno',1 );
insert into croles ( codr , nombre , estado ) values (3 , 'Docente',1);

--rolme
insert into rolme ( codr , codm ) values ( 1 , 1);
insert into rolme ( codr , codm ) values ( 1 , 5);
insert into rolme ( codr , codm ) values ( 2 , 1);
insert into rolme ( codr , codm ) values ( 2 , 3);
insert into rolme ( codr , codm ) values ( 3 , 4);
insert into rolme ( codr , codm ) values ( 3 , 3);

--Presentacion 2

insert into cpersonas ( codp , nombre, ap , estado ,fnac, genero , ecivil  )
values (96203 , 'Peter' , 'Alvarez', 1 , '2020-01-29','M','S');
insert into cpersonas ( codp , nombre, ap , estado ,fnac, genero , ecivil  )
values (96204 , 'Israel' , 'Castro', 1 , '2020-01-29','M','S');

insert into cdatos ( login, codp, estado, password )
values ( 'Peter' , 96203, 1, '123456' );
insert into cdatos ( login, codp, estado, password )
values ( 'Israel' , 96204, 1, '123' );


select * from cpersonas
select * from cdatos
select * from mepro

