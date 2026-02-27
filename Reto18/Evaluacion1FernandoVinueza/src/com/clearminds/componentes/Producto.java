package com.clearminds.componentes;

public class Producto {
	String nombre, codigo;
	double precio;
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	public Producto( String codigo,String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public double getPrecio() {
		return precio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public void incrementarPrecio(int porcentaje) {
		this.precio+=(precio/100)*porcentaje;
	}
	public void disminuirPrecio(double descuento) {
		this.precio-=descuento;
	}
}
