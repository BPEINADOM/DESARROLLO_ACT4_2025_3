package co.edu.udec.lavadero.application.ports.out.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.DetalleVentaServicioDto;

public interface DetalleVentaServicioPort {
    List<DetalleVentaServicioDto> consultarDetalleVentaServicios();
}
