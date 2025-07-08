package co.edu.udec.lavadero.adapters.in.dto;

public class ProductoConsultaDto {
    public int producto_id;
    public String descripcion;
    public String marca;
    public int precio;
    public int stock;

    public ProductoConsultaDto(int producto_id, String descripcion, String marca, int precio, int stock) {
        this.producto_id = producto_id;
        this.descripcion = descripcion;
        this.marca = marca;
        this.precio = precio;
        this.stock = stock;
    }

}
