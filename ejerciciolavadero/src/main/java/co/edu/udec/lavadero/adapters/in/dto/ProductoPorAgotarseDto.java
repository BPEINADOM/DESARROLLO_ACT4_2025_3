package co.edu.udec.lavadero.adapters.in.dto;

public class ProductoPorAgotarseDto {
    public int producto_id;
    public String descripcion;
    public int stock;

    
    public ProductoPorAgotarseDto(int producto_id, String descripcion, int stock) {
        this.producto_id = producto_id;
        this.descripcion = descripcion;
        this.stock = stock;
    }

}
