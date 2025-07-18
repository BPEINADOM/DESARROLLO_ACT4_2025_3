package co.edu.udec.lavadero.application.service.consulta.producto;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoPorAgotarseDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosPorAgotarsePort;

public class ConsultaProductosPorAgotarseService {

    
    private final ProductosPorAgotarsePort productosPorAgotarsePort;

    public ConsultaProductosPorAgotarseService(ProductosPorAgotarsePort productosPorAgotarsePort) {
        this.productosPorAgotarsePort = productosPorAgotarsePort;
    }

    public List<ProductoPorAgotarseDto> ejecutarConsulta() {
        return productosPorAgotarsePort.consultarProductosPorAgotarse();
    }
}
