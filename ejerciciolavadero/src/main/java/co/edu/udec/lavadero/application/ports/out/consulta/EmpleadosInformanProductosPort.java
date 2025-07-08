package co.edu.udec.lavadero.application.ports.out.consulta;

import co.edu.udec.lavadero.adapters.in.dto.EmpleadoInformanteDto;
import java.util.List;

public interface EmpleadosInformanProductosPort {
    List<EmpleadoInformanteDto> obtenerEmpleadosInformantes();
}
