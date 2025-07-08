package co.edu.udec.lavadero.application.service.consulta.solicitudventaservicio;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.DocumentoSolicitudVentaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.DocumentoSolicitudVentaPort;

public class ConsultaDocumentoSolicitudVentaService {
    private final DocumentoSolicitudVentaPort documentoSolicitudVentaPort;

    public ConsultaDocumentoSolicitudVentaService(DocumentoSolicitudVentaPort documentoSolicitudVentaPort) {
        this.documentoSolicitudVentaPort = documentoSolicitudVentaPort;
    }

    public List<DocumentoSolicitudVentaDto> ejecutarConsulta() {
        return documentoSolicitudVentaPort.obtenerCopiaSolicitudVenta();
    }
}
