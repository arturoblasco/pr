!!!note " "
	Para realizar los siguientes ejercicios se van a utilizar las tablas importadas (anteriormente) del siguiente fichero sql [**tablas.sql**](./tablas.sql){:target="_blank"}.



## Ejercicio 1: paquete `gestionEmpleados`

Tenemos una base de datos `pr_tuNombre` que almacena información sobre empleados. La tabla `empleados` tiene las siguientes columnas:

- `id`: Identificador único del empleado (entero).
- `nombre`: Nombre del empleado (cadena de texto).
- `salario`: Salario del empleado (decimal).

Es escribir un programa Java `gestionEmpleados` que realice las siguientes operaciones utilizando diferentes tipos de resultado y opciones de concurrencia:

1. **`listarEmpleados (Connection conn)`**: Mostrar en la consola todos los empleados y sus salarios.
2. **`actualizarSalarios (Connection conn)`**: Incrementar el salario de todos los empleados en un 10%.
3. **`eliminarEmpleados (Connection conn)`**: Eliminar todos los empleados cuyo salario sea menor que $2000.

!!! question "Para probar ..."
	Puedes implementar cada operación utilizando un tipo de resultado y opción de concurrencia diferente para familiarizarte con su uso. No olvides manejar las excepciones `SQLException` adecuadamente.<br /><br />
	Por ejemplo, podrías probarlas siguientes operaciones:<br />
	 1. Lista todos los empleados junto con sus salarios utilizando un `ResultSet` de tipo `TYPE_SCROLL_SENSITIVE` y opción de concurrencia `CONCUR_READ_ONLY`.<br />
	2. Actualiza los salarios de todos los empleados incrementándolos en un 10% utilizando un `ResultSet` de tipo `TYPE_FORWARD_ONLY` y opción de concurrencia `CONCUR_UPDATABLE`.<br />
	3. Elimina todos los empleados cuyo salario sea menor a $2000 utilizando un `Statement` estándar sin necesidad de un `ResultSet`.

!!! nota "No olvides ..."
	... manejar las excepciones `SQLException` adecuadamente.

!!! nota "Recuerda ..."
	... ajustar la cadena de conexión a tu base de datos y reemplazar "usuario" y "contraseña" con las credenciales adecuadas. Además, asegúrate de manejar adecuadamente las excepciones.

__________________________

## Ejercicio 2: paquete `gestionProductos`

Supongamos que tienes una base de datos que almacena información sobre productos. La tabla `productos` tiene las siguientes columnas:

- `id`: Identificador único del producto (entero).
- `nombre`: Nombre del producto (cadena de texto).
- `precio`: Precio del producto (decimal).

Tu tarea es escribir un programa Java que realice las siguientes operaciones utilizando los métodos proporcionados:

1. **`mostrarProductosPorPagina()`**: Mostrar una página de productos cada vez que el usuario lo solicite. Cada página debe contener 5 productos. Implementa las funciones para mover el cursor a la primera página, página siguiente, página anterior, última página y una página específica utilizando el método `absolute(int row)`.
2. **`buscarProductoPorNombre(String nombre)`**: Permitir al usuario buscar un producto por su nombre. Utiliza el método `relative(int registros)` para desplazar el cursor hacia adelante o hacia atrás según la coincidencia del nombre.

__________________________

## Ejercicio 3: paquete `gestionAlumnos`

Supongamos que tienes una base de datos que almacena información sobre alumnos. La tabla `alumnos` tiene las siguientes columnas:

- `id`: Identificador único del alumno (entero).
- `nombre`: Nombre del alumno (cadena de texto).
- `edad`: Edad del alumno (entero).

Tu tarea es escribir un programa Java que realice las siguientes operaciones utilizando los métodos proporcionados:

1. **Mostrar la información del alumno más joven y más viejo**: Utiliza los métodos `first()` y `last()` para mover el cursor a la primera y última fila respectivamente y obtener la información del alumno más joven y más viejo.
2. **Desplazarse por los alumnos en orden inverso de edad**: Muestra la información de los alumnos en orden inverso de edad. Utiliza el método `previous()` para desplazarte hacia atrás a través de los registros.

__________________________

## Ejercicio 4: paquete `gestionLibros`

