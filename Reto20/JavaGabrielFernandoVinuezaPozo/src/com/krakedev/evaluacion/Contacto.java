package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula, nombre, apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos= new ArrayList<Telefono>();

	public Contacto(String cedula, String nombre, String apellido) {

		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;

	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public String getCedula() {
		return cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {
		/*
		 * formato de TestContacto
		 */

		System.out.println(formato1());

		/*
		 * formato de TestContacto2
		 */

		System.out.println(formato2());
	}

	private String formato2() {
		String s = "";
		s += ("***" + this.nombre + " " + this.apellido + "***");
		if (direccion != null) {
			s += ("\nDireccion: Calle Principal: " + direccion.getCallePrincipal() + " y "
					+ direccion.getCalleSecundaria());
		} else {
			s += ("\nNo tiene asociada una direccion");
		}
		return s;
	}

	private String formato1() {
		String s = "";
		s += ("Cedula: " + this.cedula + "\nNombre: " + this.nombre + "\nApellido: " + this.apellido);
		if (direccion != null) {
			s += ("Direccion: \n	Calle Principal: " + direccion.getCallePrincipal() + "\n	Calle Secundaria: "
					+ direccion.getCalleSecundaria());
		} else {
			s += ("\nNo tiene asociada una direccion");
		}
		return s;
	}

	public void agregarTelefono(Telefono telefono) {
		telefonos.add(telefono);
	}

	public void mostrarTelefonos() {
		String s = "Telefonos con estado 'C':";
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("C")) {
				s += "\nNumero: " + telefono.getNumero() + " Tipo: " + telefono.getTipo();
			}
		}
		System.out.println(s);
	}

	public ArrayList<Telefono> recuperarIncorrectos() {
		ArrayList<Telefono> telfs = new ArrayList<Telefono>();
		for (Telefono telefono : telefonos) {
			if (telefono.getEstado().equals("E")) {
				telfs.add(telefono);
			}
		}
		return telfs;
	}
}
