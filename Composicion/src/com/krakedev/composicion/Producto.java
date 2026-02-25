package com.krakedev.composicion;

public class Producto {
private String nombre;
private double precio;
public String getNombre() {
	return nombre;
}
public double getPrecio() {
	return precio;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public Producto(String nombre, double precio) {
	super();
	this.nombre = nombre;
	this.precio = precio;
}

}
