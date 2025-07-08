package co.edu.udec.lavadero.application.service.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.VentaProductoDto;
import co.edu.udec.lavadero.adapters.in.dto.VentaServicioDto;
import co.edu.udec.lavadero.application.ports.out.consulta.VentasProductosPort;
import co.edu.udec.lavadero.application.ports.out.consulta.VentasServiciosPort;

public class ConsultaVentasCombinadasService {
    private final VentasProductosPort ventasProductosPort;
    private final VentasServiciosPort ventasServiciosPort;

    public ConsultaVentasCombinadasService(VentasProductosPort ventasProductosPort, VentasServiciosPort ventasServiciosPort) {
        this.ventasProductosPort = ventasProductosPort;
        this.ventasServiciosPort = ventasServiciosPort;
    }

    public List<VentaProductoDto> obtenerProductos() {
        return ventasProductosPort.obtenerVentasProductos();
    }

    public List<VentaServicioDto> obtenerServicios() {
        return ventasServiciosPort.obtenerVentasServicios();
    }
}
