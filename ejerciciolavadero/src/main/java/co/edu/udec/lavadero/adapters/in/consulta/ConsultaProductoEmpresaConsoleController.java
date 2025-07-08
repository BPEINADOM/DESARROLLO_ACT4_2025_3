package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoEmpresaDto;
import co.edu.udec.lavadero.application.service.consulta.producto.ConsultaProductoEmpresaService;

public class ConsultaProductoEmpresaConsoleController {
    private final ConsultaProductoEmpresaService consultaProductoEmpresaService;

    public ConsultaProductoEmpresaConsoleController(ConsultaProductoEmpresaService consultaProductoEmpresaService) {
        this.consultaProductoEmpresaService = consultaProductoEmpresaService;
    }

    public void mostrarProductosPorEmpresa() {
        List<ProductoEmpresaDto> productos = consultaProductoEmpresaService.ejecutarConsulta();
        System.out.println("\nProductos agrupados por empresa:");
        for (ProductoEmpresaDto dto : productos) {
            System.out.printf("ID: %d | %s | Marca: %s | Precio: %d | Empresa: %s\n",
                dto.producto_id, dto.nombre, dto.marca, dto.precio, dto.empresa);
        }
    }
}
