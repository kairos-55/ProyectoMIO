/*
	INTEGRANTES:
		     Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 		     Martha Cecilia Holguin Tovar. Código: 1129455
 		     Jesús Alberto Ramírez Otálvaro. Código: 1422554
*/

DROP TABLE IF EXISTS empleado CASCADE;

CREATE TABLE empleado
(
	cedula_empleado VARCHAR(20) NOT NULL,
	salario DOUBLE PRECISION NOT NULL,
	nombre VARCHAR(50) NOT NULL,
	telefono VARCHAR(10),
	fecha_nacimiento DATE,
	estado_civil VARCHAR(13),
	cargo VARCHAR(12) NOT NULL,
	estado_empleado  BOOLEAN NOT NULL,

	CONSTRAINT empleado_pk PRIMARY KEY (cedula_empleado)
);

--Insertamos datos en la tabla EMPLEADO:

INSERT INTO empleado VALUES ('1000000', 690000, 'MAURICIO DOMINGUEZ', '1111111', '31-12-1980', 'VIUDO(A)', 'CONDUCTOR(A)', TRUE);
INSERT INTO empleado VALUES ('1000001', 690000, 'JESÚS RAMÍREZ', '2222222', '01-01-1990', 'SOLTERO(A)', 'AUXILIAR', TRUE );
INSERT INTO empleado VALUES ('1000002', 1500000, 'MARTHA HOLGUIN', '3333333', '01-05-1985', 'CASADO(A)', 'DIRECTOR(A)', TRUE );
INSERT INTO empleado VALUES ('1000003', 690000, 'ALEJANDRO MEJÍA', '4444444', '20-10-1970', 'UNIÓN LIBRE', 'CONDUCTOR', TRUE );
INSERT INTO empleado VALUES ('1000004', 690000, 'PEPITO PÉREZ', '5555555', '29-02-1988', 'DIVORCIADO(A)', 'CONDUCTOR', TRUE);

----------------------------------------------------------------------

DROP TABLE IF EXISTS ruta CASCADE;

CREATE TABLE ruta
(
	id_ruta VARCHAR(4) NOT NULL,	
	estado_ruta BOOLEAN NOT NULL,
	

	CONSTRAINT ruta_pk PRIMARY KEY (id_ruta)
);

--Insertamos datos en la tabla RUTA:

INSERT INTO ruta VALUES ('T31', TRUE);
INSERT INTO ruta VALUES ('E31', TRUE);
INSERT INTO ruta VALUES ('TA31', TRUE);
INSERT INTO ruta VALUES ('A01', TRUE);
INSERT INTO ruta VALUES ('A02', TRUE);

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
        
        CONSTRAINT estacion_fk1 FOREIGN KEY (cedula_empleado) 
	REFERENCES empleado (cedula_empleado)
	
);

--Insertamos datos en la tabla ESTACION:

INSERT INTO estacion VALUES (1,'UNIVALLE', 'CARRERA 100 # 16-04', '1000000', TRUE);
INSERT INTO estacion VALUES (2,'CHIMINANGOS', 'CALLE 99 # 17-05', '1000001', TRUE);
INSERT INTO estacion VALUES (3,'UNIDAD DEPORTIVA', 'CARRERA 101 # 15-03', '1000002', TRUE);
INSERT INTO estacion VALUES (4,'BUITRERA', 'CALLE 98 # 18-05', '1000003', TRUE);
INSERT INTO estacion VALUES (5,'CAPRI', 'CARRERA 102 # 14-02', '1000004', TRUE);

----------------------------------------------------------------------

DROP TABLE IF EXISTS parada CASCADE;

CREATE TABLE parada
(
	id_parada INTEGER NOT NULL,
        nombre_parada VARCHAR(20),
	direccion VARCHAR(50) NOT NULL,		
	estado_parada BOOLEAN NOT NULL,

	CONSTRAINT parada_pk PRIMARY KEY (id_parada)	
);

--Insertamos datos en la tabla PARADA:

INSERT INTO parada VALUES (6,'MELENDEZ', 'CARRERA 1 # 6-04', TRUE);
INSERT INTO parada VALUES (7,'CALDAS', 'CALLE 9 # 7-05', TRUE);
INSERT INTO parada VALUES (8,'SILOE', 'CARRERA 10 # 15-03', TRUE);
INSERT INTO parada VALUES (9,'BELALCAZAR', 'CALLE 8 # 8-05', TRUE);
INSERT INTO parada VALUES (10,'CALIPSO', 'CARRERA 12 # 4-02', TRUE);


----------------------------------------------------------------------

DROP TABLE IF EXISTS tarjeta CASCADE;

CREATE TABLE tarjeta
(
	id_tarjeta INTEGER NOT NULL,
	saldo DOUBLE PRECISION NOT NULL,
	estado_tarjeta VARCHAR(20) NOT NULL,
	id_punto_venta INTEGER NOT NULL,
	fecha_venta DATE NOT NULL,

	CONSTRAINT tarjeta_pk PRIMARY KEY (id_tarjeta),

	CONSTRAINT tarjeta_fk FOREIGN KEY (id_punto_venta) 
	REFERENCES estacion (id_estacion)
);

--Insertamos datos en la tabla TARJETA:

