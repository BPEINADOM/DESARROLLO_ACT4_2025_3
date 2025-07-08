package co.edu.udec.lavadero.adapters.in.dto;

public class VentaProductoDto {
    public int solicitud_producto_id;
    public String codigo;
    public String detalle;
    public int precio_total;

    public VentaProductoDto(int solicitud_producto_id, String codigo, String detalle, int precio_total) {
        this.solicitud_producto_id = solicitud_producto_id;
        this.codigo = codigo;
        this.detalle = detalle;
        this.precio_total = precio_total;
    }

}
