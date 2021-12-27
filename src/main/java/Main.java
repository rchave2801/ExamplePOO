public class Main {
    public static void main(String[] args) {
       User usuario = new User("Pablo", "Masculino", 1233894870, 24);
       Servicio servicio = new Servicio("Aire acondicionado", 250000, "Reparación", 1369832);
       Servicio instalacion = new Servicio("congelador", 50000, "instalacion", 231642);
       Servicio mantenimiento = new Servicio("techo", 200000, "mantenimiento", 129381);
       Servicio pintar = new Servicio("casa", 250000, "pintar", 874212);


       User admin= new Admin("Felipe", "Masculino",323783, 36,"87wuq902");

       User common1= new Common("Arley", "Masculino",3672123, 32);

       User common2= new Common("Fernando", "Masculino",3872931, 18);

       usuario.reporte(servicio);
       common1.reporte(instalacion);
       common2.reporte(mantenimiento);
       admin.reporte(pintar);

    }
}
