package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoConsultaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosDisponiblesPort;

public class ConsultaProductoAdapter implements ProductosDisponiblesPort{

    private final Connection connection;

    public ConsultaProductoAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<ProductoConsultaDto> consultarProductos() {
        List<ProductoConsultaDto> lista = new ArrayList<>();
        String sql = """
            SELECT producto_id, descripcion, marca, precio, stock
            FROM producto
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new ProductoConsultaDto(
                    rs.getInt("producto_id"),
                    rs.getString("descripcion"),
                    rs.getString("marca"),
                    rs.getInt("precio"),
                    rs.getInt("stock")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar productos", e);
        }

        return lista;
    }

}
