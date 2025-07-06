package co.edu.udec.lavadero.domain.model;

public class Proveedor {
    private int proveedor_id;
    private String tipo_documento;
    private String numero_documento;
    private String nombre;
    private String correo;
    private String numero_telefono;
    private String cuenta_bancaria;

    public Proveedor(int proveedor_id, String tipo_documento, String numero_documento, String nombre, String correo,
            String numero_telefono, String cuenta_bancaria) {
        this.proveedor_id = proveedor_id;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.nombre = nombre;
        this.correo = correo;
        this.numero_telefono = numero_telefono;
        this.cuenta_bancaria = cuenta_bancaria;
    }

    public int getProveedor_id() {
        return proveedor_id;
    }

    public void setProveedor_id(int proveedor_id) {
        this.proveedor_id = proveedor_id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

    public String getCuenta_bancaria() {
        return cuenta_bancaria;
    }

    public void setCuenta_bancaria(String cuenta_bancaria) {
        this.cuenta_bancaria = cuenta_bancaria;
    }
}
