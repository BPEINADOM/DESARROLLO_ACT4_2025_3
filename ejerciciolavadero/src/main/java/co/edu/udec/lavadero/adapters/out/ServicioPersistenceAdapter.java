package co.edu.udec.lavadero.adapters.out;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import co.edu.udec.lavadero.application.ports.out.ServicioPersistencePort;
import co.edu.udec.lavadero.domain.model.Servicio;

public class ServicioPersistenceAdapter implements ServicioPersistencePort {
    private final Connection connection;

    public ServicioPersistenceAdapter(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void guardar(Servicio servicio) {
        String sql = """
        INSERT INTO servicio (
            nombre, descripcion, fecha_inicio, fecha_finalizacion,
            hora_inicio, hora_finalizacion, nombre_empleado, precio, porcentaje_iva,
            valor_iva, precio_iva, precio_iva_descuento, precio_total,
            cliente_id, cubiculo_id, solicitud_servicio_id
        ) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        RETURNING servicio_id
    """;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            mapToStatement(servicio, stmt);
          ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            servicio.setServicio_id(rs.getInt("servicio_id"));
        }
    } catch (SQLException e) {
        throw new RuntimeException("Error al guardar servicio", e);
    }
}

    @Override
    public List<Servicio> buscarTodos() {
        List<Servicio> lista = new ArrayList<>();
        String sql = "SELECT * FROM servicio";
        try (Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                lista.add(mapFromResultSet(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al listar servicios", e);
        }
        return lista;
    }

    @Override
    public Optional<Servicio> buscarPorID(int id) {
        String sql = "SELECT * FROM servicio WHERE servicio_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return Optional.of(mapFromResultSet(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error al buscar servicio", e);
        }
        return Optional.empty();
    }


    @Override
    public void actualizar(Servicio servicio) {
        String sql = """
            UPDATE servicio SET
                nombre = ?, descripcion = ?, fecha_inicio = ?, fecha_finalizacion = ?,
                hora_inicio = ?, hora_finalizacion = ?, nombre_empleado = ?, precio = ?, porcentaje_iva = ?,
                valor_iva = ?, precio_iva = ?, precio_iva_descuento = ?, precio_total = ?,
                cliente_id = ?, cubiculo_id = ?, solicitud_servicio_id = ?
            WHERE servicio_id = ?
        """;

        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            mapToStatement(servicio, stmt);
            stmt.setInt(17, servicio.getServicio_id());
            int rowsAffected = stmt.executeUpdate();

        if (rowsAffected == 0) {
            throw new RuntimeException("No se encontró el servicio con ID " + servicio.getServicio_id());
        }

        } catch (SQLException e) {
        throw new RuntimeException("Error al actualizar el servicio.", e);
        }
    }

    @Override
    public void borrar(int id){
        String sql = "DELETE FROM servicio WHERE servicio_id = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error al eliminar servicio", e);
        }
    }


    private void mapToStatement(Servicio servicio, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, servicio.getNombre());
        stmt.setString(2, servicio.getDescripcion());
        stmt.setDate(3, Date.valueOf(servicio.getFecha_inicio()));
        stmt.setDate(4, Date.valueOf(servicio.getFecha_finalizacion()));
        stmt.setString(5, servicio.getHora_inicio());
        stmt.setString(6, servicio.getHora_finalizacion());
        stmt.setString(7, servicio.getNombre_empleado());
        stmt.setInt(8, servicio.getPrecio());
        stmt.setInt(9, servicio.getPorcentaje_iva());
        stmt.setInt(10, servicio.getValor_iva());
        stmt.setInt(11, servicio.getPrecio_iva());
        stmt.setInt(12, servicio.getPrecio_iva_descuento());
        stmt.setInt(13, servicio.getPrecio_total());
        stmt.setObject(14, servicio.getCliente_id(), Types.INTEGER);
        stmt.setObject(15, servicio.getCubiculo_id(), Types.INTEGER);
        stmt.setObject(16, servicio.getSolicitud_servicio_id(), Types.INTEGER);
    }

     private Servicio mapFromResultSet(ResultSet rs) throws SQLException {
        return new Servicio(
            rs.getInt("servicio_id"),
            rs.getString("nombre"),
            rs.getString("descripcion"),
            rs.getDate("fecha_inicio").toLocalDate(),
            rs.getDate("fecha_finalizacion").toLocalDate(),
            rs.getString("hora_inicio"),
            rs.getString("hora_finalizacion"),
            rs.getString("nombre_empleado"),
            rs.getInt("precio"),
            rs.getInt("porcentaje_iva"),
            rs.getInt("valor_iva"),
            rs.getInt("precio_iva"),
            rs.getInt("precio_iva_descuento"),
            rs.getInt("precio_total"),
            getIntegerOrNull(rs, "cliente_id"),
            getIntegerOrNull(rs, "cubiculo_id"),
            getIntegerOrNull(rs, "solicitud_servicio_id")
        );
    }

     private Integer getIntegerOrNull(ResultSet rs, String column) throws SQLException {
        int value = rs.getInt(column);
        return rs.wasNull() ? null : value;
    }
}
