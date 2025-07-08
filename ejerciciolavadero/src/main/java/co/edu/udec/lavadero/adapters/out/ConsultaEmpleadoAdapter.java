package co.edu.udec.lavadero.adapters.out;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.EmpleadoInformanteDto;
import co.edu.udec.lavadero.application.ports.out.EmpleadosInformanProductosPort;


public class ConsultaEmpleadoAdapter implements EmpleadosInformanProductosPort {

    private final Connection connection;

    public ConsultaEmpleadoAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<EmpleadoInformanteDto> obtenerEmpleadosInformantes() {
        List<EmpleadoInformanteDto> lista = new ArrayList<>();
        String sql = """
            SELECT DISTINCT e.empleado_id, e.nombres, e.apellidos, e.numero_documento, 
                            e.tipo_documento, e.correo
            FROM empleado e
            JOIN cotizacion c ON c.empleado_id = e.empleado_id
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new EmpleadoInformanteDto(
                    rs.getInt("empleado_id"),
                    rs.getString("nombres"),
                    rs.getString("apellidos"),
                    rs.getString("numero_documento"),
                    rs.getString("tipo_documento"),
                    rs.getString("correo")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar empleados informantes", e);
        }

        return lista;
    }
}
