package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.VentaProductoDto;
import co.edu.udec.lavadero.application.ports.out.consulta.VentasProductosPort;

public class ConsultaVentasProductosAdapter implements VentasProductosPort {

    private final Connection connection;

    public ConsultaVentasProductosAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<VentaProductoDto> obtenerVentasProductos() {
        List<VentaProductoDto> lista = new ArrayList<>();

        String sql = """
            SELECT solicitud_producto_id, codigo, detalle_articulo, precio_total
            FROM solicitudventaproducto
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new VentaProductoDto(
                    rs.getInt("solicitud_producto_id"),
                    rs.getString("codigo"),
                    rs.getString("detalle_articulo"),
                    rs.getInt("precio_total")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar ventas de productos", e);
        }

        return lista;
    }
}
