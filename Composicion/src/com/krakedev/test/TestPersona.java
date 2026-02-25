package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		String nombre=persona1.getNombre();
		Direccion direccion=persona1.getDireccion();
		System.out.println(nombre);
		System.out.println(direccion.getCallePrincipal());
	}

}
