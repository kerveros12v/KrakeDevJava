package com.krakedev;

public class Rectangulo {
	public int base;
	public int altura;
	public int calcularArea() {
		return this.base*this.altura;
	}
	public double calcularPerimetro(){
		return (this.base+this.altura)*2;
	}
}
