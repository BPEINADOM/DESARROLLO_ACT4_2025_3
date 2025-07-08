package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoConsultaDto;
import co.edu.udec.lavadero.application.service.consulta.producto.ConsultaProductoService;

public class ConsultaProductoConsoleController {

    private final ConsultaProductoService consultaProductoService;

    public ConsultaProductoConsoleController(ConsultaProductoService consultaProductoService) {
        this.consultaProductoService = consultaProductoService;
    }

    public void mostrarProductosDisponibles() {
        List<ProductoConsultaDto> productos = consultaProductoService.ejecutarConsulta();

        System.out.println("\nProductos disponibles:");
        for (ProductoConsultaDto dto : productos) {
            System.out.printf("ID: %d | %s | Marca: %s | Precio: $%d | Stock: %d\n",
                dto.producto_id, dto.descripcion, dto.marca, dto.precio, dto.stock);
        }
    }
}
