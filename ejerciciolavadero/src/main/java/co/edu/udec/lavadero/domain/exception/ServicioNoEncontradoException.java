package co.edu.udec.lavadero.domain.exception;

public class ServicioNoEncontradoException extends RuntimeException {

    public ServicioNoEncontradoException(int id) {
        super("Servicio con ID " + id + " no encontrado.");
    }

}


