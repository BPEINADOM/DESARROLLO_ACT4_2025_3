package co.edu.udec.lavadero.adapters.in.consulta;

import co.edu.udec.lavadero.adapters.in.dto.TotalesVentaProductoDto;
import co.edu.udec.lavadero.adapters.in.dto.TotalesVentaServicioDto;
import co.edu.udec.lavadero.application.service.consulta.ConsultaTotalesVentaService;

public class ConsultaTotalesVentaConsoleController {
    private final ConsultaTotalesVentaService service;

    public ConsultaTotalesVentaConsoleController(ConsultaTotalesVentaService service) {
        this.service = service;
    }

    public void mostrarTotalesVenta() {
        System.out.println("\n--- Totales de Productos Vendidos ---");
        for (TotalesVentaProductoDto p : service.obtenerTotalesProductos()) {
            System.out.printf("Solicitud: %d | Cantidad: %d | Precio U: %d | Total: %d\n",
                p.solicitud_producto_id, p.numero_item, p.precio, p.precio_total);
        }

        System.out.println("\n--- Servicios Vendidos (con tiempo estimado) ---");
        for (TotalesVentaServicioDto s : service.obtenerTotalesServicios()) {
            System.out.printf("Solicitud: %d | Servicio: %s | Vehículo: %s\n",
                s.solicitud_servicio_id, s.servicio, s.tipo);
        }
    }
}
