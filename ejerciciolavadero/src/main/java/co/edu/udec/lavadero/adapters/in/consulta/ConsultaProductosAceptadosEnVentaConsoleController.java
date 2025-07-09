package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoAceptadoEnVentaDto;
import co.edu.udec.lavadero.application.service.consulta.solicitudventaproducto.ConsultaProductosAceptadosEnVentaService;

public class ConsultaProductosAceptadosEnVentaConsoleController {
    private final ConsultaProductosAceptadosEnVentaService service;

    public ConsultaProductosAceptadosEnVentaConsoleController(ConsultaProductosAceptadosEnVentaService service) {
        this.service = service;
    }

    public void mostrarProductosAceptados() {
        List<ProductoAceptadoEnVentaDto> lista = service.ejecutarConsulta();

        System.out.println("\nProductos aceptados correctamente en solicitudes de venta:");
        for (ProductoAceptadoEnVentaDto dto : lista) {
            System.out.printf("SolicitudID: %d | Producto: %s | Marca: %s | Precio: $%d | Detalle: %s\n",
                dto.solicitudProductoId, dto.nombreProducto, dto.marca, dto.precio, dto.detalleArticulo);
        }
    }
}
