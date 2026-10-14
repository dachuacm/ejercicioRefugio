package app_refugio.otro

public class PruebaEnum {


    public static void prueba(){

        EstadoActividad estadoA;

        estadoA=EstadoActividad.ASIGANADA;

         System.out.println("Codigo:"+estadoA.getCodigo());
         System.out.println("Descripción:"+estadoA.getDescripcion());
         System.out.println("estadoA:"+estadoA);
         System.out.println("estadoA_name:"+estadoA.name());
         System.out.println("estadoA_ordinal:"+estadoA.ordinal());

    }
}
