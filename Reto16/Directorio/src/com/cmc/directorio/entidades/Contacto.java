package com.cmc.directorio.entidades;

public class Contacto {
	private String nombre, apellido;
	private boolean activo;
	private double peso;
	Telefono telefono;

	public Contacto(String nombre, String apellido, double peso, Telefono telefono) {

		this.nombre = nombre;
		this.apellido = apellido;
		this.peso = peso;
		this.telefono = telefono;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public boolean isActivo() {
		return activo;
	}

	public double getPeso() {
		return peso;
	}

	public Telefono getTelefono() {
		return telefono;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setTelefono(Telefono telefono) {
		this.telefono = telefono;
	}

	public void imprimir() {
		System.err.println("Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nPeso: " + this.peso+"\nActivo: "+this.activo);
		this.telefono.imprimir();
	}
}
