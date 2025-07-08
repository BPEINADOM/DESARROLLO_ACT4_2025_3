package co.edu.udec.lavadero;

import java.sql.Connection;
import java.util.Scanner;

import co.edu.udec.lavadero.adapters.in.consulta.ConsultaClienteConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaCotizacionesGeneradasConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaDocumentoSolicitudVentaConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaEmpleadoConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaNotasCorreccionConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaPreciosProductoConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaProductoConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaProductoEmpresaConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaProductosAceptadosEnVentaConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaTotalesVentaConsoleController;
import co.edu.udec.lavadero.adapters.in.consulta.ConsultaVentasCombinadasConsoleController;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaClienteAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaCotizacionesGenaradasAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaDocumentoSolicitudVentaAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaEmpleadoAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaNotasCorreccionAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaPreciosProductoAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaProductoAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaProductoEmpresaAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaProductosAceptadosEnVentaAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaTotalesVentaProductoAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaTotalesVentaServicioAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaVentasProductosAdapter;
import co.edu.udec.lavadero.adapters.out.consulta.ConsultaVentasServiciosAdapter;
import co.edu.udec.lavadero.application.service.consulta.ConsultaTotalesVentaService;
import co.edu.udec.lavadero.application.service.consulta.ConsultaVentasCombinadasService;
import co.edu.udec.lavadero.application.service.consulta.cliente.ConsultaClienteService;
import co.edu.udec.lavadero.application.service.consulta.cotizacion.ConsultaCotizacionesGeneradasService;
import co.edu.udec.lavadero.application.service.consulta.empleado.ConsultaEmpleadoService;
import co.edu.udec.lavadero.application.service.consulta.notacorreccionpedido.ConsultaNotasCorreccionService;
import co.edu.udec.lavadero.application.service.consulta.producto.ConsultaPreciosProductoService;
import co.edu.udec.lavadero.application.service.consulta.producto.ConsultaProductoEmpresaService;
import co.edu.udec.lavadero.application.service.consulta.producto.ConsultaProductoService;
import co.edu.udec.lavadero.application.service.consulta.solicitudventaproducto.ConsultaProductosAceptadosEnVentaService;
import co.edu.udec.lavadero.application.service.consulta.solicitudventaservicio.ConsultaDocumentoSolicitudVentaService;
import co.edu.udec.lavadero.infraestructure.config.ConexionPostgreSQL;

public class Main 
{
    public static void main( String[] args )
    {
        try (Connection connection = ConexionPostgreSQL.getConnection();
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.println("\n===== MENU DE CONSULTAS =====");
                System.out.println("1. Clientes con vehículos registrados");
                System.out.println("2. Empleados que han informado a clientes");
                System.out.println("3. Productos disponibles");
                System.out.println("4. Productos agrupados por empresa");
                System.out.println("5. Precios calculados de productos");
                System.out.println("6. Cotizaciones generadas por empleados");
                System.out.println("7. Estado de cotizaciones");
                System.out.println("8. Detalles de notas de corrección");
                System.out.println("9. Copia de documento de solicitud de venta");
                System.out.println("10. Productos aceptados en ventas");
                System.out.println("11. Total de ventas por productos y servicios");
                System.out.println("12. Detalle de ventas combinadas por orden");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                int opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {
                    case 1 -> {
                        var port = new ConsultaClienteAdapter(connection);
                        var service = new ConsultaClienteService(port);
                        var controller = new ConsultaClienteConsoleController(service);
                        controller.mostrarClientesConVehiculos();
                    }
                    case 2 -> {
                        var port = new ConsultaEmpleadoAdapter(connection);
                        var service = new ConsultaEmpleadoService(port);
                        var controller = new ConsultaEmpleadoConsoleController(service);
                        controller.mostrarEmpleadosInformantes();
                    }
                    case 3 -> {
                        var port = new ConsultaProductoAdapter(connection);
                        var service = new ConsultaProductoService(port);
                        var controller = new ConsultaProductoConsoleController(service);
                        controller.mostrarProductosDisponibles();
                    }
                    case 4 -> {
                        var port = new ConsultaProductoEmpresaAdapter(connection);
                        var service = new ConsultaProductoEmpresaService(port);
                        var controller = new ConsultaProductoEmpresaConsoleController(service);
                        controller.mostrarProductosPorEmpresa();
                    }
                    case 5 -> {
                        var port = new ConsultaPreciosProductoAdapter(connection);
                        var service = new ConsultaPreciosProductoService(port);
                        var controller = new ConsultaPreciosProductoConsoleController(service);
                        controller.mostrarPreciosCalculados();
                    }
                    case 6 -> {
                        var port = new ConsultaCotizacionesGenaradasAdapter(connection);
                        var service = new ConsultaCotizacionesGeneradasService(port);
                        var controller = new ConsultaCotizacionesGeneradasConsoleController(service);
                        controller.mostrarCotizacionesGeneradas();
                    }
                    case 7 -> {
                        var port = new ConsultaNotasCorreccionAdapter(connection);
                        var service = new ConsultaNotasCorreccionService(port);
                        var controller = new ConsultaNotasCorreccionConsoleController(service);
                        controller.mostrarNotasCorreccion();
                    }
                    case 8 -> {
                        var port = new ConsultaDocumentoSolicitudVentaAdapter(connection);
                        var service = new ConsultaDocumentoSolicitudVentaService(port);
                        var controller = new ConsultaDocumentoSolicitudVentaConsoleController(service);
                        controller.mostrarCopiaSolicitud();
                    }
                    case 9 -> {
                        var port = new ConsultaProductosAceptadosEnVentaAdapter(connection);
                        var service = new ConsultaProductosAceptadosEnVentaService(port);
                        var controller = new ConsultaProductosAceptadosEnVentaConsoleController(service);
                        controller.mostrarProductosAceptados();
                    }
                    case 10 -> {
                        var portProducto = new ConsultaTotalesVentaProductoAdapter(connection);
                        var portServicio = new ConsultaTotalesVentaServicioAdapter(connection);
                        var service = new ConsultaTotalesVentaService(portProducto, portServicio);
                        var controller = new ConsultaTotalesVentaConsoleController(service);
                        controller.mostrarTotalesVenta();
                    }
                    case 11 -> {
                        var portProducto = new ConsultaVentasProductosAdapter(connection);
                        var portServicio = new ConsultaVentasServiciosAdapter(connection);
                        var service = new ConsultaVentasCombinadasService(portProducto, portServicio);
                        var controller = new ConsultaVentasCombinadasConsoleController(service);
                        controller.mostrarVentasSeparadas();
                    }
                    case 0 -> {
                        System.out.println("Saliendo del menú de consultas...");
                        return;
                    }
                    default -> System.out.println("Opción no válida. Intente de nuevo.");
                }
            }

        } catch (Exception e) {
            System.out.println("Error al ejecutar las consultas: " + e.getMessage());
            e.printStackTrace();
        }
    }
    }

