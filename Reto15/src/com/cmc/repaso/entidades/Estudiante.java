package com.cmc.repaso.entidades;

public class Estudiante {
private String nombre,resultado;
private double nota;
public Estudiante(String nombre) {
	// TODO Auto-generated constructor stub
	this.nombre=nombre;
}
public String getNombre() {
	return nombre;
}
public String getResultado() {
	return resultado;
}
public double getNota() {
	return nota;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public void setResultado(String resultado) {
	this.resultado = resultado;
}
public void setNota(double nota) {
	this.nota = nota;
}
public void calificar(double nota) {
	this.nota=nota;
	if(this.nota>=8) {
		this.resultado="A";
	}else {
		this.resultado="F";
	}
}
}
