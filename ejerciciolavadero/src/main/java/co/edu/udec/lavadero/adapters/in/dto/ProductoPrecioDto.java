package co.edu.udec.lavadero.adapters.in.dto;

public class ProductoPrecioDto {
    public int producto_id;
    public String descripcion;
    public int precio;

    public ProductoPrecioDto(int producto_id, String descripcion, int precio) {
        this.producto_id = producto_id;
        this.descripcion = descripcion;
        this.precio = precio;
    }
}
