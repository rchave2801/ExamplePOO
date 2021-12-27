public class Main {
    public static void main(String[] args) {
       User usuario = new User("Pablo", "Masculino", 1233894870, 24);
       Servicio servicio = new Servicio("Aire acondicionado", 250000, "Reparación", 1369832);

       Admin admin1 = new Admin("Juanita", "Femenino", 35465454,32, 5, "Jefe personal","Administradora", 2000000);
       Common user1 = new Common("Pedro", "Masculino",12393493,25,"Auxiliar soporte",10,8);
       Common user2 = new Common("Alberto", "Masculino",1239444093,35,"Analista servidores",25,4);
       Servicio cableado = new Servicio("Cableado estructurado", 500000,"Implementacion",990);
       Servicio servidores = new Servicio("Servidores", 2300000,"Mantenimiento",1102);
       Servicio contratista = new Servicio("Contratacion", 2800000,"Mano de obra",669);

       System.out.println("Reporte del servicio prestado por "+usuario.getNombre());
       usuario.reporte(servicio);
        System.out.println("Reporte del servicio prestado por "+admin1.getNombre());
        admin1.reporte(contratista);
        System.out.println("Reporte del servicio prestado por "+user1.getNombre());
       user1.reporte(cableado);
        System.out.println("Reporte del servicio prestado por "+user2.getNombre());
       user2.reporte(servidores);


    }
}
