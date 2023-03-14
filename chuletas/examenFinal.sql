-----I.- Crear las Siguientes Tablas, con las siguientes tipos de datos.-----
create table paciente(
	ci integer not null,
	nombre varchar(100)not null,
	direccion varchar(30),
	telefono integer,
	fechanac date not null,
	constraint pk_ci primary key (ci)
)

create table medico (
	coddoc varchar(10) not null,
	nombre varchar(100) not null,
	telefono integer,
	direccion varchar(30),
	especialidad varchar(30),
	constraint pk_cd primary key (coddoc)
)

create table consulta(
	numero integer not null,
	fecha date,
	monto varchar(15),
	coddoc varchar(10) not null,
	ci integer not null,
	constraint pk_nu primary key (numero),
	foreign key (coddoc) references medico(coddoc), --ref:: medico
	foreign key (ci) references paciente(ci)	--ref:: paciente
)

create table medicamento(
	codmed varchar(10) not null,
	descripcion varchar(50) not null,
	unidad integer,
	clase varchar(30),
	constraint pk_cm primary key (codmed)
)

create table receta(
	numerorec integer not null,
	cantidad varchar(10) not null,
	frecuencia varchar(10),
	codmed varchar(10) not null,
	constraint pk_nr primary key (numerorec),
	foreign key (codmed) references medicamento(codmed)--Ref:: Medicamento
)

------ II.- Insertar datos a cada una de las tablas creadas en sql postgrest. --------

--Datos paciente
insert into paciente( ci , nombre , direccion , telefono , fechanac )
values( 5834562 , 'Juan Carlos Soto' , 'Calle Suipacha #245' , 6645678 , '23/05/1989' );
insert into paciente( ci , nombre , direccion , telefono , fechanac )
values( 1002523 , 'Israel Alvarez' , 'Juan XXIII #869' , 69621635 , '10/05/1996' );

--Datos medicos
insert into medico( coddoc , nombre , telefono , direccion , especialidad )
values( 'DOC04' , 'Pedro Gonzales' , 6663024 , 'Av. Víctor Paz Estensoro #234' , 'Cirujano' );
insert into medico( coddoc , nombre , telefono , direccion , especialidad )
values( 'DOC05' , 'Candelaria Aiza' , 1234567 , 'Av. La Paz #326' , 'General' );

--Datos consulta
insert into consulta( numero , fecha , monto , coddoc , ci )
values( 10 , '20/07/2020' , '80 Bs' , 'DOC04' , 5834562 );
insert into consulta( numero , fecha , monto , coddoc , ci )
values( 11 , '30/08/2020' , '120 Bs' , 'DOC05' , 1002523 );

--Datos medicamento
insert into medicamento( codmed , descripcion , unidad , clase  )
values( 'MED09' , 'Ibuprofeno de 100ML' , 1 , 'Antiinflamatorio' );
insert into medicamento( codmed , descripcion , unidad , clase  )
values( 'MED10' , 'Ivermectrina de 500ML' , 5 , 'Antiparasitario' );


--Datos receta
insert into receta( numerorec , cantidad , frecuencia , codmed  )
values( 10 , '8ML' , 'Cada 8 Horas' , 'MED09' );
insert into receta( numerorec , cantidad , frecuencia , codmed  )
values( 15 , '10ML' , 'Cada 30 Dias' , 'MED10' );



select * from paciente
select * from medico
select * from consulta
select * from medicamento
select * from receta


----------  III.- Modificar  Datos. ----------------
--a) Mod Nombre del PACIENTE (‘5834562’, ‘Julio Gutiérrez López’, ‘Calle Suipacha#245’,’6645678’).
update paciente set nombre = 'Julio Gutiérrez López'
where ci = 5834562

--b) Adicionar en la nueva atributo en la Tabla CONSULTA
--con el nuevo atributo Descuento e inserte datos a dicho atributo.
alter table consulta add descuento varchar(10);

