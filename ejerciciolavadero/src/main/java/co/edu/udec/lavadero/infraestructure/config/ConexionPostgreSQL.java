package co.edu.udec.lavadero.infraestructure.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionPostgreSQL {

    private static final String URL = "jbdc:postgresql://localhost:5432/lavadero";
    private static final String USER = "usuario_lavadero";
    private static final String PASSWORD = "root";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
