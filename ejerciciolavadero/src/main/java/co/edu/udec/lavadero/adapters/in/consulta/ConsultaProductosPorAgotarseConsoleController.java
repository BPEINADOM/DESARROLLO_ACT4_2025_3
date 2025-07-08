package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoPorAgotarseDto;
import co.edu.udec.lavadero.application.service.consulta.producto.ConsultaProductosPorAgotarseService;

public class ConsultaProductosPorAgotarseConsoleController {
     private final ConsultaProductosPorAgotarseService consultaService;

    public ConsultaProductosPorAgotarseConsoleController(ConsultaProductosPorAgotarseService consultaService) {
        this.consultaService = consultaService;
    }

    public void mostrarProductosPorAgotarse() {
        List<ProductoPorAgotarseDto> productos = consultaService.ejecutarConsulta();

        System.out.println("\nProductos por agotarse (stock <= 10):");
        for (ProductoPorAgotarseDto dto : productos) {
            System.out.printf("ID: %d | %s | Stock: %d\n",
                dto.producto_id, dto.descripcion, dto.stock);
        }
    }
}
