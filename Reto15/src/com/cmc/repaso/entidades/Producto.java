package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;

	public Producto(String nombre, double precio) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
		setPrecio(precio);
	}

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
		this.precio = (precio<0)?precio*-1:precio;
	}
	
public double calcularPrecioPromo(int porcentajeDescuento) {
	return precio-((precio/100)*porcentajeDescuento);
}
}
