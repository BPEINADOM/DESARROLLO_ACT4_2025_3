package co.edu.udec.lavadero.application.service;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoConsultaDto;
import co.edu.udec.lavadero.application.ports.out.ProductosDisponiblesPort;

public class ConsultaProductoService {
    private final ProductosDisponiblesPort productosDisponiblesPort;

    public ConsultaProductoService(ProductosDisponiblesPort productosDisponiblesPort) {
        this.productosDisponiblesPort = productosDisponiblesPort;
    }

    public List<ProductoConsultaDto> ejecutarConsulta() {
        return productosDisponiblesPort.consultarProductos();
    }
}
