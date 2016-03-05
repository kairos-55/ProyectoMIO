/*
	INTEGRANTES:
		     Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 		     Martha Cecilia Holguin Tovar. Código: 1129455
 		     Jesús Alberto Ramírez Otálvaro. Código: 1422554
*/

----------------------------------------------------------------------

DROP TABLE IF EXISTS empleado CASCADE;

CREATE TABLE empleado
(
	cedula_empleado VARCHAR(20) NOT NULL,
	salario DOUBLE PRECISION NOT NULL,
	nombres VARCHAR(30) NOT NULL,
	apellidos VARCHAR(30) NOT NULL,
	telefono VARCHAR(10),
	fecha_nacimiento DATE,
	estado_civil VARCHAR(13),
	cargo VARCHAR(12) NOT NULL,
	estado_empleado  BOOLEAN NOT NULL,

	CONSTRAINT empleado_pk PRIMARY KEY (cedula_empleado)
);

----------------------------------------------------------------------

DROP TABLE IF EXISTS estacion CASCADE;

CREATE TABLE estacion
(
	id_estacion INTEGER NOT NULL,
        nombre_estacion VARCHAR(20),
	direccion VARCHAR(50) NOT NULL,
	cedula_empleado VARCHAR(20) NOT NULL,	
	estado_estacion BOOLEAN NOT NULL,

	CONSTRAINT estacion_pk PRIMARY KEY (id_estacion),
        
        CONSTRAINT estacion_fk FOREIGN KEY (cedula_empleado) 
	REFERENCES empleado (cedula_empleado)
	
);

----------------------------------------------------------------------

DROP TABLE IF EXISTS recorrido CASCADE;

CREATE TABLE recorrido
(
	id_recorrido INTEGER NOT NULL,
	nombre VARCHAR(20) NOT NULL,
	estado_recorrido BOOLEAN NOT NULL,

	CONSTRAINT recorrido_pk PRIMARY KEY (id_recorrido)
);

----------------------------------------------------------------------

DROP TABLE IF EXISTS parada CASCADE;

CREATE TABLE parada
(

	id_recorrido INTEGER NOT NULL,
	id_estacion INTEGER NOT NULL,
	
	CONSTRAINT parada_pk PRIMARY KEY (id_recorrido, id_estacion),

	CONSTRAINT parada_fk1 FOREIGN KEY (id_recorrido)
	REFERENCES recorrido (id_recorrido),

	CONSTRAINT parada_fk2 FOREIGN KEY (id_estacion)
	REFERENCES estacion (id_estacion)
);

----------------------------------------------------------------------

DROP TABLE IF EXISTS ruta CASCADE;

CREATE TABLE ruta
(
	nombre_ruta VARCHAR(4) NOT NULL,
	id_recorrido INTEGER NOT NULL,	
	estado_ruta BOOLEAN NOT NULL,	

	CONSTRAINT ruta_pk PRIMARY KEY (nombre_ruta),

	CONSTRAINT ruta_fk FOREIGN KEY (id_recorrido)
	REFERENCES recorrido (id_recorrido)
);

----------------------------------------------------------------------

DROP TABLE IF EXISTS tarjeta CASCADE;

CREATE TABLE tarjeta
(
	id_tarjeta INTEGER NOT NULL,
	saldo DOUBLE PRECISION NOT NULL,	
	cedula_empleado VARCHAR(20) NOT NULL,
	fecha_venta DATE DEFAULT CURRENT_DATE,
	hora_venta VARCHAR(5) NOT NULL,
	estado_tarjeta VARCHAR(20) NOT NULL,

	CONSTRAINT tarjeta_pk PRIMARY KEY (id_tarjeta),

	CONSTRAINT tarjeta_fk FOREIGN KEY (cedula_empleado) 
	REFERENCES empleado (cedula_empleado)
);

---------------------------------------------------------------------

DROP TABLE IF EXISTS usuario CASCADE;

CREATE TABLE usuario
(
	cedula_usuario VARCHAR(20) NOT NULL,
	id_tarjeta INTEGER NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	telefono VARCHAR(10),
	direccion VARCHAR(50),
	estado_usuario BOOLEAN NOT NULL,
	
	CONSTRAINT usuario_pk PRIMARY KEY (cedula_usuario),

	CONSTRAINT usuario_fk FOREIGN KEY (id_tarjeta)
	REFERENCES tarjeta (id_tarjeta)
);

---------------------------------------------------------------------

DROP TABLE IF EXISTS bus CASCADE;

CREATE TABLE bus
(
	placa_bus VARCHAR(20) NOT NULL,
	modelo VARCHAR(4),
	marca VARCHAR(20),
	capacidad INTEGER,
	tipo VARCHAR(13) NOT NULL,		
	estado_bus BOOLEAN NOT NULL,

	CONSTRAINT bus_pk PRIMARY KEY (placa_bus)
);

---------------------------------------------------------------------

DROP TABLE IF EXISTS tarjeta_bus CASCADE;

