
CREATE TABLE `bodega` (
  `id_bod` int NOT NULL AUTO_INCREMENT,
  `nombre_bod` varchar(100) COLLATE utf8mb3_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_bod`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish2_ci;


INSERT INTO `bodega` VALUES (1,'BOD-01'),(2,'BOD-02'),(3,'BOD-03'),(4,'BOD-04');


CREATE TABLE `movimiento` (
  `id_mov` int NOT NULL AUTO_INCREMENT,
  `id_empresa_mov` int NOT NULL,
  `descripción_mov` varchar(255) COLLATE utf8mb3_spanish2_ci DEFAULT NULL,
  `id_bod_origen_mov` int NOT NULL,
  `id_bod_destino_mov` int NOT NULL,
  `fecha_creacion_mov` date NOT NULL,
  `fecha_entrega_mov` date NOT NULL,
  `id_estado_mov` int NOT NULL,
  PRIMARY KEY (`id_mov`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish2_ci;


CREATE TABLE `movimiento_detalle` (
  `id_mdet` int NOT NULL AUTO_INCREMENT,
  `id_mov` int NOT NULL,
  `item_mdet` varchar(20) COLLATE utf8mb3_spanish2_ci NOT NULL,
  `cantidad_mdet` int NOT NULL,
  PRIMARY KEY (`id_mdet`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish2_ci;


CREATE TABLE `movimiento_estado` (
  `id_mes` int NOT NULL AUTO_INCREMENT,
  `nombre_mes` varchar(45) COLLATE utf8mb3_spanish2_ci NOT NULL,
  `estado_mes` varchar(45) COLLATE utf8mb3_spanish2_ci DEFAULT '1',
  PRIMARY KEY (`id_mes`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish2_ci;

INSERT INTO `movimiento_estado` VALUES (1,'pendiente','1'),(2,'Trancito','1'),(3,'Entregado','1');


CREATE TABLE `empresa` (
  `id_emp` int NOT NULL AUTO_INCREMENT,
  `nombre_emp` varchar(100) COLLATE utf8mb3_spanish2_ci NOT NULL,
  PRIMARY KEY (`id_emp`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_spanish2_ci;

INSERT INTO `empresa` VALUES (1,'1001'),(2,'1002'),(3,'1003'),(4,'1004');




INSERT INTO `testswisslub`.`movimiento` 
(`id_empresa_mov`, `descripción_mov`, `id_bod_origen_mov`, `id_bod_destino_mov`, `fecha_creacion_mov`, `fecha_entrega_mov`, `id_estado_mov`) 
VALUES ('1', 'cambio de bodega', '2', '4', '2022-10-13', '2023-05-20', '1');

INSERT INTO `testswisslub`.`movimiento` 
(`id_empresa_mov`, `descripción_mov`, `id_bod_origen_mov`, `id_bod_destino_mov`, `fecha_creacion_mov`, `fecha_entrega_mov`, `id_estado_mov`) 
VALUES ('2', 'reorganizacion', '3', '4', '2023-06-13', '2023-07-20', '1');

INSERT INTO `testswisslub`.`movimiento` 
(`id_empresa_mov`, `descripción_mov`, `id_bod_origen_mov`, `id_bod_destino_mov`, `fecha_creacion_mov`, `fecha_entrega_mov`, `id_estado_mov`) 
VALUES ('2', 'mercancia para almacenar', '1', '2', '2023-05-13', '2023-05-20', '1');

INSERT INTO `testswisslub`.`movimiento` 
(`id_empresa_mov`, `descripción_mov`, `id_bod_origen_mov`, `id_bod_destino_mov`, `fecha_creacion_mov`, `fecha_entrega_mov`, `id_estado_mov`) 
VALUES ('2', 'actualizando inventario', '3', '1', '2023-06-13', '2023-06-20', '1');


INSERT INTO `testswisslub`.`movimiento` 
(`id_empresa_mov`, `descripción_mov`, `id_bod_origen_mov`, `id_bod_destino_mov`, `fecha_creacion_mov`, `fecha_entrega_mov`, `id_estado_mov`) 
VALUES ('4', 'mercancia  nuevo estilos', '1', '2', '2023-05-13', '2023-05-20', '1');
INSERT INTO `testswisslub`.`movimiento` 
(`id_empresa_mov`, `descripción_mov`, `id_bod_origen_mov`, `id_bod_destino_mov`, `fecha_creacion_mov`, `fecha_entrega_mov`, `id_estado_mov`) 
VALUES ('1', 'cambio de bodega por reform en la bodega actual', '2', '4', '2022-10-13', '2023-05-20', '1');




INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('1', 'producto1', '18');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('1', 'producto2', '20');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('1', 'producto6', '150');


INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('2', 'producto1', '18');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('2', 'producto2', '20');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('2', 'producto6', '150');


INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('3', 'producto1', '18');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('3', 'producto2', '20');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('3', 'producto6', '150');


INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('4', 'producto1', '25');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('4', 'producto2', '20');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('4', 'producto6', '1');

INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('5', 'producto1', '10');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('5', 'producto2', '20');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('5', 'producto6', '150');



INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('6', 'producto1', '10');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('6', 'producto2', '20');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('6', 'producto6', '150');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('6', 'producto4', '10');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('6', 'producto5', '20');
INSERT INTO `testswisslub`.`movimiento_detalle` (`id_mov`, `item_mdet`, `cantidad_mdet`) VALUES 
('6', 'producto8', '150');