--vendriamos a poner el valor en pocentaje del descuento
update consulta set descuento = '15 %'
where numero = 10
update consulta set descuento = '30 %'
where numero = 11

--c) Modificar en la Tabla de RECETA por la cantidad ‘5ML’  y la Frecuencia ‘Cada 6 Horas’)
update receta set cantidad = '5ML' , frecuencia = 'Cada 6 Horas'
where numerorec = 10

--d) Insertar una nueva columna o atributo en la Tabla MEDICAMENTO, Laboratorio)
alter table medicamento add laboratorio varchar(20);

--e) Modificar la Tabla de MEDICO con nuevos atributos con el Teléfono y Dirección con nuevos Datos)
update medico set telefono = 73067307 , direccion = 'Av. Heroes del Chaco # 1238'
where coddoc = 'DOC05'
update medico set telefono = 62635921 , direccion = 'Av. La Agamoneda #123'
where coddoc = 'DOC04'

select * from paciente
select * from medico
select * from consulta
select * from medicamento
select * from receta

------------ IV.- Eliminar los Datos ------------
--a) Eliminar los atributo Teléfono de la Tabla PACIENTE
alter table paciente drop column telefono;

--b) Eliminar los atributos de la Tabla RECETA, la CANTIDAD
alter table receta drop column cantidad;

--c) Listar de manera DESC de la tabla CONSULTAS.
select * from consulta order by numero desc;

--d) Listar a todos los Clientes que sus nombres empiecen con la letra ‘J’.
select * from paciente where nombre like 'J%'

--e) Listar las Medicamentos Ordenadas de manera ASC.
select * from medicamento order by codmed asc;

--f) Eliminar el Atributo Dirección de la Tabla MEDICO.
alter table medico drop column direccion;

--------- V.- Enlazar Tablas ---------
--a) Seleccionar los Pacientes que consultaron en el mes de Julio del Año 2020.
select * from consulta where fecha between '2020-07-01' and '2020-07-31'

--b) Mostrar el Número de Consulta, el Nombre del Paciente y el Nombre del Doctor.

--c) Mostrar el Nombre de los Medicamentos de la Receta’10’.
select * from medicamento where codmed like '%10'

--d) Los números de Consulta y Fechas de Consulta del Paciente ‘Julio Gutiérrez López’.

--e) El nombre de los Médicos que tuvieron consulta el mes de Julio del 2020.

--f) Cree una Restricción con clave y Usuario del Paciente.

select * from paciente
select * from medico
select * from consulta
select * from medicamento
select * from receta








--------- V.- Enlazar Tablas ---------
--a) Seleccionar los Pacientes que consultaron en el mes de Julio del Año 2020.
select * from consulta where fecha between '2020-07-01' and '2020-07-31'

--b) Mostrar el Número de Consulta, el Nombre del Paciente y el Nombre del Doctor.
select numero, paciente.nombre , medico.nombre from consulta
inner join paciente
on consulta.ci = paciente.ci
inner join medico
on consulta.coddoc = medico.coddoc

--c) Mostrar el Nombre de los Medicamentos de la Receta’10’.
select numerorec , descripcion from receta
inner join medicamento
on receta.codmed = medicamento.codmed
and receta.numerorec = 10

--d) Los números de Consulta y Fechas de Consulta del Paciente ‘Julio Gutiérrez López’.
select numero, consulta.fecha , nombre from consulta
inner join paciente
on consulta.ci = paciente.ci
and paciente.nombre = 'Julio Gutiérrez López'

--e) El nombre de los Médicos que tuvieron consulta el mes de Julio del 2020.
select nombre , consulta.fecha from consulta
inner join medico
on consulta.coddoc = medico.coddoc
and fecha between '2020-07-01' and '2020-07-31'

--f) Cree una Restricción con clave y Usuario del Paciente.
alter table paciente add password  varchar(15) not null default 'usuario';

































































































