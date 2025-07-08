package co.edu.udec.lavadero.domain.model;

public class SolicitudVentaProducto {
    private int solicitud_producto_id;
    private String detalle_articulo;
    private int numero_item;
    private String codigo;
    private String marca;
    private int precio;
    private int porcentaje_iva;
    private int valor_iva;
    private int precio_iva;
    private int precio_iva_descuento;
    private int precio_total;

    public SolicitudVentaProducto(int solicitud_producto_id, String detalle_articulo, int numero_item, String codigo,
            String marca, int precio, int porcentaje_iva, int valor_iva, int precio_iva, int precio_iva_descuento,
            int precio_total) {
        this.solicitud_producto_id = solicitud_producto_id;
        this.detalle_articulo = detalle_articulo;
        this.numero_item = numero_item;
        this.codigo = codigo;
        this.marca = marca;
        this.precio = precio;
        this.porcentaje_iva = porcentaje_iva;
        this.valor_iva = valor_iva;
        this.precio_iva = precio_iva;
        this.precio_iva_descuento = precio_iva_descuento;
        this.precio_total = precio_total;
    }

    public int getSolicitud_producto_id() {
        return solicitud_producto_id;
    }

    public void setSolicitud_producto_id(int solicitud_producto_id) {
        this.solicitud_producto_id = solicitud_producto_id;
    }

    public String getDetalle_articulo() {
        return detalle_articulo;
    }

    public void setDetalle_articulo(String detalle_articulo) {
        this.detalle_articulo = detalle_articulo;
    }

    public int getNumero_item() {
        return numero_item;
    }

    public void setNumero_item(int numero_item) {
        this.numero_item = numero_item;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPorcentaje_iva() {
        return porcentaje_iva;
    }

    public void setPorcentaje_iva(int porcentaje_iva) {
        this.porcentaje_iva = porcentaje_iva;
    }

    public int getValor_iva() {
        return valor_iva;
    }

    public void setValor_iva(int valor_iva) {
        this.valor_iva = valor_iva;
    }

    public int getPrecio_iva() {
        return precio_iva;
    }

    public void setPrecio_iva(int precio_iva) {
        this.precio_iva = precio_iva;
    }

    public int getPrecio_iva_descuento() {
        return precio_iva_descuento;
    }

    public void setPrecio_iva_descuento(int precio_iva_descuento) {
        this.precio_iva_descuento = precio_iva_descuento;
    }

    public int getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(int precio_total) {
        this.precio_total = precio_total;
    }

}
