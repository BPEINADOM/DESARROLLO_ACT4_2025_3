package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.TotalesVentaServicioDto;
import co.edu.udec.lavadero.application.ports.out.consulta.TotalesVentaServicioPort;

public class ConsultaTotalesVentaServicioAdapter implements TotalesVentaServicioPort {

    private final Connection connection;

    public ConsultaTotalesVentaServicioAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<TotalesVentaServicioDto> consultarTotalesServicio() {
        List<TotalesVentaServicioDto> lista = new ArrayList<>();

        String sql = """
            SELECT solicitud_servicio_id, servicio, tipo
            FROM solicitudventaservicio
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new TotalesVentaServicioDto(
                    rs.getInt("solicitud_servicio_id"),
                    rs.getString("servicio"),
                    rs.getString("tipo")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar totales de servicios", e);
        }

        return lista;
    }
}
