-- 1.- Crear las Siguientes Tablas, con las siguientes tipos de datos.
--Resp 1.
create table usuario(
	ci integer not null,
	nombre varchar(100)not null,
	direccion varchar(30),
	telefono integer,
	constraint pk_ci primary key (ci)
)

create table libro(
	codigo varchar(20) not null,
	titulo varchar(50) not null,
	autor varchar(50),
	obser varchar(100),
	cantidad smallint not null,
	constraint pk_cl primary key (codigo)
)

create table prestamo(
	num_prestamo integer not null,
	f_prestamo date not null,
	f_devolucion date,
	ci integer not null,
	codigo varchar(20)not null,
	foreign key (ci) references usuario(ci), --REF:USUARIO
	foreign key (codigo) references libro(codigo), --REF:LIBRO
	primary key ( ci , codigo )
)

-- 2.- Insertar datos a cada una de las tablas creadas en sql postgresql.
--Resp 2.

--RELLENAMOS LA TABLA USUARIO
insert into usuario( ci , nombre , direccion , telefono )
values( 5467324 , 'Pedro Pérez' , 'calle Suipacha #223' , 6648942 );
insert into usuario( ci , nombre , direccion , telefono )
values( 10023695, 'Peter Alvarez' , 'Av. La Paz #234' , 73359206 );
insert into usuario( ci , nombre , direccion , telefono )
values( 10265980 , 'Hugo Aiza' , 'Av. Mont Señor Font #456' , 76289423 );
insert into usuario( ci , nombre , direccion , telefono )
values( 65641239, 'Ronal Cruz' , 'Av. La Gamoneda #567' , 73256987 );

--RELLENAMOS LA TABLA LIBRO
insert into libro( codigo , titulo , autor , obser , cantidad )
values( 'LIB_34', 'Bases de Datos Distribuidas' , 'Juan Date' , 'Libro Nuevo', 7 );
insert into libro( codigo , titulo , autor , obser , cantidad )
values( 'LIB_35', 'Fisica Mecanica' , 'Alfredo Alvarez' , 'Libro semi Nuevo', 3 );
insert into libro( codigo , titulo , autor , obser , cantidad )
values( 'LIB_36', 'Algoritmos y Programas' , 'Alcides Velasquez' , 'Libro Antiguo', 5 );
insert into libro( codigo , titulo , autor , obser , cantidad )
values( 'LIB_37', 'Introduccion a Java' , 'Manuel Torres' , 'Libro poco requerido', 9 );


--RELLENAMOS LA TABLA PRESTAMOS
insert into prestamo( num_prestamo , f_prestamo , f_devolucion , ci , codigo )
values( 26 , '20/06/2019' , '20/07/2019' , 5467324 , 'LIB_34' );
insert into prestamo( num_prestamo , f_prestamo , f_devolucion , ci , codigo )
values( 30 , '10/08/2020' , '10/09/2020' , 10023695 , 'LIB_35' );
insert into prestamo( num_prestamo , f_prestamo , f_devolucion , ci , codigo )
values( 33 , '15/09/2020' , '15/10/2020' , 10265980 , 'LIB_36' );
insert into prestamo( num_prestamo , f_prestamo , f_devolucion , ci , codigo )
values( 40 , '25/05/2020' , '25/06/2020' , 65641239 , 'LIB_37' );


-- 3.- Modificar  Datos.
--Resp 3.
-- A)
update prestamo set f_devolucion = '15/07/2019'
where ci = 5467324

-- B)
update libro set titulo = 'Programación en Bases de Datos'
where codigo = 'LIB_34'

-- C)
update libro set autor = 'Andrey Jacobs'
where codigo = 'LIB_34'

-- D)
update usuario set nombre = 'Mario Perales'
where ci = 5467324


-- 4.- Eliminar los Datos
--Resp 4.
-- A)
alter table libro drop column cantidad

-- B)
alter table usuario drop column telefono

-- C)
select * from libro order by titulo desc

-- D)
SELECT * FROM libro WHERE titulo like 'P%'
--listamos libros que terminen con la letra s
SELECT * FROM libro WHERE titulo like '%s'

-- 5.Enlazar Tablas
--Resp 5.
-- D)
SELECT count(f_prestamo) FROM prestamo



select * from usuario
select * from libro
select * from prestamo













-- 2.-

































-- 2.-































