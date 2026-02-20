package com.krakedev;

public class Producto {
	private String nombre;
	private String descripcion;
	private float precio;
	private int stockActual;
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public int getStockActual() {
		return stockActual;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public void setStockActual(int stockActual) {
		this.stockActual = stockActual;
	}
}
