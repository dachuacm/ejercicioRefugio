package app_refugio.otro;

public enum EstadoActividad {
    REALIZADA("La actividad se concluyo",102),
    EN_PROCESO("Se está realizando la actividad",101),
    ASIGANADA("Se asignó la actividad",100);
 
    private final String descripcion;
    private final int codigo;
 
    EstadoActividad(String d,int c){
        descripcion=d; codigo=c;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo() {
        return codigo;
    }
   
}
