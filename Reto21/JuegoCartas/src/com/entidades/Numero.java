package com.entidades;

public class Numero {
private String numeroCarta;
private int valor;
public Numero(String numeroCarta, int valor) {
	super();
	this.numeroCarta = numeroCarta;
	this.valor = valor;
}
public String getNumeroCarta() {
	return numeroCarta;
}
public int getValor() {
	return valor;
}
public void setNumeroCarta(String numeroCarta) {
	this.numeroCarta = numeroCarta;
}
public void setValor(int valor) {
	this.valor = valor;
}
public void mostrar() {
	System.out.println(toString());
}
@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.numeroCarta+"-"+this.valor;
	}
}
