package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoPrecioDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosConPrecioCalculadoPort;

public class ConsultaPreciosProductoAdapter implements ProductosConPrecioCalculadoPort {

    private final Connection connection;

    public ConsultaPreciosProductoAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<ProductoPrecioDto> consultarPreciosCalculados() {
        List<ProductoPrecioDto> lista = new ArrayList<>();

        String sql = """
            SELECT producto_id, descripcion AS nombre_producto, precio AS precio_base,
                   porcentaje_iva, valor_iva, precio_iva, precio_iva_descuento, precio_total
            FROM producto
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new ProductoPrecioDto(
                    rs.getInt("producto_id"),
                    rs.getString("nombre_producto"),
                    rs.getInt("precio_base"),
                    rs.getInt("porcentaje_iva"),
                    rs.getInt("valor_iva"),
                    rs.getInt("precio_iva"),
                    rs.getInt("precio_iva_descuento"),
                    rs.getInt("precio_total")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar precios calculados de productos", e);
        }

        return lista;
    }
}
