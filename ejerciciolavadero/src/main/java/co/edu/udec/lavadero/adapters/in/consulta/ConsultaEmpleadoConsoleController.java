package co.edu.udec.lavadero.adapters.in.consulta;

import co.edu.udec.lavadero.adapters.in.dto.EmpleadoInformanteDto;
import co.edu.udec.lavadero.application.service.consulta.empleado.ConsultaEmpleadoService;

import java.util.List;

public class ConsultaEmpleadoConsoleController {

    private final ConsultaEmpleadoService consultaEmpleadoService;

    public ConsultaEmpleadoConsoleController(ConsultaEmpleadoService consultaEmpleadoService) {
        this.consultaEmpleadoService = consultaEmpleadoService;
    }

    public void mostrarEmpleadosInformantes() {
        List<EmpleadoInformanteDto> empleados = consultaEmpleadoService.ejecutarConsulta();

        System.out.println("\nEmpleados que han informado a clientes sobre productos y servicios:");
        for (EmpleadoInformanteDto dto : empleados) {
            System.out.printf("ID: %d | Nombre: %s %s | Doc: %s %s | Correo: %s\n",
                dto.empleado_id, dto.nombres, dto.apellidos,
                dto.tipoDocumento, dto.numeroDocumento, dto.correo);
        }
    }
}
