package co.edu.udec.lavadero.domain.model;

import java.time.LocalDate;

public class Contrato {
    private int contrato_id;
    private LocalDate fecha_inicio;
    private int sueldo_base;
    private String cargo;
    private String horario;
    private int empleado_id;

    public Contrato(int contrato_id, LocalDate fecha_inicio, int sueldo_base, String cargo, String horario,
            int empleado_id) {
        this.contrato_id = contrato_id;
        this.fecha_inicio = fecha_inicio;
        this.sueldo_base = sueldo_base;
        this.cargo = cargo;
        this.horario = horario;
        this.empleado_id = empleado_id;
    }
    
    public int getContrato_id() {
        return contrato_id;
    }

    public void setContrato_id(int contrato_id) {
        this.contrato_id = contrato_id;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }
}
