public class Main {
    public static void main(String[] args) {
       User usuario = new User("Pablo", "Masculino", 1233894870, 24);
       Servicio servicio = new Servicio("Aire acondicionado", 250000, "Reparación", 1369832);
       User usuarioEstandar = new Common("juan", "femenino", 23654, 24,"Kr 115 # 148 - 40", "Tranferencia", 15, 306612200 );
       Servicio servicioUsuarioEstandar = new Servicio("Nevera", 30000, "Mantenimiento", 6576431);
       User usuarioEstandarII = new Common("Lucas", "Masculino", 4654616, 36, "cll 111a #48-25", "Tarjeta de credito", 5644, 6467984 );
       Servicio servicioUsuarioEstandarII = new Servicio("Televisor", 0, "Garantia", 657651679);
       User usuarioAdmin = new Admin("maria", "femenino", 54654, 48,"mari22", "adsfa56465");
       Servicio servicioAdmin = new Servicio("Soporte de servicio", 10000, "Soporte", 651771665);

       usuario.reporte(servicio);
       usuario.reporte(servicioUsuarioEstandar);
       usuario.reporte(servicioUsuarioEstandarII);
       usuario.reporte(servicio);
    }


}
