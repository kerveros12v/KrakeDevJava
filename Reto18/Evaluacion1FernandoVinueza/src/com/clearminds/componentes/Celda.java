package com.clearminds.componentes;

public class Celda {
Producto producto;
int stock=0;
String codigo;

public Celda(String codigo) {
	this.codigo = codigo;
}

public Producto getProducto() {
	return producto;
}

public void setProducto(Producto producto) {
	this.producto = producto;
}

public int getStock() {
	return stock;
}
public String getCodigo() {
	return codigo;
}

public void setStock(int stock) {
	this.stock = stock;
}
public void setCodigo(String codigo) {
	this.codigo = codigo;
}
public void ingresarProducto(Producto producto, int stock) {
	this.producto=producto;
	this.stock=stock;
}
}
