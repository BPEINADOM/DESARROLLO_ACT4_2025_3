package co.edu.udec.lavadero.domain.model;

public class Cliente {
    private int cliente_id;
    private String nombre;
    private String apellido;
    private String correo;
    private String numero_telefono;
    private int vehiculo_id;

    public Cliente(int cliente_id, String nombre, String apellido, String correo, String numero_telefono,
            int vehiculo_id) {
        this.cliente_id = cliente_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numero_telefono = numero_telefono;
        this.vehiculo_id = vehiculo_id;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public int getVehiculo_id() {
        return vehiculo_id;
    }

    public void setVehiculo_id(int vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
    }
    
}
