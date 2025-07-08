package co.edu.udec.lavadero.application.service.consulta.cliente;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.ClienteConVehiculoDto;
import co.edu.udec.lavadero.application.ports.out.consulta.ClientesConVehiculoPort;

public class ConsultaClienteService {
    private final ClientesConVehiculoPort clientesConVehiculoPort;

    public ConsultaClienteService(ClientesConVehiculoPort clientesConVehiculoPort) {
        this.clientesConVehiculoPort = clientesConVehiculoPort;
    }

    public List<ClienteConVehiculoDto> ejecutarConsulta() {
        return clientesConVehiculoPort.obtenerClientesConVehiculo();
    }
}
