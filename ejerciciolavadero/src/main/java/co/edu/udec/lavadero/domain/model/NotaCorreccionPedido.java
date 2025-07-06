package co.edu.udec.lavadero.domain.model;

import java.time.LocalDate;

public class NotaCorreccionPedido {
    private int nota_id;
    private String codigo;
    private LocalDate fecha_emision;
    private LocalDate fecha_maxima_confirmacion;
    private LocalDate fecha_maxima_entrega;
    private String codigo_pedido;
    private int proveedor_id;
    private int empresa_id;

    public NotaCorreccionPedido(int nota_id, String codigo, LocalDate fecha_emision,
            LocalDate fecha_maxima_confirmacion, LocalDate fecha_maxima_entrega, String codigo_pedido, int proveedor_id,
            int empresa_id) {
        this.nota_id = nota_id;
        this.codigo = codigo;
        this.fecha_emision = fecha_emision;
        this.fecha_maxima_confirmacion = fecha_maxima_confirmacion;
        this.fecha_maxima_entrega = fecha_maxima_entrega;
        this.codigo_pedido = codigo_pedido;
        this.proveedor_id = proveedor_id;
        this.empresa_id = empresa_id;
    }

    public int getNota_id() {
        return nota_id;
    }

    public void setNota_id(int nota_id) {
        this.nota_id = nota_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(LocalDate fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public LocalDate getFecha_maxima_confirmacion() {
        return fecha_maxima_confirmacion;
    }

    public void setFecha_maxima_confirmacion(LocalDate fecha_maxima_confirmacion) {
        this.fecha_maxima_confirmacion = fecha_maxima_confirmacion;
    }

    public LocalDate getFecha_maxima_entrega() {
        return fecha_maxima_entrega;
    }

    public void setFecha_maxima_entrega(LocalDate fecha_maxima_entrega) {
        this.fecha_maxima_entrega = fecha_maxima_entrega;
    }

    public String getCodigo_pedido() {
        return codigo_pedido;
    }

    public void setCodigo_pedido(String codigo_pedido) {
        this.codigo_pedido = codigo_pedido;
    }

    public int getProveedor_id() {
        return proveedor_id;
    }

    public void setProveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public int getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(int empresa_id) {
        this.empresa_id = empresa_id;
    }
}
