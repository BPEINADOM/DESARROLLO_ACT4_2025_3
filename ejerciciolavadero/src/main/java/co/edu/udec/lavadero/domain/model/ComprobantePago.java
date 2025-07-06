package co.edu.udec.lavadero.domain.model;

import java.time.LocalDate;

public class ComprobantePago {
    private int comprobante_id;
    private LocalDate fecha_pago;
    private int empresa_id;
    private int valor_pagar;
    private String numero_cuenta;


    public ComprobantePago(int comprobante_id, LocalDate fecha_pago, int empresa_id, int valor_pagar,
            String numero_cuenta) {
        this.comprobante_id = comprobante_id;
        this.fecha_pago = fecha_pago;
        this.empresa_id = empresa_id;
        this.valor_pagar = valor_pagar;
        this.numero_cuenta = numero_cuenta;
    }

    public int getComprobante_id() {
        return comprobante_id;
    }


    public void setComprobante_id(int comprobante_id) {
        this.comprobante_id = comprobante_id;
    }


    public LocalDate getFecha_pago() {
        return fecha_pago;
    }


    public void setFecha_pago(LocalDate fecha_pago) {
        this.fecha_pago = fecha_pago;
    }


    public int getEmpresa_id() {
        return empresa_id;
    }


    public void setEmpresa_id(int empresa_id) {
        this.empresa_id = empresa_id;
    }


    public int getValor_pagar() {
        return valor_pagar;
    }


    public void setValor_pagar(int valor_pagar) {
        this.valor_pagar = valor_pagar;
    }


    public String getNumero_cuenta() {
        return numero_cuenta;
    }


    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

}
