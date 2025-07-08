package co.edu.udec.lavadero.adapters.in.dto;

public class DetalleVentaServicioDto {
    public int solicitud_servicio_id;
    public String placa;
    public String marca;
    public String tipo;
    public String color;
    public String servicio;

    public DetalleVentaServicioDto(int solicitud_servicio_id, String placa, String marca, String tipo, String color,
            String servicio) {
        this.solicitud_servicio_id = solicitud_servicio_id;
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.servicio = servicio;
    }
}