Supongamos que tienes una base de datos que almacena información sobre libros. La tabla `libros` tiene las siguientes columnas:

- `id`: Identificador único del libro (entero).
- `titulo`: Título del libro (cadena de texto).
- `autor`: Nombre del autor del libro (cadena de texto).
- `anio_publicacion`: Año de publicación del libro (entero).

Tu tarea es escribir un programa Java que realice las siguientes operaciones utilizando los métodos proporcionados:

1. **Mostrar libros por década**: Permite al usuario ingresar una década y mostrar todos los libros publicados en esa década. Utiliza el método `afterLast()` y `previous()` para mover el cursor al final y luego retroceder, así puedes comenzar desde la última fila.
2. **Buscar un libro por autor**: Permite al usuario ingresar el nombre de un autor y muestra todos los libros escritos por ese autor. Utiliza el método `relative(int registros)` para desplazarte a través de los registros según las coincidencias del autor.

__________________________

## Ejercicio 5: paquete `gestionVentas`

Supongamos que tienes una base de datos que almacena información sobre ventas. La tabla `ventas` tiene las siguientes columnas:

- `id`: Identificador único de la venta (entero).
- `producto`: Nombre del producto vendido (cadena de texto).
- `cantidad`: Cantidad de productos vendidos (entero).
- `total`: Total de la venta (decimal).

Tu tarea es escribir un programa Java que realice las siguientes operaciones utilizando los métodos proporcionados:

1. **Calcular el total de ventas**: Utiliza el método `next()` para recorrer todas las ventas y sumar los totales para obtener el total general de ventas.
2. **Buscar ventas por producto**: Permite al usuario ingresar el nombre de un producto y muestra todas las ventas asociadas a ese producto. Utiliza el método `relative(int registros)` para desplazarte a través de los registros según las coincidencias del producto.

__________________________

## Ejercicio 6: paquete `gestionPedidos`

Supongamos que tienes una base de datos que almacena información sobre pedidos. La tabla `pedidos` tiene las siguientes columnas:

- `id`: Identificador único del pedido (entero).
- `cliente`: Nombre del cliente que realizó el pedido (cadena de texto).
- `producto`: Nombre del producto pedido (cadena de texto).
- `cantidad`: Cantidad del producto solicitada en el pedido (entero).
- `fecha`: Fecha en que se realizó el pedido (fecha).

Tu tarea es escribir un programa Java que realice las siguientes operaciones utilizando los métodos proporcionados:

1. **Listar pedidos por cliente**: Permite al usuario ingresar el nombre de un cliente y mostrar todos los pedidos realizados por ese cliente. Utiliza el método `relative(int registros)` para desplazarte a través de los registros según las coincidencias del cliente.
2. **Buscar pedidos por fecha**: Permite al usuario ingresar una fecha y mostrar todos los pedidos realizados en esa fecha. Utiliza el método `afterLast()` y `previous()` para mover el cursor al final y luego retroceder, así puedes comenzar desde la última fila.

__________________________

## Ejercicio 7: paquete `gestionEmpleados` (continuación)

Continuando con el ejercicio de gestión de empleados del primer conjunto, vamos a agregar algunas funcionalidades adicionales:

1. **Mostrar información del empleado por ID**: Permite al usuario ingresar el ID de un empleado y muestra toda la información relacionada con ese empleado. Utiliza el método `absolute(int row)` para posicionarte en el registro del empleado especificado.
2. **Buscar empleados por salario**: Permite al usuario ingresar un rango de salarios y mostrar todos los empleados cuyo salario esté dentro de ese rango. Utiliza el método `next()` para recorrer todas las filas y filtrar los empleados según el criterio de salario.

__________________________

## Ejercicio 8: paquete `gestionEstudiantes`

Supongamos que tienes una base de datos que almacena información sobre estudiantes. La tabla `estudiantes` tiene las siguientes columnas:

- `id`: Identificador único del estudiante (entero).
- `nombre`: Nombre del estudiante (cadena de texto).
- `edad`: Edad del estudiante (entero).
- `promedio`: Promedio de calificaciones del estudiante (decimal).

Tu tarea es escribir un programa Java que realice las siguientes operaciones utilizando los métodos proporcionados:

