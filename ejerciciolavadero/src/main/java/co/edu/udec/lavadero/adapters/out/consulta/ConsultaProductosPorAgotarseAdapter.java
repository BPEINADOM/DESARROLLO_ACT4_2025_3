package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoPorAgotarseDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosPorAgotarsePort;

public class ConsultaProductosPorAgotarseAdapter implements ProductosPorAgotarsePort {

    private final Connection connection;

    public ConsultaProductosPorAgotarseAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<ProductoPorAgotarseDto> consultarProductosPorAgotarse() {
        List<ProductoPorAgotarseDto> lista = new ArrayList<>();
        String sql = """
            SELECT producto_id, descripcion, stock
            FROM producto
            WHERE stock <= 10
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new ProductoPorAgotarseDto(
                    rs.getInt("producto_id"),
                    rs.getString("descripcion"),
                    rs.getInt("stock")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar productos por agotarse", e);
        }

        return lista;
    }
}
