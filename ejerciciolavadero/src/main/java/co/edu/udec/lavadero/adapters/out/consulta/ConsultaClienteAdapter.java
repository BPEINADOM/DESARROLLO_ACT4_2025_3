package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ClienteConVehiculoDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ClientesConVehiculoPort;

public class ConsultaClienteAdapter implements ClientesConVehiculoPort {
    private final Connection connection;

    public ConsultaClienteAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<ClienteConVehiculoDto> obtenerClientesConVehiculo() {
        List<ClienteConVehiculoDto> lista = new ArrayList<>();

        String sql = """
            SELECT DISTINCT c.cliente_id, c.nombre, c.apellido, c.correo
            FROM cliente c
            JOIN vehiculo v ON c.cliente_id = v.cliente_id
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new ClienteConVehiculoDto(
                    rs.getInt("cliente_id"),
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("correo")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar clientes con vehículos", e);
        }

        return lista;
    }
}
