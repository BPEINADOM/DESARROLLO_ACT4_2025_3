package co.edu.udec.lavadero.application.service.consulta.producto;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoEmpresaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosPorEmpresaPort;

public class ConsultaProductoEmpresaService {
    private final ProductosPorEmpresaPort productosPorEmpresaPort;

    public ConsultaProductoEmpresaService(ProductosPorEmpresaPort productosPorEmpresaPort) {
        this.productosPorEmpresaPort = productosPorEmpresaPort;
    }

    public List<ProductoEmpresaDto> ejecutarConsulta() {
        return productosPorEmpresaPort.consultarProductosPorEmpresa();
    }
}
