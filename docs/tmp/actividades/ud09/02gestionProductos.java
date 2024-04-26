 
import java.sql.*;

public class ManejoProductos {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    private int currentPage = 1;
    private final int PAGE_SIZE = 5;

    public ManejoProductos() {
        try {
            // Establecer la conexión a la base de datos
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tu_basededatos", "usuario", "contraseña");
            statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void mostrarProductosPorPagina() {
        try {
            // Calcular el índice inicial del producto en la página actual
            int startIndex = (currentPage - 1) * PAGE_SIZE;

            // Ejecutar la consulta SQL para obtener los productos de la página actual
            resultSet = statement.executeQuery("SELECT * FROM productos LIMIT " + startIndex + ", " + PAGE_SIZE);

            // Mostrar los productos de la página actual
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                double precio = resultSet.getDouble("precio");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Precio: " + precio);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void irAPrimeraPagina() {
        currentPage = 1;
    }

    public void paginaSiguiente() {
        currentPage++;
    }

    public void paginaAnterior() {
        if (currentPage > 1) {
            currentPage--;
        }
    }

    public void irAUltimaPagina() {
        try {
            // Mover el cursor al final del conjunto de resultados
            resultSet.last();

            // Calcular el número total de páginas
            int totalProducts = resultSet.getRow();
            int totalPages = (int) Math.ceil((double) totalProducts / PAGE_SIZE);

            // Ir a la última página
            currentPage = totalPages;
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void irAPaginaEspecifica(int pageNumber) {
        if (pageNumber >= 1) {
            currentPage = pageNumber;
        }
    }

    public void buscarProductoPorNombre(String nombre) {
        try {
            // Ejecutar la consulta SQL para buscar el producto por nombre
            resultSet = statement.executeQuery("SELECT * FROM productos WHERE nombre = '" + nombre + "'");

            // Mostrar los productos encontrados
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String productName = resultSet.getString("nombre");
                double price = resultSet.getDouble("precio");
                System.out.println("ID: " + id + ", Nombre: " + productName + ", Precio: " + price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ManejoProductos manejador = new ManejoProductos();
        // Ejemplo de uso
        manejador.mostrarProductosPorPagina();
        // Para cambiar de página
        manejador.paginaSiguiente();
        manejador.mostrarProductosPorPagina();
        // Para buscar un producto por nombre
        manejador.buscarProductoPorNombre("NombreDelProducto");
    }
}
