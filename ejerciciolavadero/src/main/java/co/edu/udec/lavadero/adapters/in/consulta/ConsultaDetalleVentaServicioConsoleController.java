package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.DetalleVentaServicioDto;
import co.edu.udec.lavadero.application.service.consulta.solicitudventaservicio.ConsultaDetalleVentaServicioService;

public class ConsultaDetalleVentaServicioConsoleController {

    private final ConsultaDetalleVentaServicioService service;

    public ConsultaDetalleVentaServicioConsoleController(ConsultaDetalleVentaServicioService service) {
        this.service = service;
    }

    public void mostrarDetalleServicios() {
        List<DetalleVentaServicioDto> lista = service.ejecutarConsulta();

        System.out.println("\nDetalle de solicitudes de venta de servicios:");
        for (DetalleVentaServicioDto dto : lista) {
            System.out.printf("ID: %d | Placa: %s | Marca: %s | Tipo: %s | Color: %s | Servicio: %s\n",
                dto.solicitud_servicio_id, dto.placa, dto.marca, dto.tipo, dto.color, dto.servicio);
        }
    }
}
