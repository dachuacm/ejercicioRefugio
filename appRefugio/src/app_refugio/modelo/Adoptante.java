package app_refugio.modelo;

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
	

    
}
