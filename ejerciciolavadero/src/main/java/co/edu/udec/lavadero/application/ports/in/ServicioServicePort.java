package co.edu.udec.lavadero.application.ports.in;

import java.util.List;

import co.edu.udec.lavadero.domain.model.Servicio;

public interface ServicioServicePort {

    void crear(Servicio servicio);
    List<Servicio> listarTodos();
    Servicio obtenerPorID(int servicio_id);
    void actualizar(Servicio servicio);
    void borrar(int servicio_id);
    
}
