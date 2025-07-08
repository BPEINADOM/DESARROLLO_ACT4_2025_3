package co.edu.udec.lavadero.application.ports.out.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.VentaProductoDto;

public interface VentasProductosPort {
    List<VentaProductoDto> obtenerVentasProductos();
}
