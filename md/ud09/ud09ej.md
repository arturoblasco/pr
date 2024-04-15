**Ejercicio 1**

...

<hr>

**Ejercicio 2 : completo**

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

**Ejercicio 3**

Crea una aplicación que nos permita gestionar la base de datos network. 

Debe tener un menú desde el que se puedan gestionar (Create, Read, Update, Delete) usuarios, posts y comentarios.
