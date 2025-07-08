package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.DocumentoSolicitudVentaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.DocumentoSolicitudVentaPort;

public class ConsultaDocumentoSolicitudVentaAdapter implements DocumentoSolicitudVentaPort {

    private final Connection connection;

    public ConsultaDocumentoSolicitudVentaAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<DocumentoSolicitudVentaDto> obtenerCopiaSolicitudVenta() {
        List<DocumentoSolicitudVentaDto> lista = new ArrayList<>();

        String sql = """
            SELECT svs.solicitud_servicio_id, svs.placa, svs.marca, svs.tipo, svs.color, svs.servicio,
                   c.nombres || ' ' || c.apellidos AS cliente_nombre,
                   c.numero_documento, c.correo
            FROM solicitudventaservicio svs
            JOIN cliente c ON svs.cliente_id = c.cliente_id
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new DocumentoSolicitudVentaDto(
                    rs.getInt("solicitud_servicio_id"),
                    rs.getString("placa"),
                    rs.getString("marca"),
                    rs.getString("tipo"),
                    rs.getString("color"),
                    rs.getString("servicio"),
                    rs.getString("cliente_nombre"),
                    rs.getString("numero_documento"),
                    rs.getString("correo")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al obtener copia de la solicitud de venta", e);
        }

        return lista;
    }
}
