package co.edu.udec.lavadero.adapters.in.dto;

public class EmpleadoInformanteDto {
    public int empleado_id;
    public String nombres;
    public String apellidos;
    public String numeroDocumento;
    public String tipoDocumento;
    public String correo;


    public EmpleadoInformanteDto(int empleado_id, String nombres, String apellidos, String numeroDocumento,
            String tipoDocumento, String correo) {
        this.empleado_id = empleado_id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroDocumento = numeroDocumento;
        this.tipoDocumento = tipoDocumento;
        this.correo = correo;
    }
    

}
