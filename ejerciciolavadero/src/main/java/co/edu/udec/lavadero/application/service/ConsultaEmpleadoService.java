package co.edu.udec.lavadero.application.service;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.EmpleadoInformanteDto;
import co.edu.udec.lavadero.application.ports.out.EmpleadosInformanProductosPort;

public class ConsultaEmpleadoService {
    private final EmpleadosInformanProductosPort empleadosInformanProductosPort;

    public ConsultaEmpleadoService(EmpleadosInformanProductosPort empleadosInformanProductosPort) {
        this.empleadosInformanProductosPort = empleadosInformanProductosPort;
    }

    public List<EmpleadoInformanteDto> ejecutarConsulta() {
        return empleadosInformanProductosPort.obtenerEmpleadosInformantes();
    }
}
