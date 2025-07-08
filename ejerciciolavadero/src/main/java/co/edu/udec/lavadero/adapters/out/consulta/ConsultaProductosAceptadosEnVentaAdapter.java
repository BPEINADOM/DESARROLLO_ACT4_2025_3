package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoAceptadoEnVentaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosAceptadosEnVentaPort;

public class ConsultaProductosAceptadosEnVentaAdapter implements ProductosAceptadosEnVentaPort {

    private final Connection connection;

    public ConsultaProductosAceptadosEnVentaAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<ProductoAceptadoEnVentaDto> consultarProductosAceptados() {
        List<ProductoAceptadoEnVentaDto> lista = new ArrayList<>();

        String sql = """
            SELECT svp.solicitud_venta_producto_id, p.descripcion AS nombre_producto, svp.cantidad
            FROM solicitudventaproducto svp
            JOIN producto p ON svp.producto_id = p.producto_id
            WHERE svp.estado ILIKE 'aceptado'
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new ProductoAceptadoEnVentaDto(
                    rs.getInt("solicitud_venta_producto_id"),
                    rs.getString("nombre_producto"),
                    rs.getInt("cantidad")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar productos aceptados en solicitudes", e);
        }

        return lista;
    }

}
