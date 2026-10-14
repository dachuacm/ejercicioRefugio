package app_refugio.modelo;

public class Animal {


   private String especie;
   private String nombre;
   private String raza;
   private int edad_estimada;
   private char sexo;
    
   private Persona responsable;
   private CartillaSalud cartilla;

   public Animal(String especie){this.especie = especie;}

   public Animal(String especie, String nombre, String raza, int edad_estimada, Persona responsable) {
	this.especie = especie;
	this.nombre = nombre;
	this.raza = raza;
	this.edad_estimada = edad_estimada;
	this.responsable = responsable;
}
  
   public void decirMiResponsable(){

      System.out.println("Mi dueño es:"+
      responsable.nombre);
   }

   public String getNombre() {
	return nombre;
   }

   public void setNombre(String nombre) {
	this.nombre = nombre;
   }

   public String getRaza() {
	return raza;
   }

   public void setRaza(String raza) {
	this.raza = raza;
   }

   public int getEdad_estimada() {
	return edad_estimada;
   }

   public void setEdad_estimada(int edad_estimada) {
	this.edad_estimada = edad_estimada;
   }

   public char getSexo() {
	return sexo;
   }

   public void setSexo(char sexo) {
	this.sexo = sexo;
   }

   public Persona getResponsable() {
	return responsable;
   }

   public void setResponsable(Persona responsable) {
	this.responsable = responsable;
   }

   public String getEspecie() {
	return especie;
   }

   public void setEspecie(String especie) {
	this.especie = especie;
   }

   public CartillaSalud getCartilla() {
	return cartilla;
   }

   public void setCartilla(CartillaSalud cartilla) {
	this.cartilla = cartilla;
   }

   
}
