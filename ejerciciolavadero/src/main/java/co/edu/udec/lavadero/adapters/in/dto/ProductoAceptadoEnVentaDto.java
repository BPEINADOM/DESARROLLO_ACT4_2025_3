package co.edu.udec.lavadero.adapters.in.dto;

public class ProductoAceptadoEnVentaDto {
    public int solicitud_producto_id;
    public String nombre_producto;
    public int cantidad;

    public ProductoAceptadoEnVentaDto(int solicitud_producto_id, String nombre_producto, int cantidad) {
        this.solicitud_producto_id = solicitud_producto_id;
        this.nombre_producto = nombre_producto;
        this.cantidad = cantidad;
    }

}
