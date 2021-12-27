public class Admin extends User {
    private String contrasena;

    public Admin(){
    }

    public Admin(String nombre, String genero, int id, int edad, String contrasena) {
        super(nombre, genero, id, edad);
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
