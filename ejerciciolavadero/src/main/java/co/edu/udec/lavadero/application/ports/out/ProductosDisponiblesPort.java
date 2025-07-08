package co.edu.udec.lavadero.application.ports.out;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoConsultaDto;

public interface ProductosDisponiblesPort {
    List<ProductoConsultaDto> consultarProductos();
}

