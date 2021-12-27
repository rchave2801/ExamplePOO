public class Main {

    public static void main(String[] args) {
       User usuario = new User("Pablo", "Masculino", 1233894870, 24);
       Servicio servicio = new Servicio("Aire acondicionado", 250000, "Reparación", 1369832);

       Admin usuarioAdmin = new Admin("Luisa", "Femenino", 1020478615, 23, "Lu", "1234");
       Servicio servicioAdmin = new Servicio("Restablecer Contraseña", 20000, "Reparación", 36547);

       Common usuarioCommon1 = new Common("Maria", "Femenino", 1030478620, 25, 4563211, "Carrera 67");
       Servicio servicio1 = new Servicio("Reparación de computadores", 100000, "Reparación", 123456);

       Common usuarioCommon2 = new Common("Pepito", "Masculino", 1140478654, 28, 31163211, "Carrera 70");
       Servicio servicio2 = new Servicio("Reparación de Lavadoras", 80000, "Reparación", 456789);

       usuario.reporte(servicio);
       usuarioCommon1.reporte(servicio1);
       usuarioCommon2.reporte(servicio2);
       usuarioAdmin.reporte(servicioAdmin);
    }
}
