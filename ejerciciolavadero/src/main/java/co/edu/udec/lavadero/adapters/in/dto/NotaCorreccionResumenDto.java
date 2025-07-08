package co.edu.udec.lavadero.adapters.in.dto;

import java.time.LocalDate;

public class NotaCorreccionResumenDto {
    public int nota_id;
    public String codigo;
    public String codigo_pedido;
    public LocalDate fecha_emision;
    public int proveedor_id;
    public int empresa_id;

    public NotaCorreccionResumenDto(int nota_id, String codigo, String codigo_pedido, LocalDate fecha_emision,
            int proveedor_id, int empresa_id) {
        this.nota_id = nota_id;
        this.codigo = codigo;
        this.codigo_pedido = codigo_pedido;
        this.fecha_emision = fecha_emision;
        this.proveedor_id = proveedor_id;
        this.empresa_id = empresa_id;
    }
}
