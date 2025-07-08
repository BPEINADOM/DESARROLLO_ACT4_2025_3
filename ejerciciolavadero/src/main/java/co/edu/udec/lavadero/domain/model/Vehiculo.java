package co.edu.udec.lavadero.domain.model;

public class Vehiculo {
    private int vehiculo_id;
    private String placa;
    private String marca;
    private String tipo;
    private String color;
    private int cliente_id;
    private int empleado_id;
    private int cubiculo_id;

    public Vehiculo(int vehiculo_id, String placa, String marca, String tipo, String color, int cliente_id,
            int empleado_id, int cubiculo_id) {
        this.vehiculo_id = vehiculo_id;
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.cliente_id = cliente_id;
        this.empleado_id = empleado_id;
        this.cubiculo_id = cubiculo_id;
    }

    public int getVehiculo_id() {
        return vehiculo_id;
    }

    public void setVehiculo_id(int vehiculo_id) {
        this.vehiculo_id = vehiculo_id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }

    public int getEmpleado_id() {
        return empleado_id;
    }

    public void setEmpleado_id(int empleado_id) {
        this.empleado_id = empleado_id;
    }

    public int getCubiculo_id() {
        return cubiculo_id;
    }

    public void setCubiculo_id(int cubiculo_id) {
        this.cubiculo_id = cubiculo_id;
    }

}