INSERT INTO tarjeta VALUES (1, 0, 'ACTIVA', 5, '18-01-2016');
INSERT INTO tarjeta VALUES (2, 1700, 'ACTIVA', 4, '19-01-2016');
INSERT INTO tarjeta VALUES (3, 3000, 'INACTIVA', 3, '17-01-2016');
INSERT INTO tarjeta VALUES (4, 10000, 'ELIMINADA', 2, '16-01-2016');
INSERT INTO tarjeta VALUES (5, 30000, 'INACTIVA', 1, '01-01-2016');

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

--Insertamos datos en la tabla USUARIO:

INSERT INTO usuario VALUES (1000000, 1, 'CARLOS CASTRO', '1111111', 'CARRERA 1 # 6-04', FALSE);
INSERT INTO usuario VALUES (2000000, 2, 'ANDRÉS MURILLO', '2222222', 'CARRERA 2 # 7-03', FALSE);
INSERT INTO usuario VALUES (3000000, 3, 'PEDRO PÉREZ', '3333333', 'CARRERA 3 # 8-02', TRUE);
INSERT INTO usuario VALUES (4000000, 4, 'PABLO MARMOL', '4444444', 'CARRERA 4 # 9-01', TRUE);
INSERT INTO usuario VALUES (5000000, 5, 'JUAN PAZ', '5555555', 'CARRERA 5 # 10-00', TRUE);

---------------------------------------------------------------------

DROP TABLE IF EXISTS bus CASCADE;

CREATE TABLE bus
(
	placa_bus VARCHAR(20) NOT NULL,
	modelo VARCHAR(4),
	marca VARCHAR(20),
	capacidad INTEGER,
	tipo VARCHAR(13) NOT NULL,
	id_ruta VARCHAR(4) NOT NULL,	
	estado_bus BOOLEAN NOT NULL,

	CONSTRAINT bus_pk PRIMARY KEY (placa_bus),

	CONSTRAINT bus_fk FOREIGN KEY (id_ruta)
	REFERENCES ruta (id_ruta) 
);

--Insertamos datos en la tabla BUS:

INSERT INTO bus VALUES ('1000AC', '2010', 'MAZDA', 120, 'ALIMENTADOR', 'T31', TRUE);
INSERT INTO bus VALUES ('2000DE', '2011', 'ACME', 100, 'ARTICULADO', 'E31', FALSE);
INSERT INTO bus VALUES ('3000EF', '2012', 'CHEVROLET', 40, 'PADRON', 'A01', TRUE);
INSERT INTO bus VALUES ('4000GH', '2013', 'FERRARI', 30, 'ALIMENTADOR', 'A02', FALSE);
INSERT INTO bus VALUES ('5000IJ', '2014', 'NISSAN', 77, 'PADRON', 'TA31', TRUE);

---------------------------------------------------------------------

DROP TABLE IF EXISTS pqrs CASCADE;

CREATE TABLE pqrs
(
	id_pqrs INTEGER NOT NULL,
	cedula_empleado VARCHAR(20) NOT NULL,
	id_estacion INTEGER NOT NULL,	
	fecha DATE NOT NULL,
	motivo VARCHAR(100) NOT NULL,
	cedula_usuario VARCHAR(50) NOT NULL,
	descripcion VARCHAR(100),
	estado_pqrs BOOLEAN NOT NULL,

	CONSTRAINT pqrs_pk PRIMARY KEY (id_pqrs),

	CONSTRAINT pqrs_fk1 FOREIGN KEY (cedula_empleado)
	REFERENCES empleado (cedula_empleado),

	CONSTRAINT pqrs_fk2 FOREIGN KEY (id_estacion)
	REFERENCES estacion (id_estacion)
);

---------------------------------------------------------------------

DROP TABLE IF EXISTS usa CASCADE;

CREATE TABLE usa
(
	id_usa INTEGER NOT NULL,
	placa_bus VARCHAR(20) NOT NULL,	
	fecha DATE NOT NULL,
	estado_usa_bus BOOLEAN NOT NULL,

	CONSTRAINT usa_pk PRIMARY KEY (id_usa),

	CONSTRAINT usa_fk FOREIGN KEY (placa_bus)
	REFERENCES bus (placa_bus)
);

---------------------------------------------------------------------

DROP TABLE IF EXISTS conduce CASCADE;

CREATE TABLE conduce
(
	cedula_empleado VARCHAR(20) NOT NULL, 
	placa_bus VARCHAR(20) NOT NULL,
	fecha DATE NOT NULL,
	horaEntrada TIME(0) NOT NULL,
	horaSalida TIME(0) NOT NULL,
	estado_conduce BOOLEAN NOT NULL,	

	CONSTRAINT conduce_pk PRIMARY KEY (cedula_empleado, placa_bus),

	CONSTRAINT conduce_fk1 FOREIGN KEY (cedula_empleado)
	REFERENCES empleado (cedula_empleado), 

	CONSTRAINT conduce_fk2 FOREIGN KEY (placa_bus)
	REFERENCES bus (placa_bus) 
);

---------------------------------------------------------------------
DROP TABLE IF EXISTS recorrido CASCADE;

CREATE TABLE recorrido
(
	id_ruta VARCHAR(4) NOT NULL, 
	id_lugar INTEGER NOT NULL,
	estado_recorrido BOOLEAN NOT NULL,	

	CONSTRAINT recorrido_pk PRIMARY KEY (id_ruta, id_lugar),

	CONSTRAINT recorrido_fk FOREIGN KEY (id_ruta)
	REFERENCES ruta (id_ruta), 

	CONSTRAINT recorrido_fk2 FOREIGN KEY (id_lugar)
	REFERENCES estacion (id_estacion)
);
