package co.edu.udec.lavadero.application.service.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.TotalesVentaProductoDto;
import co.edu.udec.lavadero.adapters.in.dto.TotalesVentaServicioDto;
import co.edu.udec.lavadero.application.ports.out.consulta.TotalesVentaProductoPort;
import co.edu.udec.lavadero.application.ports.out.consulta.TotalesVentaServicioPort;

public class ConsultaTotalesVentaService {

    private final TotalesVentaProductoPort totalesVentaProductoPort;
    private final TotalesVentaServicioPort totalesVentaServicioPort;

    public ConsultaTotalesVentaService(TotalesVentaProductoPort totalesVentaProductoPort, TotalesVentaServicioPort totalesVentaServicioPort) {
        this.totalesVentaProductoPort = totalesVentaProductoPort;
        this.totalesVentaServicioPort = totalesVentaServicioPort;
    }

    public List<TotalesVentaProductoDto> obtenerTotalesProductos() {
        return totalesVentaProductoPort.consultarTotalesProducto();
    }

    public List<TotalesVentaServicioDto> obtenerTotalesServicios() {
        return totalesVentaServicioPort.consultarTotalesServicio();
    }
}
