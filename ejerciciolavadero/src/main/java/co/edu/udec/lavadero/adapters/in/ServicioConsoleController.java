package co.edu.udec.lavadero.adapters.in;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import co.edu.udec.lavadero.application.ports.in.ServicioServicePort;
import co.edu.udec.lavadero.domain.model.Servicio;

public class ServicioConsoleController {

    private final ServicioServicePort servicioService;
    private final Scanner scanner = new Scanner(System.in);

    public ServicioConsoleController(ServicioServicePort servicioService) {
        this.servicioService = servicioService;
    }

    public void menuServicio() {
        int opcion;

        do {
            System.out.println("---------- Menu de Servicio ----------");
            System.out.println("1. Crear");
            System.out.println("2. Listar Servicios");
            System.out.println("3. Buscar por ID");
            System.out.println("4. Actualizar Servicio");
            System.out.println("5. Eliminar Servicio");
            System.out.println("0. Salir del Menu");
            System.out.println("----------------------------------------");
            opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1 -> crear();
                case 2 -> listar();
                case 3 -> buscarporID();
                case 4 -> actualizar();
                case 5 -> borrar();
            }

        } while (opcion != 0);
    }

    private void crear() {
        System.out.println("---------- Creacion de Servicio ----------");
        Servicio servicio = capturarDatosServicio(false);
        servicioService.crear(servicio);
        System.out.println("¡Servicio creado con exito!");
    }

    private void listar() {
        List<Servicio> servicios = servicioService.listarTodos();
        System.out.println("---------- Lista de Servicios ----------");
        for (Servicio servicio : servicios) {
            System.out.printf("%d - %s - $%d\n", servicio.getServicio_id(), servicio.getNombre(), servicio.getPrecio_total());
        }
    }

    private void buscarporID() {
        System.out.println("Inserte el ID del servicio a buscar: ");
        int servicio_id = Integer.parseInt(scanner.nextLine());
        Optional<Servicio> servicio = servicioService.obtenerPorID(servicio_id);

        if (servicio.isPresent()) {
            Servicio s = servicio.get();
            System.out.printf("Nombre: %s\nDescripción: %s\nPrecio total: %d\n",
                s.getNombre(), s.getDescripcion(), s.getPrecio_total());
        } else {
            System.out.println("Servicio no encontrado.");
        }
    }

    private void actualizar() {
        System.out.println("Inserte el ID del servicio a actualizar: ");
        int servicio_id = Integer.parseInt(scanner.nextLine());
        Optional<Servicio> servicio = servicioService.obtenerPorID(servicio_id);

        if (servicio.isEmpty()) {
            System.out.println("Servicio no encontrado.");
            return;
        }

        System.out.println("---------- Actualizar Servicio ----------");
        Servicio servicioActualizado = capturarDatosServicio(true);
        servicioService.actualizar(servicioActualizado);
        System.out.println("Servicio actualizado correctamente.");
    }

    private void borrar() {
        System.out.println("Inserte el ID del servicio a eliminar: ");
        int servicio_id = Integer.parseInt(scanner.nextLine());

        servicioService.borrar(servicio_id);
        System.out.println("Servicio eliminado correctamente.");
    }

    private Servicio capturarDatosServicio(boolean incluirId) {
        int id = incluirId ? Integer.parseInt(scannerLine("ID del servicio existente: ")) : 0;

        String nombre = scannerLine("Nombre: ");
        String descripcion = scannerLine("Descripción: ");
        LocalDate fechaInicio = LocalDate.parse(scannerLine("Fecha inicio: "));
        LocalDate fechaFin = LocalDate.parse(scannerLine("Fecha finalización: "));
        String horaInicio = scannerLine("Hora inicio: ");
        String horaFin = scannerLine("Hora finalización: ");
        String nombreEmpleado = scannerLine("Nombre del empleado: ");
        int precio = Integer.parseInt(scannerLine("Precio base: "));
        int porcentajeIva = Integer.parseInt(scannerLine("Porcentaje IVA: "));
        int valorIva = Integer.parseInt(scannerLine("Valor IVA: "));
        int precioIva = Integer.parseInt(scannerLine("Precio + IVA: "));
        int precioIvaDescuento = Integer.parseInt(scannerLine("Precio + IVA con descuento: "));
        int precioTotal = Integer.parseInt(scannerLine("Precio total: "));
        int clienteId = Integer.parseInt(scannerLine("ID cliente: "));
        int cubiculoId = Integer.parseInt(scannerLine("ID cubículo: "));
        int solicitudId = Integer.parseInt(scannerLine("ID solicitud servicio: "));

        return new Servicio(
            id, nombre, descripcion, fechaInicio, fechaFin, horaInicio, horaFin, nombreEmpleado,
            precio, porcentajeIva, valorIva, precioIva, precioIvaDescuento, precioTotal,
            clienteId, cubiculoId, solicitudId
        );
    }

    private String scannerLine(String label) {
        System.out.print(label);
        return scanner.nextLine();
    }
}


