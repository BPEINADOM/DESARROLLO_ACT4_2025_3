package co.edu.udec.lavadero.domain.model;

public class SolicitudVentaServicio {
    private int solicitud_servicio_id;
    private String placa;
    private String marca;
    private String tipo;
    private String color;
    private String servicio;
    private int cliente_id;

    public SolicitudVentaServicio(int solicitud_servicio_id, String placa, String marca, String tipo, String color,
            String servicio, int cliente_id) {
        this.solicitud_servicio_id = solicitud_servicio_id;
        this.placa = placa;
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.servicio = servicio;
        this.cliente_id = cliente_id;
    }

    public int getSolicitud_servicio_id() {
        return solicitud_servicio_id;
    }

    public void setSolicitud_servicio_id(int solicitud_servicio_id) {
        this.solicitud_servicio_id = solicitud_servicio_id;
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

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(int cliente_id) {
        this.cliente_id = cliente_id;
    }
    
}
