public class Admin extends User{
    private int id;
    private String cargo;

    public Admin(String nombre, String genero, int id, int edad, int id1, String cargo) {
        super(nombre, genero, id, edad);
        this.id = id1;
        this.cargo = cargo;
    }

    public Admin(int id, String cargo) {
        this.id = id;
        this.cargo = cargo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
