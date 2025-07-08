package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ProductoPrecioDto;
import co.edu.udec.lavadero.application.service.consulta.producto.ConsultaPreciosProductoService;

public class ConsultaPreciosProductoConsoleController {
    private final ConsultaPreciosProductoService service;

    public ConsultaPreciosProductoConsoleController(ConsultaPreciosProductoService service) {
        this.service = service;
    }

    public void mostrarPreciosCalculados() {
        List<ProductoPrecioDto> productos = service.ejecutarConsulta();

        System.out.println("\n--- Precios de venta de productos ---");
        for (ProductoPrecioDto p : productos) {
            System.out.printf(
                "ID: %d | %s | Base: $%d | IVA (%d%%): $%d | +IVA: $%d | Descuento: $%d | Total: $%d\n",
                p.producto_id, p.nombre, p.precio_base, p.porcentaje_iva, p.valor_iva,
                p.precio_iva, p.precio_iva_descuento, p.precio_total
            );
        }
    }
}
