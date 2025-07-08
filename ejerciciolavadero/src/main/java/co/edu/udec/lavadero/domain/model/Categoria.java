package co.edu.udec.lavadero.domain.model;

public class Categoria {
    private int categoria_id;
    private String codigo;
    private String nombre;
    private String icono;


    public Categoria(int categoria_id, String codigo, String nombre, String icono) {
        this.categoria_id = categoria_id;
        this.codigo = codigo;
        this.nombre = nombre;
        this.icono = icono;
    }

    public int getCategoria_id() {
        return categoria_id;
    }


    public void setCategoria_id(int categoria_id) {
        this.categoria_id = categoria_id;
    }


    public String getCodigo() {
        return codigo;
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getIcono() {
        return icono;
    }


    public void setIcono(String icono) {
        this.icono = icono;
    }
}
