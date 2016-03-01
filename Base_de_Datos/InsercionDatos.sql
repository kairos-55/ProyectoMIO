/*
	INTEGRANTES:
		     Mauricio Bernardo Dominguez Bocanegra. Código: 9927680
 		     Martha Cecilia Holguin Tovar. Código: 1129455
 		     Jesús Alberto Ramírez Otálvaro. Código: 1422554
*/

--Insertamos datos en la tabla EMPLEADO:

INSERT INTO empleado VALUES 
('1000000', 690000, 'MAURICIO BERNARDO', 'DOMINGUEZ BOCANEGRA', '1111111', '31-12-1980', 'VIUDO(A)', 'CONDUCTOR(A)', TRUE);
INSERT INTO empleado VALUES 
('1000001', 690000, 'JESUS ALBERTO', 'RAMIREZ OTALVARO', '2222222', '01-01-1990', 'SOLTERO(A)', 'AUXILIAR', TRUE );
INSERT INTO empleado VALUES 
('1000002', 1500000, 'MARTHA CECILIA', 'HOLGUIN TOVAR', '3333333', '01-05-1985', 'CASADO(A)', 'DIRECTOR(A)', TRUE );
INSERT INTO empleado VALUES 
('1000003', 690000, 'ALEJANDRO', 'MEJIA', '4444444', '20-10-1970', 'UNIÓN LIBRE', 'CONDUCTOR', TRUE );
INSERT INTO empleado VALUES 
('1000004', 690000, 'PEPITO', 'PEREZ', '5555555', '29-02-1988', 'DIVORCIADO(A)', 'CONDUCTOR', TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla ESTACION:

INSERT INTO estacion VALUES (1,'UNIVALLE', 'CARRERA 100 # 16-04', '1000000', TRUE);
INSERT INTO estacion VALUES (2,'CHIMINANGOS', 'CALLE 99 # 17-05', '1000001', TRUE);
INSERT INTO estacion VALUES (3,'UNIDAD DEPORTIVA', 'CARRERA 101 # 15-03', '1000002', TRUE);
INSERT INTO estacion VALUES (4,'BUITRERA', 'CALLE 98 # 18-05', '1000003', TRUE);
INSERT INTO estacion VALUES (5,'CAPRI', 'CARRERA 102 # 14-02', '1000004', TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla RECORRIDO:

INSERT INTO recorrido VALUES (1, 'Norte', TRUE);
INSERT INTO recorrido VALUES (2, 'Sur', TRUE);
INSERT INTO recorrido VALUES (3, 'Sur-Oriente', TRUE);
INSERT INTO recorrido VALUES (4, 'Occidente',TRUE);
INSERT INTO recorrido VALUES (5, 'NorOccidente',TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla PARADA:

INSERT INTO parada VALUES (1, 1);
INSERT INTO parada VALUES (1, 2);
INSERT INTO parada VALUES (2, 1);
INSERT INTO parada VALUES (2, 3);
INSERT INTO parada VALUES (3, 5);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla RUTA:

INSERT INTO ruta VALUES ('T31', 1, TRUE);
INSERT INTO ruta VALUES ('E31', 2, TRUE);
INSERT INTO ruta VALUES ('TA31', 3, TRUE);
INSERT INTO ruta VALUES ('A01', 4, TRUE);
INSERT INTO ruta VALUES ('A02', 5, TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla TARJETA:

INSERT INTO tarjeta VALUES (1, 0, '1000000', '01-02-2016', '09:00', 'ACTIVA');
INSERT INTO tarjeta VALUES (2, 1700, '1000001', '02-02-2016', '14:00', 'ACTIVA');
INSERT INTO tarjeta VALUES (3, 3000, '1000000', '01-02-2016', '22:00', 'INACTIVA');
INSERT INTO tarjeta VALUES (4, 10000, '1000001', '02-02-2016', '05:00', 'ELIMINADA');
INSERT INTO tarjeta VALUES (5, 30000, '1000000', '01-02-2016', '12:00', 'INACTIVA');

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla USUARIO:

INSERT INTO usuario VALUES (1000000, 1, 'CARLOS CASTRO', '1111111', 'CARRERA 1 # 6-04', FALSE);
INSERT INTO usuario VALUES (2000000, 2, 'ANDRÉS MURILLO', '2222222', 'CARRERA 2 # 7-03', FALSE);
INSERT INTO usuario VALUES (3000000, 3, 'PEDRO PÉREZ', '3333333', 'CARRERA 3 # 8-02', TRUE);
INSERT INTO usuario VALUES (4000000, 4, 'PABLO MARMOL', '4444444', 'CARRERA 4 # 9-01', TRUE);
INSERT INTO usuario VALUES (5000000, 5, 'JUAN PAZ', '5555555', 'CARRERA 5 # 10-00', TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla BUS:

INSERT INTO bus VALUES ('1000AC', '2010', 'MAZDA', 120, 'ALIMENTADOR', TRUE);
INSERT INTO bus VALUES ('2000DE', '2011', 'ACME', 100, 'ARTICULADO', FALSE);
INSERT INTO bus VALUES ('3000EF', '2012', 'CHEVROLET', 40, 'PADRON', TRUE);
INSERT INTO bus VALUES ('4000GH', '2013', 'FERRARI', 30, 'ALIMENTADOR', FALSE);
INSERT INTO bus VALUES ('5000IJ', '2014', 'NISSAN', 77, 'PADRON', TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla TARJETA_BUS:

INSERT INTO tarjeta_bus VALUES (1, '1000AC', '01-01-2016', '08:00');
INSERT INTO tarjeta_bus VALUES (2, '2000DE', '01-01-2016', '08:00');
INSERT INTO tarjeta_bus VALUES (3, '3000EF', '01-01-2016', '08:00');
INSERT INTO tarjeta_bus VALUES (1, '1000AC', '01-01-2016', '18:00');
INSERT INTO tarjeta_bus VALUES (2, '2000DE', '01-01-2016', '20:00');

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla PQRS:

INSERT INTO pqrs (id_estacion, fecha, motivo, cedula_usuario, descripcion, estado_pqrs) VALUES 
(1, '01-01-2016', 'AGRESIÓN', '1000000', 'N/A', 'INICIADO');
INSERT INTO pqrs (id_estacion, fecha, motivo, cedula_usuario, descripcion, estado_pqrs) VALUES 
(2, '02-01-2016', 'SUGERENCIA', '2000000', 'N/A', 'EN PROCESO');
INSERT INTO pqrs (id_estacion, fecha, motivo, cedula_usuario, descripcion, estado_pqrs) VALUES 
(3, '03-01-2016', 'RECLAMO', '3000000', 'N/A', 'SOLUCIONADO');
INSERT INTO pqrs (id_estacion, fecha, motivo, cedula_usuario, descripcion, estado_pqrs) VALUES 
(4, '04-01-2016', 'INCONVENIENTE', '4000000', 'N/A', 'ELIMINADA');
INSERT INTO pqrs (id_estacion, fecha, motivo, cedula_usuario, descripcion, estado_pqrs) VALUES 
(5, '05-01-2016', 'PETICIÓN', '5000000', 'N/A', 'EN PROCESO');

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla TURNO:

INSERT INTO turno VALUES (1, '05:00', '08:00', TRUE);
INSERT INTO turno VALUES (2, '08:00', '11:00', TRUE);
INSERT INTO turno VALUES (3, '11:00', '14:00', TRUE);
INSERT INTO turno VALUES (4, '14:00', '17:00', TRUE);
INSERT INTO turno VALUES (5, '17:00', '20:00', TRUE);
INSERT INTO turno VALUES (6, '20:00', '23:00', TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla EMPLEADO_ESTACION:

INSERT INTO empleado_estacion VALUES ('1000000', 1, '01-02-2016', 1, TRUE);
INSERT INTO empleado_estacion VALUES ('1000003', 2, '02-02-2016', 2, TRUE);
INSERT INTO empleado_estacion VALUES ('1000004', 1, '03-02-2016', 3, TRUE);
INSERT INTO empleado_estacion VALUES ('1000000', 3, '01-02-2016', 4, TRUE);
INSERT INTO empleado_estacion VALUES ('1000003', 2, '02-02-2016', 5, TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla	EMPLEADO_BUS:

INSERT INTO empleado_bus VALUES ('1000000', '1000AC', '01-02-2016', 1, TRUE);
INSERT INTO empleado_bus VALUES ('1000003', '2000DE', '02-02-2016', 2, TRUE);
INSERT INTO empleado_bus VALUES ('1000004', '3000EF', '03-02-2016', 3, TRUE);
INSERT INTO empleado_bus VALUES ('1000000', '4000GH', '01-02-2016', 4, TRUE);
INSERT INTO empleado_bus VALUES ('1000003', '5000IJ', '02-02-2016', 5, TRUE);

----------------------------------------------------------------------------------------------------------------------------------

--Insertamos datos en la tabla RUTA_BUS:

INSERT INTO ruta_bus VALUES ('T31', '1000AC', '01-02-2016', 1, TRUE);
INSERT INTO ruta_bus VALUES ('TA31', '2000DE', '02-02-2016', 2, TRUE);
INSERT INTO ruta_bus VALUES ('E31', '3000EF', '03-02-2016', 3, TRUE);
INSERT INTO ruta_bus VALUES ('A01', '4000GH', '01-02-2016', 4, TRUE);
INSERT INTO ruta_bus VALUES ('A02', '5000IJ', '02-02-2016', 5, TRUE);
