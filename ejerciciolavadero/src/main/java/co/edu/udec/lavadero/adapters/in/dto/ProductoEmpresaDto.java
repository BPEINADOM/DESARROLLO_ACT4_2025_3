package co.edu.udec.lavadero.adapters.in.dto;

public class ProductoEmpresaDto {
    public int producto_id;
    public String nombre;
    public String marca;
    public int precio;
    public String empresa;

    public ProductoEmpresaDto(int producto_id, String nombre, String marca, int precio, String empresa) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.empresa = empresa;
    }
}
