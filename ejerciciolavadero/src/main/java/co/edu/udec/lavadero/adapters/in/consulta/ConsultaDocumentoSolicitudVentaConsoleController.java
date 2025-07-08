package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.DocumentoSolicitudVentaDto;
import co.edu.udec.lavadero.application.service.consulta.solicitudventaservicio.ConsultaDocumentoSolicitudVentaService;

public class ConsultaDocumentoSolicitudVentaConsoleController {
    private final ConsultaDocumentoSolicitudVentaService service;

    public ConsultaDocumentoSolicitudVentaConsoleController(ConsultaDocumentoSolicitudVentaService service) {
        this.service = service;
    }

    public void mostrarCopiaSolicitud() {
        List<DocumentoSolicitudVentaDto> lista = service.ejecutarConsulta();

        System.out.println("\n--- Copia de solicitudes de venta de servicios ---");
        for (DocumentoSolicitudVentaDto dto : lista) {
            System.out.printf(
                "Solicitud: %d | Placa: %s | Marca: %s | Tipo: %s | Color: %s | Servicio: %s\n" +
                "Cliente: %s | Correo: %s\n\n",
                dto.solicitud_servicio_id, dto.placa, dto.marca, dto.tipo, dto.color, dto.servicio,
                dto.clienteNombre, dto.clienteCorreo
            );
        }
    }
}
