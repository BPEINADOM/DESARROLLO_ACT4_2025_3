package co.edu.udec.lavadero.adapters.in.dto;

public class CotizacionGeneradaDto {
    public int cotizacion_id;
    public String codigo;
    public String estado;
    public String nombreEmpleado;

    public CotizacionGeneradaDto(int cotizacion_id, String codigo, String estado, String nombreEmpleado) {
        this.cotizacion_id = cotizacion_id;
        this.codigo = codigo;
        this.estado = estado;
        this.nombreEmpleado = nombreEmpleado;
    }
}
