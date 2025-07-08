package co.edu.udec.lavadero.adapters.in.dto;

public class ProductoPrecioDto {
    public int producto_id;
    public String nombre;
    public int precio_base;
    public int porcentaje_iva;
    public int valor_iva;
    public int precio_iva;
    public int precio_iva_descuento;
    public int precio_total;

    public ProductoPrecioDto(int producto_id, String nombre, int precio_base, int porcentaje_iva, int valor_iva,
            int precio_iva, int precio_iva_descuento, int precio_total) {
        this.producto_id = producto_id;
        this.nombre = nombre;
        this.precio_base = precio_base;
        this.porcentaje_iva = porcentaje_iva;
        this.valor_iva = valor_iva;
        this.precio_iva = precio_iva;
        this.precio_iva_descuento = precio_iva_descuento;
        this.precio_total = precio_total;
    }
}
