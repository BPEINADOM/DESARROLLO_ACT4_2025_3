package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.NotaCorreccionResumenDto;
import co.edu.udec.lavadero.application.service.consulta.notacorreccionpedido.ConsultaNotasCorreccionService;

public class ConsultaNotasCorreccionConsoleController {
    private final ConsultaNotasCorreccionService service;

    public ConsultaNotasCorreccionConsoleController(ConsultaNotasCorreccionService service) {
        this.service = service;
    }

    public void mostrarNotasCorreccion() {
        List<NotaCorreccionResumenDto> lista = service.ejecutarConsulta();

        System.out.println("\nNotas de corrección recibidas:");
        for (NotaCorreccionResumenDto dto : lista) {
            System.out.printf("Nota ID: %d | Código Nota: %s | Código Pedido: %s | Fecha: %s | Proveedor: %d | Empresa: %d\n",
                dto.nota_id, dto.codigo, dto.codigo_pedido,
                dto.fecha_emision, dto.proveedor_id, dto.empresa_id);
        }
    }
}