CREATE TABLE tarjeta_bus
(
	id_tarjeta INTEGER NOT NULL,
	placa_bus VARCHAR(20) NOT NULL,
	fecha DATE NOT NULL,
	hora VARCHAR(5) NOT NULL,

	CONSTRAINT tarjeta_bus_pk PRIMARY KEY (id_tarjeta, placa_bus, fecha, hora),

	CONSTRAINT tarjeta_bus_fk1 FOREIGN KEY (id_tarjeta)
	REFERENCES tarjeta (id_tarjeta),

	CONSTRAINT tarjeta_bus_fk2 FOREIGN KEY (placa_bus)
	REFERENCES bus (placa_bus)
);

DROP TABLE IF EXISTS pqrs CASCADE;

CREATE TABLE pqrs
(
	id_pqrs INTEGER NOT NULL,
	id_estacion INTEGER NOT NULL,	
	fecha DATE NOT NULL,
	motivo VARCHAR(100) NOT NULL,
	cedula_usuario VARCHAR(50) NOT NULL,
	descripcion VARCHAR(100),
	estado_pqrs VARCHAR(20) NOT NULL,

	CONSTRAINT pqrs_pk PRIMARY KEY (id_pqrs, cedula_usuario),

	CONSTRAINT pqrs_fk1 FOREIGN KEY (id_estacion)
	REFERENCES estacion (id_estacion),

	CONSTRAINT pqrs_fk2 FOREIGN KEY (cedula_usuario)
	REFERENCES usuario (cedula_usuario)
);

---------------------------------------------------------------------

DROP SEQUENCE IF EXISTS id_pqrs_sec CASCADE;

CREATE SEQUENCE id_pqrs_sec;

---------------------------------------------------------------------

ALTER TABLE pqrs 
ALTER id_pqrs SET DEFAULT NEXTVAL ('id_pqrs_sec');

---------------------------------------------------------------------

DROP TABLE IF EXISTS turno CASCADE;

CREATE TABLE turno
(
	id_turno INTEGER NOT NULL,
	hora_inicio VARCHAR(5) NOT NULL,
	hora_fin VARCHAR(5) NOT NULL,
	estado_turno BOOLEAN NOT NULL,

	CONSTRAINT turno_pk PRIMARY KEY (id_turno)
);

----------------------------------------------------------------------

DROP TABLE IF EXISTS empleado_estacion CASCADE;

CREATE TABLE empleado_estacion
(
	cedula_empleado VARCHAR(20) NOT NULL,
	id_estacion INTEGER NOT NULL,
	fecha DATE NOT NULL,
	id_turno INTEGER NOT NULL,
	estado_empleado_estacion BOOLEAN NOT NULL,

	CONSTRAINT empleado_estacion_pk PRIMARY KEY (cedula_empleado, id_estacion, fecha, id_turno),

	CONSTRAINT empleado_estacion_fk1 FOREIGN KEY (cedula_empleado)
	REFERENCES empleado (cedula_empleado),

	CONSTRAINT empleado_estacion_fk2 FOREIGN KEY (id_estacion)
	REFERENCES estacion (id_estacion),

	CONSTRAINT empleado_estacion_fk3 FOREIGN KEY (id_turno)
	REFERENCES turno (id_turno)
);

----------------------------------------------------------------------

DROP TABLE IF EXISTS empleado_bus CASCADE;

CREATE TABLE empleado_bus
(
	cedula_empleado VARCHAR(20) NOT NULL,
	placa_bus VARCHAR(20) NOT NULL,	
	fecha DATE NOT NULL,
	id_turno INTEGER NOT NULL,
	estado_empleado_bus BOOLEAN NOT NULL,

	CONSTRAINT empleado_bus_pk PRIMARY KEY (cedula_empleado, placa_bus, fecha, id_turno),

	CONSTRAINT empleado_bus_fk1 FOREIGN KEY (cedula_empleado)
	REFERENCES empleado (cedula_empleado),

	CONSTRAINT empleado_bus_fk2 FOREIGN KEY (placa_bus)
	REFERENCES bus (placa_bus),

	CONSTRAINT empleado_bus_fk3 FOREIGN KEY (id_turno)
	REFERENCES turno (id_turno)
);

---------------------------------------------------------------------

DROP TABLE IF EXISTS ruta_bus CASCADE;

CREATE TABLE ruta_bus
(
	nombre_ruta VARCHAR(4) NOT NULL,
	placa_bus VARCHAR(20) NOT NULL,
	fecha DATE NOT NULL,
	id_turno INTEGER NOT NULL,
	estado_ruta_bus BOOLEAN NOT NULL,

	CONSTRAINT ruta_bus_pk PRIMARY KEY (nombre_ruta, placa_bus, fecha, id_turno),

	CONSTRAINT ruta_bus_fk1 FOREIGN KEY (nombre_ruta)
	REFERENCES ruta (nombre_ruta),

	CONSTRAINT ruta_bus_fk2 FOREIGN KEY (placa_bus)
	REFERENCES bus (placa_bus),

	CONSTRAINT ruta_bus_fk3 FOREIGN KEY (id_turno)
	REFERENCES turno (id_turno)
);
