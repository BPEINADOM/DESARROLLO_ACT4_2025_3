package co.edu.udec.lavadero.application.service.consulta.notacorreccionpedido;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.NotaCorreccionResumenDto;
import co.edu.udec.lavadero.application.ports.out.consulta.NotasCorreccionPort;

public class ConsultaNotasCorreccionService {
    private final NotasCorreccionPort notasCorreccionPort;

    public ConsultaNotasCorreccionService(NotasCorreccionPort notasCorreccionPort) {
        this.notasCorreccionPort = notasCorreccionPort;
    }

    public List<NotaCorreccionResumenDto> ejecutarConsulta() {
        return notasCorreccionPort.consultarNotasCorreccion();
    }
}
