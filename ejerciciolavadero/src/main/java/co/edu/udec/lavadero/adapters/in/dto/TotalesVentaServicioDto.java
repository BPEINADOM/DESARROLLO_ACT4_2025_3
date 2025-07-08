package co.edu.udec.lavadero.adapters.in.dto;

public class TotalesVentaServicioDto {
    public int solicitud_servicio_id;
    public String servicio;
    public String tipo;

    public TotalesVentaServicioDto(int solicitud_servicio_id, String servicio, String tipo) {
        this.solicitud_servicio_id = solicitud_servicio_id;
        this.servicio = servicio;
        this.tipo = tipo;
    }

}
