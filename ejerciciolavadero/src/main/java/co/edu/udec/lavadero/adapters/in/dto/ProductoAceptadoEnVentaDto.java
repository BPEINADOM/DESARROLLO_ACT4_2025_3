package co.edu.udec.lavadero.adapters.in.dto;

public class ProductoAceptadoEnVentaDto {
    public int solicitudProductoId;
    public String detalleArticulo;
    public String nombreProducto;
    public int precio;
    public String marca;
    
    public ProductoAceptadoEnVentaDto(int solicitudProductoId, String detalleArticulo, String nombreProducto,
            int precio, String marca) {
        this.solicitudProductoId = solicitudProductoId;
        this.detalleArticulo = detalleArticulo;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.marca = marca;
    }
}
