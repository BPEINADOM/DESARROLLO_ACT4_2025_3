package co.edu.udec.lavadero.application.service.consulta.solicitudventaservicio;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.DetalleVentaServicioDto;
import co.edu.udec.lavadero.application.ports.out.consulta.DetalleVentaServicioPort;

public class ConsultaDetalleVentaServicioService {

    private final DetalleVentaServicioPort detalleVentaServicioPort;

    public ConsultaDetalleVentaServicioService(DetalleVentaServicioPort detalleVentaServicioPort) {
        this.detalleVentaServicioPort = detalleVentaServicioPort;
    }

    public List<DetalleVentaServicioDto> ejecutarConsulta() {
        return detalleVentaServicioPort.consultarDetalleVentaServicios();
    }

}
