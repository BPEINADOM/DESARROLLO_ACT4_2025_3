package co.edu.udec.lavadero.application.service.consulta.producto;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoPrecioDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosConPrecioCalculadoPort;

public class ConsultaPreciosProductoService {

    private final ProductosConPrecioCalculadoPort precioCalculadoPort;

    public ConsultaPreciosProductoService(ProductosConPrecioCalculadoPort precioCalculadoPort) {
        this.precioCalculadoPort = precioCalculadoPort;
    }

    public List<ProductoPrecioDto> ejecutarConsulta() {
        return precioCalculadoPort.consultarPreciosCalculados();
    }

}
