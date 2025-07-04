package co.edu.udec.lavadero.domain.model;

import java.time.LocalDate;

public class servicio {
    private int servicio_id;
    private String nombre;
    private String descripcion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_finalizacion;
    private String hora_inicio;
    private String hora_finalizacion;
    private String nombre_empleado;
    private int precio;
    private int porcentaje_iva;
    private int valor_iva;
    private int precio_iva;
    private int precio_iva_descuento;
    private int precio_total;
    private int cliente_id;
    private int cubiculo_id;
    private int solicitud_servicio_id;

    public servicio(int servicio_id, String nombre, String descripcion, LocalDate fecha_inicio,
            LocalDate fecha_finalizacion, String hora_inicio, String hora_finalizacion, String nombre_empleado,
            int precio, int porcentaje_iva, int valor_iva, int precio_iva, int precio_iva_descuento, int precio_total,
            int cliente_id, int cubiculo_id, int solicitud_servicio_id) {
        this.servicio_id = servicio_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha_inicio = fecha_inicio;
        this.fecha_finalizacion = fecha_finalizacion;
        this.hora_inicio = hora_inicio;
        this.hora_finalizacion = hora_finalizacion;
        this.nombre_empleado = nombre_empleado;
        this.precio = precio;
        this.porcentaje_iva = porcentaje_iva;
        this.valor_iva = valor_iva;
        this.precio_iva = precio_iva;
        this.precio_iva_descuento = precio_iva_descuento;
        this.precio_total = precio_total;
        this.cliente_id = cliente_id;
        this.cubiculo_id = cubiculo_id;
        this.solicitud_servicio_id = solicitud_servicio_id;
    }

    public int getServicio_id() {
        return servicio_id;
    }


    public void setServicio_id(int servicio_id) {
        this.servicio_id = servicio_id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDescripcion() {
        return descripcion;
    }


    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }


    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }


    public LocalDate getFecha_finalizacion() {
        return fecha_finalizacion;
    }


    public void setFecha_finalizacion(LocalDate fecha_finalizacion) {
        this.fecha_finalizacion = fecha_finalizacion;
    }


    public String getHora_inicio() {
        return hora_inicio;
    }


    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }


    public String getHora_finalizacion() {
        return hora_finalizacion;
    }


    public void setHora_finalizacion(String hora_finalizacion) {
        this.hora_finalizacion = hora_finalizacion;
    }


    public String getNombre_empleado() {
        return nombre_empleado;
    }


    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
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


    public int getCliente_id() {
        return cliente_id;
    }


    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }


    public int getCubiculo_id() {
        return cubiculo_id;
    }


    public void setCubiculo_id(int cubiculo_id) {
        this.cubiculo_id = cubiculo_id;
    }


    public int getSolicitud_servicio_id() {
        return solicitud_servicio_id;
    }


    public void setSolicitud_servicio_id(int solicitud_servicio_id) {
        this.solicitud_servicio_id = solicitud_servicio_id;
    }

}
