public class Admin extends User {
    private String usuario;
    private String contrasena;

    public Admin(String nombre, String genero, int id, int edad, String usuario, String contrasena) {
        super(nombre, genero, id, edad);
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Admin(String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public Admin() {

    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "Admin" +
                "usuario='" + usuario + '\n' +
                ", contrasena='" + contrasena + '\n' +
                '}';
    }
}
