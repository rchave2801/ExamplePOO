public class Common extends User {
   private int telefono;
   private String direccion;

    public Common(String nombre, String genero, int id, int edad, int telefono, String direccion) {
        super(nombre, genero, id, edad);
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Common(int telefono, String direccion) {
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Common () {

    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

}
