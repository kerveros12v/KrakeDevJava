package com.krakedev.composicion;

public class Persona {
private String nombre,apellido;
private Direccion direccion;
public String getNombre() {
	return nombre;
}
public String getApellido() {
	return apellido;
}
public Direccion getDireccion() {
	return direccion;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public void setDireccion(Direccion direccion) {
	this.direccion = direccion;
}
}
