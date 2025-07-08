package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.NotaCorreccionResumenDto;
import co.edu.udec.lavadero.application.ports.out.consulta.NotasCorreccionPort;

public class ConsultaNotasCorreccionAdapter implements NotasCorreccionPort {

    private final Connection connection;

    public ConsultaNotasCorreccionAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<NotaCorreccionResumenDto> consultarNotasCorreccion() {
        List<NotaCorreccionResumenDto> lista = new ArrayList<>();

        String sql = """
            SELECT nota_id, codigo, codigo_pedido, fecha_emision, proveedor_id, empresa_id
            FROM notacorreccionpedido
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new NotaCorreccionResumenDto(
                    rs.getInt("nota_id"),
                    rs.getString("codigo"),
                    rs.getString("codigo_pedido"),
                    rs.getDate("fecha_emision").toLocalDate(),
                    rs.getInt("proveedor_id"),
                    rs.getInt("empresa_id")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar notas de corrección", e);
        }

        return lista;
    }
}
