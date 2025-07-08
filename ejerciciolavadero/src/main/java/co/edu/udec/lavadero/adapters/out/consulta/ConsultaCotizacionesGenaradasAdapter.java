package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.CotizacionGeneradaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.CotizacionesGeneradasPort;

public class ConsultaCotizacionesGenaradasAdapter implements CotizacionesGeneradasPort {

    private final Connection connection;

    public ConsultaCotizacionesGenaradasAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<CotizacionGeneradaDto> consultarCotizacionesGeneradas() {
        List<CotizacionGeneradaDto> lista = new ArrayList<>();

        String sql = """
            SELECT c.cotizacion_id, c.codigo, c.estado, e.nombres || ' ' || e.apellidos AS nombre_empleado
            FROM cotizacion c
            JOIN empleado e ON c.empleado_id = e.empleado_id
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new CotizacionGeneradaDto(
                    rs.getInt("cotizacion_id"),
                    rs.getString("codigo"),
                    rs.getString("estado"),
                    rs.getString("nombre_empleado")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar cotizaciones generadas", e);
        }

        return lista;
    } 
}
