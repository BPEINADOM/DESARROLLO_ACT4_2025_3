package co.edu.udec.lavadero.adapters.in.consulta;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ClienteConVehiculoDto;
import co.edu.udec.lavadero.application.service.consulta.cliente.ConsultaClienteService;

public class ConsultaClienteConsoleController {
    private final ConsultaClienteService service;

    public ConsultaClienteConsoleController(ConsultaClienteService service) {
        this.service = service;
    }

    public void mostrarClientesConVehiculos() {
        List<ClienteConVehiculoDto> clientes = service.ejecutarConsulta();

        System.out.println("\n--- Clientes con vehículos registrados ---");
        for (ClienteConVehiculoDto c : clientes) {
            System.out.printf("ID: %d | Nombre: %s %s | Doc: %s %s | Correo: %s\n",
                c.cliente_id, c.nombres, c.apellidos, c.tipo_documento, c.numero_documento, c.correo);
        }
    }
}
