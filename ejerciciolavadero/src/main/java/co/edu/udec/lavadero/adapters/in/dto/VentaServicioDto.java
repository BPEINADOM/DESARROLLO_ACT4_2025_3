package co.edu.udec.lavadero.adapters.in.dto;

public class VentaServicioDto {
    public int solicitud_servicio_id;
    public String placa;
    public String servicio;

    public VentaServicioDto(int solicitud_servicio_id, String placa, String servicio) {
        this.solicitud_servicio_id = solicitud_servicio_id;
        this.placa = placa;
        this.servicio = servicio;
    }

}
