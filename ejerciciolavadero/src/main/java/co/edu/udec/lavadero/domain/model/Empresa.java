package co.edu.udec.lavadero.domain.model;

public class Empresa {
    private int empresa_id;
    private String nombre;
    private String correo;
    private String direccion;
    private String numero_telefono;

    public Empresa(int empresa_id, String nombre, String correo, String direccion, String numero_telefono) {
        this.empresa_id = empresa_id;
        this.nombre = nombre;
        this.correo = correo;
        this.direccion = direccion;
        this.numero_telefono = numero_telefono;
    }

    public int getEmpresa_id() {
        return empresa_id;
    }

    public void setEmpresa_id(int empresa_id) {
        this.empresa_id = empresa_id;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumero_telefono() {
        return numero_telefono;
    }

    public void setNumero_telefono(String numero_telefono) {
        this.numero_telefono = numero_telefono;
    }

}
