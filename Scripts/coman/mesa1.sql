 --a)
 
 --CLIENTE=(NUMERO DE CLIENTE, NOMBRE, CRÉDITO, DIRECCIÓN, TELÉFONO )
 create table cliente(
 	numCliente integer not null primary key,
	nombre varchar(100) not null,
	credito varchar(15),
	direccion varchar(60) not null,
 	telefono integer
 )
 
 --OFICINA=(NUMERO DE OFICINA,, CIUDAD, DEPARTAMENTO, TELÉFONO)
 create table oficina (
 	numOficina integer not null primary key,
	ciudad varchar(60),
	departamento varchar(15) not null,
	telefono integer not null
 )
 
--REPRESENTANTE=(NUMERO DE EMPLEADO, NOMBRE, EDAD)
 create table representante(
 	numEmpleado integer not null primary key,
	nombre varchar(100) not null,
	edad integer
 )
 
 --PRODUCTO=(CODIGO DE PRODUCTO,DESCRIPCION, UNIDAD)
create table producto(
	codProducto varchar(15) not null primary key,
	descripcion varchar(30),
	unidad varchar(30) not null
)
 
 --PEDIDO=(NUMERO DE PEDIDO, FECHA DE PEDIDO)
 create table pedido(
	numPedido integer not null primary key,
	fechaPedido date
)

 --DETALLE=(CANTIDAD, MONTO)
create table detalle(
	cantidad integer not null primary key,
	monto varchar(15) not null
)

-- b) Tipos de RelaciónLo dejamos a medias
 TRABAJA=(REPRESENTANTE, OFICINA)
 
create table trabaja(
	numOficina integer not null,
	foreign key (numOficina) references oficina(numOficina),
	
	numEmpleado integer not null,
	foreign key (numEmpleado) references representante(numEmpleado)
)

insert into trabaja ( numOficina ,  numEmpleado ) 
values ( 3 , 2 )

--consultar todas los Oficinas con sus respectivos Representantes
select * from trabaja 
inner join oficina
on trabaja.numOficina = oficina.numOficina
inner join representante
on trabaja.numEmpleado = representante.numEmpleado

select * from cliente
select * from oficina
select * from representante
select * from producto
select * from pedido
select * from detalle

 create table oficina (
 	numOficina integer not null primary key,
	ciudad varchar(60),
	departamento varchar(15) not null,
	telefono integer not null
 )
 
--REPRESENTANTE=(NUMERO DE EMPLEADO, NOMBRE, EDAD)
 create table representante(
 	numEmpleado integer not null primary key,
	nombre varchar(100) not null,
	edad integer
 )



--C) Insertar datos a una tabla
--Cliente
insert into cliente ( numCliente ,  nombre , credito , direccion , telefono ) 
values ( 01 , 'Pedro Gómez', '230 Bs' , 'Calle Uriondo #212' , 72945789 )
insert into cliente ( numCliente ,  nombre , credito , direccion , telefono ) 
values ( 02 , 'Kathia Martinez', '2500 Bs' , 'San Jorge #231' , 74516656 )

--Oficina
insert into oficina ( numOficina , ciudad , departamento , telefono )
values ( 3 , 'Entre Rios' , 'Tarija' , 66453214 )
insert into oficina ( numOficina , ciudad , departamento , telefono )
values ( 5 , 'El Alto' , 'La Paz' , 730736512 )

--representante
insert into representante ( numEmpleado , nombre , edad )
values ( 2 , 'Julio Portal' , 36 )
insert into representante ( numEmpleado , nombre , edad )
values ( 3 , 'Juan Perez' , 40 )

 
 --producto
insert into producto ( codProducto , descripcion , unidad )
values ( 'Prod_012' , 'Hojas de Papel Bonn' , '1resma de 500 hojas' )
insert into producto ( codProducto , descripcion , unidad )
values ( 'Prod_015' , 'Hojas de Papel Carta' , '1resma de 1000 hojas' )

--pedido
insert into  pedido ( numPedido , fechaPedido )
values ( 13 , '12-07-2017' )
insert into  pedido ( numPedido , fechaPedido )
values ( 15 , '07-05-2021' )

--detalle
insert into  detalle ( cantidad , monto )
values ( 1 , '30 Bs' )
insert into  detalle ( cantidad , monto )
values ( 2 , '320 Bs' )


--D)
--Eliminar los atributo Dirección de la Tabla CLIENTE
alter table cliente drop column direccion

--Eliminar los atributos Departamento de la tabla OFICINA
alter table oficina drop column departamento
 
 --Listar de manera DESC de la tabla PRODUCTO
select * from producto order by unidad desc
 
 --Listar a todos los Clientes que sus nombres empiecen con la letra ‘P’.
select * from cliente where nombre like 'P%'
select * from representante where nombre like '%z'

--Listar las Pedidos Ordenadas de manera ASC.
select * from pedido order by numPedido asc

--Eliminar el Atributo Unidad de la Tabla PRODUCTO.
alter table producto drop column unidad




--V)

--consultar todas los Oficinas con sus respectivos Representantes
select * from trabaja 
inner join oficina
on trabaja.numOficina = oficina.numOficina
inner join representante
on trabaja.numEmpleado = representante.numEmpleado




--consultas varias
select * from cliente
select * from oficina
select * from representante
select * from producto
select * from pedido
select * from detalle
 
 
 
 
 
 
 
 