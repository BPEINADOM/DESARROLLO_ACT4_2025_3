package co.edu.udec.lavadero.adapters.in.consulta;

import co.edu.udec.lavadero.adapters.in.dto.VentaProductoDto;
import co.edu.udec.lavadero.adapters.in.dto.VentaServicioDto;
import co.edu.udec.lavadero.application.service.consulta.ConsultaVentasCombinadasService;

public class ConsultaVentasCombinadasConsoleController {

    private final ConsultaVentasCombinadasService service;

    public ConsultaVentasCombinadasConsoleController(ConsultaVentasCombinadasService service) {
        this.service = service;
    }

    public void mostrarVentasSeparadas() {
        System.out.println("\n--- Productos Vendidos ---");
        for (VentaProductoDto p : service.obtenerProductos()) {
            System.out.printf("Solicitud: %d | Código: %s | Detalle: %s | Total: %d\n",
                p.solicitud_producto_id, p.codigo, p.detalle, p.precio_total);
        }

        System.out.println("\n--- Servicios Vendidos ---");
        for (VentaServicioDto s : service.obtenerServicios()) {
            System.out.printf("Solicitud: %d | Placa: %s | Servicio: %s\n",
                s.solicitud_servicio_id, s.placa, s.servicio);
        }
    }
}
