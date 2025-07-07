package co.edu.udec.lavadero.application.ports.in;

import java.util.List;
import java.util.Optional;

import co.edu.udec.lavadero.domain.model.Servicio;

public interface ServicioServicePort {

    void crear(Servicio servicio);
    List<Servicio> listarTodos();
    Optional<Servicio> obtenerPorID(int servicio_id);
    void actualizar(Servicio servicio);
    void borrar(int servicio_id);
    
}
