package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales, productosDevueltos, productosVendidos;
	public void imprimir() {
		System.out.println("Nombre: "+this.nombre+
				"\nProductos Actuales: "+this.productosActuales+
				"\nProductos Devueltos: "+this.productosDevueltos+
				"\nProductos Vendidos: "+this.productosVendidos);
		
	}
	public void vender(int vendidos) {
		productosActuales-=vendidos;
		productosVendidos+=vendidos;
	}
	public void devolver(int devolucion) {
		productosVendidos-=devolucion;
		productosActuales+=devolucion;
		productosDevueltos+=devolucion;
	}
	public String getNombre() {
		return nombre;
	}
	public int getProductosActuales() {
		return productosActuales;
	}
	public int getProductosDevueltos() {
		return productosDevueltos;
	}
	public int getProductosVendidos() {
		return productosVendidos;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}
	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}
	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}
	
}
