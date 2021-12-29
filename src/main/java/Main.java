public class Main {
    public static void main(String[] args) {
        User usuario = new User("Pablo", "Masculino", 1233894870, 24);
        Servicio servicio = new Servicio("Aire acondicionado", 250000, "Reparación", 1369832);

        System.out.println(usuario);
        usuario.reporte(servicio);
        System.out.println("***************************");
        System.out.println("");

        Admin admin = new Admin("andres", "masculino", 01, 20, 001, "gerente");

        Common usuario1 = new Common("santi", "masculino", 02, 002, 1015070, 3052365);
        Servicio servicio1 = new Servicio("mantenimiento", 50000, "chequeo", 54321);

        Common usuario2 = new Common("alex", "masculino", 03, 003, 7136924, 3105142);
        Servicio servicio2 = new Servicio("cambio de aire", 150000, "cambio", 56789);

        System.out.println(usuario1);
        usuario1.reporte(servicio1);
        System.out.println("***************************");
        System.out.println("");
        System.out.println(usuario2);
        usuario2.reporte(servicio2);
        System.out.println("***************************");
        System.out.println("");
        System.out.println("administrador encargado de los servicios : "+admin);



    }
}
