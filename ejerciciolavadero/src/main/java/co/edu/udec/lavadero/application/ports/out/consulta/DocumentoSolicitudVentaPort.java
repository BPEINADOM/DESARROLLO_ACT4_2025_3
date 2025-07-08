package co.edu.udec.lavadero.application.ports.out.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.DocumentoSolicitudVentaDto;

public interface DocumentoSolicitudVentaPort {
    List<DocumentoSolicitudVentaDto> obtenerCopiaSolicitudVenta();
}
