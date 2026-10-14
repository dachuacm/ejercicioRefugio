package app_refugio.modelo;

import java.time.LocalDate;
import java.time.Period;

public class Adoptante extends Persona {

    private double ingresoMensual; 
    private TipoCasa tipoCasa;

    public Adoptante(){}
	public Adoptante(double ingresoMensual, TipoCasa tipoCasa) {
		this.ingresoMensual = ingresoMensual;
		this.tipoCasa = tipoCasa;
	}
	public double getIngresoMensual() {
		return ingresoMensual;
	}
	public void setIngresoMensual(double ingresoMensual) {
		this.ingresoMensual = ingresoMensual;
	}
	public TipoCasa getTipoCasa() {
		return tipoCasa;
	}
	public void setTipoCasa(TipoCasa tipoCasa) {
		this.tipoCasa = tipoCasa;
	}
	
   public void saludar(){
       
       System.out.println("Soy el adoptante "+ nombre
	      
	      + "\nCURP: "+ getCURP());
   }
   @Override
   public boolean evaluarse() {
	return ingresoMensual>20000 && tipoCasa.ordinal()<TipoCasa.PALOMAR.ordinal();
   }
    
   public boolean evaluar(Persona p) {
	return Period.between(LocalDate.now(), getFechaNac()).getYears()>18;
   }
}
