package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.TotalesVentaProductoDto;
import co.edu.udec.lavadero.application.ports.out.consulta.TotalesVentaProductoPort;

public class ConsultaTotalesVentaProductoAdapter implements TotalesVentaProductoPort {

    private final Connection connection;

    public ConsultaTotalesVentaProductoAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<TotalesVentaProductoDto> consultarTotalesProducto() {
        List<TotalesVentaProductoDto> lista = new ArrayList<>();

        String sql = """
            SELECT solicitud_producto_id, precio, numero_item AS cantidad, precio_total
            FROM solicitudventaproducto
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(new TotalesVentaProductoDto(
                    rs.getInt("solicitud_producto_id"),
                    rs.getInt("precio"),
                    rs.getInt("cantidad"),
                    rs.getInt("precio_total")
                ));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar totales de productos", e);
        }

        return lista;
    }

}
