public class Main {
    public static void main(String[] args) {
       User usuario = new User("Pablo", "Masculino", 1233894870, 24);
       Servicio servicio = new Servicio("Aire acondicionado", 250000, "Reparación", 1369832);

       usuario.reporte(servicio);

    }
}
