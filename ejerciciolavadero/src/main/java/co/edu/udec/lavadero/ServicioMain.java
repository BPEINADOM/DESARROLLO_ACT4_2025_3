package co.edu.udec.lavadero;

import java.sql.Connection;

import co.edu.udec.lavadero.adapters.in.ServicioConsoleController;
import co.edu.udec.lavadero.adapters.out.ServicioPersistenceAdapter;
import co.edu.udec.lavadero.application.ports.in.ServicioServicePort;
import co.edu.udec.lavadero.application.ports.out.ServicioPersistencePort;
import co.edu.udec.lavadero.application.service.ServicioServiceImpl;
import co.edu.udec.lavadero.infraestructure.config.ConexionPostgreSQL;

public class ServicioMain {

    public static void main(String[] args) {
        try (Connection connection = ConexionPostgreSQL.getConnection()) {

            ServicioPersistencePort servicioPersistence = new ServicioPersistenceAdapter(connection);
            ServicioServicePort servicioService = new ServicioServiceImpl(servicioPersistence);
            ServicioConsoleController servicioController = new ServicioConsoleController(servicioService);

            servicioController.menuServicio();

        } catch (Exception e) {
            System.out.println("Error al iniciar el sistema: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
