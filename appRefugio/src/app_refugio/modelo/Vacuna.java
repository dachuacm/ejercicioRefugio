package app_refugio.modelo;

import java.time.LocalDate;

public class Vacuna {
    private int dosis;
    
    private String nombre;
    private LocalDate fechaAplicacion;
    private int lote;

   
    
    public Vacuna(int dosis, String nombre, LocalDate fechaAplicacion, int lote) {
        this.dosis = dosis;
        this.nombre = nombre;
        this.fechaAplicacion = fechaAplicacion;
        this.lote = lote;
    }

    public int getDosis() {
        return dosis;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public int getLote() {
        return lote;
    }

    @Override
    public String toString() {
        return "Vacuna [dosis=" + dosis + ", nombre=" + nombre + ", fechaAplicacion=" + fechaAplicacion + ", lote="
                + lote + "]";
    }

 

}
