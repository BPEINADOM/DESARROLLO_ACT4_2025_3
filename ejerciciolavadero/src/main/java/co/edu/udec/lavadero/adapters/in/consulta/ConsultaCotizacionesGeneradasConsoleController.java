package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.CotizacionGeneradaDto;
import co.edu.udec.lavadero.application.service.consulta.cotizacion.ConsultaCotizacionesGeneradasService;

public class ConsultaCotizacionesGeneradasConsoleController {
    
    private final ConsultaCotizacionesGeneradasService consultaCotizacionesGeneradasService;

    public ConsultaCotizacionesGeneradasConsoleController(ConsultaCotizacionesGeneradasService consultaCotizacionesGeneradasService) {
        this.consultaCotizacionesGeneradasService = consultaCotizacionesGeneradasService;
    }

    public void mostrarCotizacionesGeneradas() {
        List<CotizacionGeneradaDto> lista = consultaCotizacionesGeneradasService.ejecutarConsulta();

        System.out.println("\nCotizaciones generadas por empleados:");
        for (CotizacionGeneradaDto dto : lista) {
            System.out.printf("ID: %d | Código: %s | Estado: %s | Empleado: %s\n",
                dto.cotizacion_id, dto.codigo, dto.estado, dto.nombreEmpleado);
        }
    }
}
