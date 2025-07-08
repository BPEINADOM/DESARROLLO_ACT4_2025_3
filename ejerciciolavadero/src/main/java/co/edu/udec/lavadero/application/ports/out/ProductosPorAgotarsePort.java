package co.edu.udec.lavadero.application.ports.out;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoPorAgotarseDto;

public interface ProductosPorAgotarsePort {
    List<ProductoPorAgotarseDto> consultarProductosPorAgotarse();
    
}

