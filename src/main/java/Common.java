public class Common extends User {

    private int cc;
    private int celular;

    public Common(String nombre, String genero, int id, int edad, int cc, int celular) {
        super(nombre, genero, id, edad);
        this.cc = cc;
        this.celular = celular;
    }

    public Common(int cc, int celular) {
        this.cc = cc;
        this.celular = celular;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
}