1. **Mostrar la posición actual del estudiante**: Muestra la posición del estudiante actual en el conjunto de resultados. Utiliza el método `getRow()` para obtener el número de registro actual.
2. **Validar la posición del cursor**: Verifica si el cursor está antes del primer registro, en el primer registro, en el último registro o después del último registro. Utiliza los métodos `isBeforeFirst()`, `isFirst()`, `isLast()` e `isAfterLast()` para realizar estas verificaciones.

__________________________

## Ejercicio 9: paquete `gestionProductos` (continuación)

Continuando con el ejercicio de gestión de productos del segundo conjunto, agreguemos algunas funcionalidades adicionales:

1. **Mostrar el número total de productos**: Muestra el número total de productos en la base de datos. Utiliza el método `getRow()` para obtener el número de registro actual y `last()` para mover el cursor a la última fila.
2. **Verificar si hay productos disponibles**: Verifica si hay algún producto disponible en la base de datos. Utiliza los métodos `isBeforeFirst()` e `isAfterLast()` para determinar si el cursor está antes del primer registro o después del último registro, respectivamente.

__________________________

## Ejercicio 10: paquete `gestionEmpleados` (continuación)

Continuando con el ejercicio de gestión de empleados del tercer conjunto, agreguemos más funcionalidades:

1. **Verificar si hay empleados en la base de datos**: Verifica si hay algún empleado registrado en la base de datos. Utiliza los métodos `isBeforeFirst()` e `isAfterLast()` para determinar si el cursor está antes del primer registro o después del último registro, respectivamente.
2. **Mostrar el primer empleado**: Muestra la información del primer empleado en la base de datos. Utiliza el método `first()` para mover el cursor al primer registro y luego muestra la información del empleado.

__________________________

## Ejercicio 11: paquete `gestionClientes`

Imagina que tienes una base de datos que almacena información sobre clientes. La tabla `clientes` tiene las siguientes columnas:

- `id`: Identificador único del cliente (entero).
- `nombre`: Nombre del cliente (cadena de texto).
- `correo`: Correo electrónico del cliente (cadena de texto).
- `telefono`: Número de teléfono del cliente (cadena de texto).

Tu tarea es escribir un programa Java que realice las siguientes operaciones utilizando los métodos proporcionados:

1. **Mostrar la posición actual del cliente**: Muestra la posición actual del cliente en el conjunto de resultados. Utiliza el método `getRow()` para obtener el número de registro actual.
2. **Mostrar información del último cliente**: Muestra la información del último cliente en la base de datos. Utiliza el método `last()` para mover el cursor al último registro y luego muestra la información del cliente.

<hr>

## Ejercicio 12 : completo

Veamos un ejemplo completo de conexión y acceso a una base de datos utilizando todos los elementos mencionados en este apartado.

```java
try {
  // Cargamos la clase que implementa el Driver
  Class.forName("com.mysql.cj.jdbc.Driver").newInstance();

  // Creamos una nueva conexión a la base de datos 'prueba'
  String url = "jdbc:mysql://localhost:3306/prueba?serverTimezone=UTC";

  Connection conn = DriverManager.getConnection(url,"root","");

  // Obtenemos un Statement de la conexión
  Statement st = conn.createStatement();

  // Ejecutamos una consulta SELECT para obtener la tabla vendedores
  String sql = "SELECT * FROM vendedores";

  ResultSet rs = st.executeQuery(sql);

  // Recorremos todo el ResultSet y mostramos sus datos

  while(rs.next()) {
    int id        = rs.getInt("id");
    String nombre = rs.getString("nombre");
    Date fecha    = rs.getDate("fecha_ingreso");
    float salario = rs.getFloat("salario");
    System.out.println(id + " " + nombre + " " + fecha + " " + salario);
  }
  // Cerramos el statement y la conexión
  st.close();
  conn.close();
    
} catch (SQLException e) {
  	e.printStackTrace();
    
} catch (Exception e) {
  	e.printStackTrace();
}
```

<hr>

## Ejercicio 13

Crea una aplicación que nos permita gestionar la base de datos *redes*. 

Debe tener un menú desde el que se puedan gestionar (*Create*, *Read*, *Update*, *Delete*) usuarios, posts y comentarios.
