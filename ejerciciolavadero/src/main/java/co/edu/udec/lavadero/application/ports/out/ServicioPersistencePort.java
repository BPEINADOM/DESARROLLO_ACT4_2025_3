package co.edu.udec.lavadero.application.ports.out;

import java.util.List;
import java.util.Optional;

import co.edu.udec.lavadero.domain.model.Servicio;

public interface ServicioPersistencePort {

    void guardar(Servicio servicio);
    List<Servicio> buscarTodos();
    Optional<Servicio> buscarPorID(int servicio_id);
    void actualizar(Servicio servicio);
    void borrar(int servicio_id);
    
}
