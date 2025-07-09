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
            SELECT svp.solicitud_producto_id, svp.detalle_articulo, p.descripcion AS nombre_producto, p.precio, p.marca
            FROM producto p
            JOIN solicitudventaproducto svp ON p.solicitud_producto_id = svp.solicitud_producto_id;
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new ProductoAceptadoEnVentaDto(
                    rs.getInt("solicitud_producto_id"),
                    rs.getString("detalle_articulo"),
                    rs.getString("nombre_producto"),
                    rs.getInt("precio"),
                    rs.getString("marca")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar productos aceptados en solicitudes", e);
        }

        return lista;
    }

}
