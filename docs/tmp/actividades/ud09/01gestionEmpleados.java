package ud09.gestionEmpleados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GestionEmpleados {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mi_basededatos", "usuario", "contraseña")) {
            // Listar empleados
            listarEmpleados(connection);

            // Actualizar salarios
            actualizarSalarios(connection);

            // Eliminar empleados
            eliminarEmpleados(connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void listarEmpleados(Connection connection) throws SQLException {
        System.out.println("Listado de empleados:");
        try (Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY)) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM empleados");
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt("id") + ", Nombre: " + resultSet.getString("nombre") + ", Salario: " + resultSet.getDouble("salario"));
            }
        }
        System.out.println();
    }

    private static void actualizarSalarios(Connection connection) throws SQLException {
        System.out.println("Actualizando salarios...");
        try (Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_UPDATABLE)) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM empleados");
            while (resultSet.next()) {
                double nuevoSalario = resultSet.getDouble("salario") * 1.10; // Incremento del 10%
                resultSet.updateDouble("salario", nuevoSalario);
                resultSet.updateRow(); // Actualizar la fila en la base de datos
            }
        }
        System.out.println("Salarios actualizados.\n");
    }

    private static void eliminarEmpleados(Connection connection) throws SQLException {
        System.out.println("Eliminando empleados con salario menor a $2000...");
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("DELETE FROM empleados WHERE salario < 2000");
        }
        System.out.println("Empleados eliminados.\n");
    }
}
