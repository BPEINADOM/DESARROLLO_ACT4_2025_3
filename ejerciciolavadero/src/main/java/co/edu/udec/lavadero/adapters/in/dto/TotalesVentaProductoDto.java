package co.edu.udec.lavadero.adapters.in.dto;

public class TotalesVentaProductoDto {
    public int solicitud_producto_id;
    public int precio;
    public int numero_item;
    public int precio_total;

    public TotalesVentaProductoDto(int solicitud_producto_id, int precio, int numero_item, int precio_total) {
        this.solicitud_producto_id = solicitud_producto_id;
        this.precio = precio;
        this.numero_item = numero_item;
        this.precio_total = precio_total;
    }

}
