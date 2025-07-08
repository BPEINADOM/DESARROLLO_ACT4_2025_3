package co.edu.udec.lavadero.application.service.consulta.cotizacion;

import java.util.List;

import co.edu.udec.lavadero.adapters.in.dto.CotizacionGeneradaDto;
import co.edu.udec.lavadero.application.ports.out.consulta.CotizacionesGeneradasPort;

public class ConsultaCotizacionesGeneradasService {
    private final CotizacionesGeneradasPort cotizacionesGeneradasport;

    public ConsultaCotizacionesGeneradasService(CotizacionesGeneradasPort cotizacionesGeneradasport) {
        this.cotizacionesGeneradasport = cotizacionesGeneradasport;
    }

    public List<CotizacionGeneradaDto> ejecutarConsulta() {
        return cotizacionesGeneradasport.consultarCotizacionesGeneradas();
    }
}
