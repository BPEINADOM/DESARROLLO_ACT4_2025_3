package co.edu.udec.lavadero.adapters.out.consulta;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoEmpresaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosPorEmpresaPort;

public class ConsultaProductoEmpresaAdapter implements ProductosPorEmpresaPort {

    private final Connection connection;

    public ConsultaProductoEmpresaAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<ProductoEmpresaDto> consultarProductosPorEmpresa() {
        List<ProductoEmpresaDto> lista = new ArrayList<>();
        String sql = """
            SELECT p.producto_id, p.descripcion AS nombre, p.marca, p.precio, e.nombre AS empresa
            FROM producto p
            JOIN empresa e ON p.empresa_id = e.empresa_id
        """;

        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new ProductoEmpresaDto(
                    rs.getInt("producto_id"),
                    rs.getString("nombre"),
                    rs.getString("marca"),
                    rs.getInt("precio"),
                    rs.getString("empresa")
                ));
            }

        } catch (SQLException e) {
            throw new RuntimeException("Error al consultar productos por empresa", e);
        }

        return lista;
    }
}
