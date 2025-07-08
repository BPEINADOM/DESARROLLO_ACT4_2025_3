package co.edu.udec.lavadero.adapters.in.dto;

public class ClienteConVehiculoDto {
    public int cliente_id;
    public String nombres;
    public String apellidos;
    public String tipo_documento;
    public String numero_documento;
    public String correo;

    public ClienteConVehiculoDto(int cliente_id, String nombres, String apellidos, String tipo_documento,
            String numero_documento, String correo) {
        this.cliente_id = cliente_id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.correo = correo;
    }
}
