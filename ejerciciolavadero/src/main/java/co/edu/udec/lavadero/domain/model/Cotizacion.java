package co.edu.udec.lavadero.domain.model;

public class Cotizacion {
    private int cotizacion_id;
    private String codigo;
    private String nombre;
    private String marca;
    private String descripcion;
    private String estado;
    private String tiempo_garantia;
    private int precio_unitario;
    private int precio_iva;
    private int descuento;
    private int precio_iva_descuento;
    private int empleado_id;
    private int nota_id;

    public Cotizacion(int cotizacion_id, String codigo, String nombre, String marca, String descripcion, String estado,
            String tiempo_garantia, int precio_unitario, int precio_iva, int descuento, int precio_iva_descuento,
            int empleado_id, int nota_id) {
        this.cotizacion_id = cotizacion_id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.estado = estado;
        this.tiempo_garantia = tiempo_garantia;
        this.precio_unitario = precio_unitario;
        this.precio_iva = precio_iva;
        this.descuento = descuento;
        this.precio_iva_descuento = precio_iva_descuento;
        this.empleado_id = empleado_id;
        this.nota_id = nota_id;
    }

    public int getCotizacion_id() {
        return cotizacion_id;
    }

    public void setCotizacion_id(int cotizacion_id) {
        this.cotizacion_id = cotizacion_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTiempo_garantia() {
        return tiempo_garantia;
    }

    public void setTiempo_garantia(String tiempo_garantia) {
        this.tiempo_garantia = tiempo_garantia;
    }

    public int getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(int precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getPrecio_iva() {
        return precio_iva;
    }

    public void setPrecio_iva(int precio_iva) {
        this.precio_iva = precio_iva;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public int getPrecio_iva_descuento() {
        return precio_iva_descuento;
    }

    public void setPrecio_iva_descuento(int precio_iva_descuento) {
        this.precio_iva_descuento = precio_iva_descuento;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public int getNota_id() {
        return nota_id;
    }

    public void setNota_id(int nota_id) {
        this.nota_id = nota_id;
    }

}
