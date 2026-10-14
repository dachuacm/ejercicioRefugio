package app_refugio.modelo;

import java.time.LocalDate;

public abstract class Persona implements Evaluable<Persona>{

protected String nombre;
private String apellido;
private LocalDate fechaNac;
private String direccion;
private String telefono;
private String CURP;

public Persona(){}

public Persona(String nombre, String cURP) {
	this.nombre = nombre;
	CURP = cURP;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public LocalDate getFechaNac() {
	return fechaNac;
}
public void setFechaNac(LocalDate fechaNac) {
	this.fechaNac = fechaNac;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getCURP() {
	return CURP;
}
public void setCURP(String cURP) {
	CURP = cURP;
}



}
