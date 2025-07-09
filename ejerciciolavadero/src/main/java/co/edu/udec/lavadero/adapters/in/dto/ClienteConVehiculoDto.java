package co.edu.udec.lavadero.adapters.in.dto;

public class ClienteConVehiculoDto {
    public int cliente_id;
    public String nombre;
    public String apellido;
    public String correo;

    public ClienteConVehiculoDto(int cliente_id, String nombre, String apellido, String correo) {
        this.cliente_id = cliente_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
    }
}
