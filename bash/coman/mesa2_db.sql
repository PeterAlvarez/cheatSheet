create table tiempo(
	id_fecha varchar(15) not null,
	fecha date not null,
	dia_sem varchar(15) not null,
	dia_año integer,
	vacaciones varchar(10) ,
	fin_sem varchar(10),
	mes_anio varchar(15),
	sem_anio varchar(10),
	constraint id_F primary key (id_fecha)
)

create table sucursal(
	cod_Sucursal varchar(10) not null,
	nombre varchar(100) not null,
	provincia varchar(60),
	ciudad varchar(30) not null,
	dirreccion varchar(50) not null,
	cod_Postal integer default 0,
	telefono integer default 0,
	dirWeb varchar(100),
	constraint cod_S primary key (cod_Sucursal)
)

create table empleado(
	id_Empleado varchar(10) not null,
	cod_Sucursal varchar(10) not null,
	nombre varchar(100) not null,
	f_antiguedad date,
	foreign key (cod_Sucursal) references sucursal(cod_Sucursal),
	constraint id_E primary key (id_Empleado)
)

create table vehiculos(
	id_Vehiculo varchar(10) not null,
	matricula varchar(20) not null,
	modelo varchar(20) not null,
	categoria varchar(15) default 'No Definido',
	num_Seguro integer not null,
	precio varchar(15) ,
	cod_Sucursal varchar(10) not null,
	foreign key (cod_Sucursal) references sucursal(cod_Sucursal),
	constraint id_V primary key (id_Vehiculo)
)

create table ventas(
	id_fecha varchar(15) not null,
	id_Vehiculo varchar(10) not null,
	id_Cliente integer not null,
	cod_Sucursal varchar(10) not null,
	id_Empleado varchar(10) not null,
	precio varchar(15),
	foreign key (id_fecha) references tiempo(id_fecha), 		 --Ref_Tabla:: tiempo
	foreign key (id_Vehiculo) references vehiculos(id_Vehiculo), --Ref_Tabla:: vehiculos
	foreign key (id_Cliente) references cliente(id_Cliente),     --Ref_Tabla:: cliente
	foreign key (cod_Sucursal) references sucursal(cod_Sucursal),--Ref_Tabla:: sucursal
	foreign key (id_Empleado) references empleado(id_Empleado),	 --Ref_Tabla:: empleado
)



--II).  Realizar las siguiente Modificación a la Tabla.
-- 3) Realice la Inserción de 3 Registros a cada Tabla con las tablas relacionadas.

--Datos en Cliente
insert into cliente( id_Cliente , nombre , direccion , ciudad , pais , telefono )
values( 1035 , 'Juan Carlos Soto' , 'Calle Suipacha #245' , 'Tarija' , 'Bolivia' , 69631654 );
insert into cliente( id_Cliente , nombre , direccion , ciudad , pais , telefono )
values( 1036, 'Israel Alvarez' , 'Villa Dolores #007' , 'El Alto' , 'Bolivia' , 73073654);
insert into cliente( id_Cliente , nombre , direccion , ciudad , pais , telefono )
values( 1037, 'Eduin Castro' , 'Senilloza #007' , 'Buenos Aires' , 'Argentina' , 1135264589);

INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono)
VALUES (6254,'Carly R. Stevenson','Apartado núm.: 393, 5070 Per C/','Cartagena','Saint Barthélemy',83187208);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(8756,'Barbara F. Andrews','Apartado núm.: 594, 3638 Diam Calle','Augusta','Tokelau',35950613);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(9388,'Murphy A. Skinner','2021 Risus. Avenida','Houthalen','Malta',85222030);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(1102,'Melvin G. Powell','Apartado núm.: 428, 265 Donec C.','Magdeburg','Curaçao',92321950);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(2639,'Cora K. Randolph','1303 Leo. Carretera','Coalhurst','Monaco',70575124);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(4635,'Shad X. Hayden','405-5115 A, C/','Lauregno/Laurein','Panama',22469812);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(5358,'Florence Z. Huber','3723 Fames ','Minderhout','Kuwait',19563058);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(8896,'Phoebe T. Soto','493-5538 Aptent Ctra.','Hull','Djibouti',17439420);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(8591,'Damon Y. Joyce','Apartado núm.: 906, 8342 Leo. Av.','Sant''Agata sul Santerno','Nigeria',50553425);
INSERT INTO "cliente" (id_Cliente,nombre,direccion,ciudad,pais,telefono) VALUES
(2595,'Stewart B. Contreras','2061 Fringilla. Avda.','Portree','Tonga',65148882);

