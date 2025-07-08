package co.edu.udec.lavadero.application.service;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import co.edu.udec.lavadero.application.ports.out.ServicioPersistencePort;
import co.edu.udec.lavadero.domain.exception.ServicioNoEncontradoException;
import co.edu.udec.lavadero.domain.model.Servicio;

public class ServicioServiceImplTest {
    private ServicioPersistencePort dummyRepository;
    private ServicioServiceImpl service;

    @Before
    public void setUp() {
        dummyRepository = new ServicioPersistencePort() {
            @Override
            public void guardar(Servicio servicio) { }

            @Override
            public void actualizar(Servicio servicio) { }

            @Override
            public void borrar(int id) { }

            @Override
            public Optional<Servicio> buscarPorID(int id) {
                if (id == 1) {
                    return Optional.of(servicioEjemplo());
                } else {
                    return Optional.empty();
                }
            }

            @Override
            public java.util.List<Servicio> buscarTodos() {
                return Collections.singletonList(servicioEjemplo());
            }
        };

        service = new ServicioServiceImpl(dummyRepository);
    }

    private Servicio servicioEjemplo() {
        return new Servicio(
            1, "Lavado Completo", "Incluye motor y tapicería",
            LocalDate.of(2025, 7, 10), LocalDate.of(2025, 7, 10),
            "09:00", "10:00", "Pedro",
            50000, 19, 9500, 59500, 57000, 57000,
            1, 1, 1
        );
    }

    @Test
    public void puedeCrearServicioSinErrores() {
        Servicio nuevo = servicioEjemplo();
        service.crear(nuevo);
    }

    @Test
    public void puedeListarServicios() {
        service.listarTodos(); // no se asertan valores
    }

    @Test
    public void puedeBuscarServicioPorIDExistente() {
        service.obtenerPorID(1); // retorna Optional con valor
    }

    @Test(expected = ServicioNoEncontradoException.class)
    public void actualizarLanzaErrorSiNoExiste() {
        Servicio otro = servicioEjemplo();
        otro.setServicio_id(99);
        service.actualizar(otro); // no existe en dummy
    }

    @Test
    public void actualizarServicioExistente() {
        Servicio s = servicioEjemplo();
        service.actualizar(s); // no debe lanzar error
    }

    @Test
    public void borrarServicioNoLanzaError() {
        service.borrar(1); // dummy sin implementación real
    }
}

