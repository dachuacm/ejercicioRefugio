package app_refugio.modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class CartillaSalud {
private LocalDate ultimaFechaDesparacitacion;
private boolean esterilizdo;

private List<Vacuna> vacunas;

public CartillaSalud(){
    vacunas=new ArrayList<Vacuna>();
}
public CartillaSalud(LocalDate fechaDesparacitacion, boolean esterilizdo, List<Vacuna> vacunas) {
	this.ultimaFechaDesparacitacion = fechaDesparacitacion;
	this.esterilizdo = esterilizdo;
	this.vacunas = vacunas;
}
public LocalDate getUltimaFechaDesparacitacion() {
	return ultimaFechaDesparacitacion;
}
public void setUltimaFechaDesparacitacion(LocalDate ultimaFechaDesparacitacion) {
	this.ultimaFechaDesparacitacion = ultimaFechaDesparacitacion;
}
public boolean isEsterilizdo() {
	return esterilizdo;
}
public void setEsterilizdo(boolean esterilizdo) {
	this.esterilizdo = esterilizdo;
}
public List<Vacuna> getVacunas() {
	return vacunas;
}
public void setVacunas(List<Vacuna> vacunas) {
	this.vacunas = vacunas;
}

public void agregarVacuna(Vacuna v){

     vacunas.add(v);
}




}
