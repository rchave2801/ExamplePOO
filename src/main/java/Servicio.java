public class Servicio {
    private String nombre;
    private int costo;
    private String tipo;
    private int codigo;

    public Servicio(String nombre, int costo, String tipo, int codigo) {
        this.nombre = nombre;
        this.costo = costo;
        this.tipo = tipo;
        this.codigo = codigo;
    }

    public Servicio() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "nombre='" + nombre + '\n' +
                ", costo=" + costo + '\n' +
                ", tipo='" + tipo + '\n' +
                ", codigo=" + codigo +
                '}';
    }
}
