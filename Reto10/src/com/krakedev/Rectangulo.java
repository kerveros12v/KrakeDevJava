package com.krakedev;

public class Rectangulo {
	private int base;
	private int altura;
	public int getBase() {
		return base;
	}
	public int getAltura() {
		return altura;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int calcularArea() {
		return this.base*this.altura;
	}
	public double calcularPerimetro(){
		return (this.base+this.altura)*2;
	}
}
