CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    direccion VARCHAR(255),
    telefono VARCHAR(15)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO clientes (id, nombre, direccion, telefono) VALUES
(1, 'Juan Pérez', 'Calle Falsa 123', '555-1234'),
(2, 'María López', 'Avenida Siempre Viva 742', '555-5678'),
(3, 'Carlos García', 'Boulevard de los Sueños Rotos 1', '555-8765'),
(4, 'Ana Martínez', 'Plaza Mayor 5', '555-4321'),
(5, 'Luis Rodríguez', 'Calle de la Luna 45', '555-1111'),
(6, 'Carmen Díaz', 'Avenida del Sol 89', '555-2222');

CREATE TABLE cuentas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    saldo DECIMAL(10, 2) NOT NULL,
    id_cliente INT,
    FOREIGN KEY (id_cliente) REFERENCES clientes(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO cuentas (id, saldo, id_cliente) VALUES
(1, 1000.50, 1),
(2, 2500.75, 1),
(3, 1500.00, 2),
(4, 3000.00, 3),
(5, 500.25, 4),
(6, 2750.60, 5),
(7, 3200.80, 6),
(8, 600.40, 3),
(9, 1200.90, 2);

