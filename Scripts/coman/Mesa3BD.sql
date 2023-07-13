create table departamento(
	depto_id varchar(15) not null,
	director varchar(60),
	descripcion varchar(100),
	constraint pk_depto primary key (depto_id)
)

create table profesor(
	prof_id varchar(15) not null,
	nombre varchar(60) not null,
	direccion varchar(60),
	telefono integer,
	constraint pk_prof primary key (prof_id)
)


create table curso(
	curso_id varchar(15) not null,
	nombre varchar(60) not null,
	desccripcion varchar(100),
	constraint pk_curso primary key (curso_id)
)

--Enlaces
create table depto_profesor(
	prof_id varchar(15) not null,
	depto_id varchar(15) not null,
	foreign key (prof_id) references profesor(prof_id)			--ref:: profesor
	foreign key (depto_id) references departamento(depto_id)	--ref:: departamento
)

create table depto_profesor(
	curso_id varchar(15) not null,
	prof_id varchar(15) not null,
	foreign key (curso_id) references curso(curso_id)	--ref:: departamento
	foreign key (prof_id) references profesor(prof_id)			--ref:: profesor
)