--Datos en tiempo
insert into tiempo( id_fecha , fecha , dia_sem , dia_año , mes_anio )
values( 'f_1023' ,'20/07/2020' , 'lunes' , 213 , 'julio' );
insert into tiempo( id_fecha , fecha , dia_sem , dia_año , mes_anio )
values( 'f_1024' ,'25/08/2020' , 'miercoles' , 243 , 'agosto' );
insert into tiempo( id_fecha , fecha , dia_sem , dia_año , mes_anio )
values( 'f_1025' ,'15/09/2020' , 'jueves' , 263, 'septiembre' );

-- Datos en sucursal
insert into sucursal( cod_Sucursal , nombre , ciudad , dirreccion , telefono , dirWeb )
values( 'su_123' ,'su_Atenas' , 'Tarija' , 'Mont Sr Font #568', 69625689 , 'https://www.ventaVehiculos.com/');
insert into sucursal( cod_Sucursal , nombre , ciudad , dirreccion , telefono , dirWeb )
values( 'su_124' ,'su_car' , 'El Alto' , 'Zona Satelite #598', 65684523 , 'https://www.ventaVehiculos.com/');
insert into sucursal( cod_Sucursal , nombre , ciudad , dirreccion , telefono , dirWeb )
values( 'su_125' ,'su_carroNuevo' , 'Buenos Aires' , 'Liniers #902', 112345986 , 'https://www.ventaVehiculos.com/');

-- Datos en empleado
insert into empleado( id_Empleado , cod_Sucursal , nombre , f_antiguedad  )
values( 'em_12' , 'su_123' ,'Efrain Alavi' , '20/07/2019');
insert into empleado( id_Empleado , cod_Sucursal , nombre , f_antiguedad  )
values( 'em_13' , 'su_124' ,'Alfredo Rocha' , '07/05/2020');
insert into empleado( id_Empleado , cod_Sucursal , nombre , f_antiguedad  )
values( 'em_14' , 'su_125' ,'Estefany Quisbert' , '07/01/2018');

-- Datos en vehiculos
insert into vehiculos( id_Vehiculo , matricula , modelo , categoria , num_Seguro , precio , cod_Sucursal )
values( 've_1523' , 'ABE123' ,'Fiat' , 'Automovil' , 12355 , '123000 Bs' , 'su_123' );
insert into vehiculos( id_Vehiculo , matricula , modelo , categoria , num_Seguro , precio , cod_Sucursal )
values( 've_1524' , 'AZP456' ,'Toyota' , 'Automovil' , 56321 , '150000 Bs' , 'su_124' );
insert into vehiculos( id_Vehiculo , matricula , modelo , categoria , num_Seguro , precio , cod_Sucursal )
values( 've_1525' , 'AAPE789' ,'Renault' , 'Automovil' , 9987455 , '389000 $' , 'su_125' );



create table vehiculos(
	id_Vehiculo varchar(10) not null,
	matricula varchar(20) not null,
	modelo varchar(20) not null,
	categoria varchar(15) default 'No Definido',
	num_Seguro integer not null,
	precio varchar(15) ,
	cod_Sucursal varchar(10) not null,
	foreign key (cod_Sucursal) references sucursal(cod_Sucursal),
	constraint id_V primary key (id_Vehiculo)
)


select * from vehiculos
select * from empleado
select * from sucursal
select * from tiempo
select * from cliente


--Adicionar una nueva columna en la tabla Vehículos el nuevo atributo Marca e inserte datos
alter table vehiculos











