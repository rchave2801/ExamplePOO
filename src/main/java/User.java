public class User {
    private String nombre;
    private String genero;
    private int id;
    private int edad;

    public User(String nombre, String genero, int id, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.id = id;
        this.edad = edad;
    }

    public User() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "User{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", id=" + id +
                ", edad=" + edad +
                '}';
    }

    public void reporte (Servicio servicio) {
        System.out.println(servicio.toString());
    }
}
