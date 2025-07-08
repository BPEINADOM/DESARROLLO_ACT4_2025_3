package co.edu.udec.lavadero.adapters.in.dto;

public class DocumentoSolicitudVentaDto {
    public int solicitud_servicio_id;
    public String placa;
    public String marca;
    public String tipo;
    public String color;
    public String servicio;
    public String clienteNombre;
    public String clienteDocumento;
    public String clienteCorreo;
    
    public DocumentoSolicitudVentaDto(int solicitud_servicio_id, String placa, String marca, String tipo, String color,
            String servicio, String clienteNombre, String clienteDocumento, String clienteCorreo) {
        this.solicitud_servicio_id = solicitud_servicio_id;
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.servicio = servicio;
        this.clienteNombre = clienteNombre;
        this.clienteDocumento = clienteDocumento;
        this.clienteCorreo = clienteCorreo;
    }
}
