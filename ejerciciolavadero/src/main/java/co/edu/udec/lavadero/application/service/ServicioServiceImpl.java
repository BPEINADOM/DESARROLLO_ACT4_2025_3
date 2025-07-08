package co.edu.udec.lavadero.application.service;

import java.util.List;
import java.util.Optional;

import co.edu.udec.lavadero.application.ports.in.ServicioServicePort;
import co.edu.udec.lavadero.application.ports.out.ServicioPersistencePort;
import co.edu.udec.lavadero.domain.exception.ServicioNoEncontradoException;
import co.edu.udec.lavadero.domain.model.Servicio;

public class ServicioServiceImpl implements ServicioServicePort {

    private final ServicioPersistencePort servicioPersistencePort;

    public ServicioServiceImpl(ServicioPersistencePort servicioPersistencePort) {
        this.servicioPersistencePort = servicioPersistencePort;
    }

    @Override
    public void crear(Servicio servicio) {
        servicioPersistencePort.guardar(servicio);
    }

    @Override
    public List<Servicio> listarTodos() {
        return servicioPersistencePort.buscarTodos();
    }

    @Override
    public Servicio obtenerPorID(int servicio_id) {
       return servicioPersistencePort.buscarPorID(servicio_id)
       .orElseThrow(() -> new ServicioNoEncontradoException(servicio_id));
    }

    @Override
    public void actualizar(Servicio servicio) {
        if (!servicioPersistencePort.buscarPorID(servicio.getServicio_id()).isPresent()) {
            throw new RuntimeException("Servicio con ID" + servicio.getServicio_id() + "no encontrado para actualizar.");
        }
    }

    @Override
    public void borrar(int servicio_id) {
        servicioPersistencePort.borrar(servicio_id);
    }
    
}
