public class Common extends User{
    private String direccion;
    private String metodoDePago;
    private int numeroDeCuenta;
    private int telefono;

    public Common(String nombre, String genero, int id, int edad, String direccion, String metodoDePago, int numeroDeCuenta, int telefono) {
        super(nombre, genero, id, edad);
        this.direccion = direccion;
        this.metodoDePago = metodoDePago;
        this.numeroDeCuenta = numeroDeCuenta;
        this.telefono = telefono;
    }

    public Common(String direccion, String metodoDePago, int numeroDeCuenta, int telefono) {
        this.direccion = direccion;
        this.metodoDePago = metodoDePago;
        this.numeroDeCuenta = numeroDeCuenta;
        this.telefono = telefono;
    }

    public Common() {

    }




    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(String metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


}

