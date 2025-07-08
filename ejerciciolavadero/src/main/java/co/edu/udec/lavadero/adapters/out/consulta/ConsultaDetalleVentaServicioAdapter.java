package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.DetalleVentaServicioDto;
import co.edu.udec.lavadero.application.ports.out.consulta.DetalleVentaServicioPort;

public class ConsultaDetalleVentaServicioAdapter implements DetalleVentaServicioPort {

    private final Connection connection;

    public ConsultaDetalleVentaServicioAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<DetalleVentaServicioDto> consultarDetalleVentaServicios() {
        List<DetalleVentaServicioDto> lista = new ArrayList<>();

        String sql = """
            SELECT solicitud_servicio_id, placa, marca, tipo, color, servicio
            FROM solicitudventaservicio
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new DetalleVentaServicioDto(
                    rs.getInt("solicitud_servicio_id"),
                    rs.getString("placa"),
                    rs.getString("marca"),
                    rs.getString("tipo"),
                    rs.getString("color"),
                    rs.getString("servicio")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar ventas de servicios", e);
        }

        return lista;
    }
}
