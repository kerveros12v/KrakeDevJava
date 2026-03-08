package com.cmc.evaluacion.entidades;

public class Prestamo {
private double monto=0,interes=0;
private int plazo=0;
private Cuota[] cuota;
private Cliente cliente;
public Prestamo(double monto, double interes, int plazo) {
	super();
	this.monto = monto;
	this.interes = interes;
	this.plazo = plazo;
	cuota=new Cuota[this.plazo];
}



public Cliente getCliente() {
	return cliente;
}



public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}



public Cuota[] getCuota() {
	return cuota;
}

public double getMonto() {
	return monto;
}
public double getInteres() {
	return interes;
}
public int getPlazo() {
	return plazo;
}
public void setMonto(double monto) {
	this.monto = monto;
}
public void setInteres(double interes) {
	this.interes = interes;
}
public void setPlazo(int plazo) {
	this.plazo = plazo;
}
public void mostrarPrestamo() {
	System.err.println("[monto= "+monto+" , interes= "+interes+" , plazo= "+plazo+"]");
}
}
