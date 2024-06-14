CREATE TABLE productos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;



INSERT INTO productos (id, nombre, precio) VALUES
(1, 'Rosales', 25.99),
(2, 'Orquídea Phalaenopsis', 39.99),
(3, 'Cactus de Navidad', 15.50),
(4, 'Suculentas surtidas', 12.99),
(5, 'Helecho Boston', 19.99),
(6, 'Aloe Vera', 14.75),
(7, 'Hortensia', 29.95),
(8, 'Bambú de la suerte', 17.50),
(9, 'Lirio de la paz', 29.99),
(10, 'Pothos dorado', 11.25),
(11, 'Peperomia', 18.50),
(12, 'Begonia Rex', 22.00);

CREATE TABLE pedidos (
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fecha TIMESTAMP NOT NULL,
    cantidad INT NOT NULL,
    id_producto INT NOT NULL,
    FOREIGN KEY (id_producto) REFERENCES productos(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO pedidos (id, fecha, cantidad, id_producto) VALUES
(1, '2024-05-30 08:00:00', 2, 1),
(2, '2024-05-30 10:15:00', 3, 2),
(3, '2024-05-30 11:30:00', 1, 3),
(4, '2024-05-30 12:45:00', 2, 4),
(5, '2024-05-30 14:00:00', 2, 5),
(6, '2024-05-30 15:15:00', 3, 6),
(7, '2024-05-30 16:30:00', 1, 7),
(8, '2024-05-30 17:45:00', 2, 8),
(9, '2024-05-31 09:00:00', 3, 9),
(10, '2024-05-31 10:30:00', 1, 10),
(11, '2024-05-31 11:45:00', 2, 11),
(12, '2024-05-31 13:00:00', 2, 12),
(13, '2024-05-31 14:15:00', 2, 1),
(14, '2024-05-31 15:30:00', 3, 2),
(15, '2024-05-31 16:45:00', 1, 3),
(16, '2024-05-31 18:00:00', 2, 4),
(17, '2024-06-01 08:30:00', 2, 5),
(18, '2024-06-01 10:45:00', 3, 6),
(19, '2024-06-01 12:00:00', 1, 7),
(20, '2024-06-01 13:15:00', 2, 8),
(21, '2024-06-01 14:30:00', 2, 9),
(22, '2024-06-01 15:45:00', 3, 10),
(23, '2024-06-01 17:00:00', 1, 11),
(24, '2024-06-01 18:15:00', 2, 12),
(25, '2024-06-02 09:30:00', 2, 1),
(26, '2024-06-02 11:00:00', 3, 2),
(27, '2024-06-02 12:15:00', 1, 3),
(28, '2024-06-02 13:30:00', 2, 4),
(29, '2024-06-02 14:45:00', 2, 5),
(30, '2024-06-02 16:00:00', 3, 6),
(31, '2024-06-02 17:15:00', 1, 7),
(32, '2024-06-02 18:30:00', 2, 8),
(33, '2024-06-03 09:45:00', 2, 9),
(34, '2024-06-03 11:15:00', 3, 10),
(35, '2024-06-03 12:30:00', 1, 11),
(36, '2024-06-03 13:45:00', 2, 12),
(37, '2024-06-03 15:00:00', 2, 1),
(38, '2024-06-03 16:15:00', 3, 2),
(39, '2024-06-03 17:30:00', 1, 3),
(40, '2024-06-03 18:45:00', 2, 4);



