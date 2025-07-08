package co.edu.udec.lavadero.application.service.consulta.solicitudventaproducto;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoAceptadoEnVentaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ProductosAceptadosEnVentaPort;

public class ConsultaProductosAceptadosEnVentaService {
    private final ProductosAceptadosEnVentaPort productosAceptadosEnVentaPortport;

    public ConsultaProductosAceptadosEnVentaService(ProductosAceptadosEnVentaPort productosAceptadosEnVentaPortport) {
        this.productosAceptadosEnVentaPortport = productosAceptadosEnVentaPortport;
    }

    public List<ProductoAceptadoEnVentaDto> ejecutarConsulta() {
        return productosAceptadosEnVentaPortport.consultarProductosAceptados();
    }
}
