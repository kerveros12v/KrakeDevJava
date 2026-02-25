package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
		persona1.setNombre("Fernando");
		Direccion dir=new Direccion();
		dir.setCallePrincipal("Av. Siempre viva");
		dir.setCalleSecundaria("Falsa");
		dir.setNumero("123");
		persona1.setDireccion(dir);
		
		
		String nombre=persona1.getNombre();
		Direccion direccion=persona1.getDireccion();
		System.out.println(nombre);
		System.out.println(direccion.getCallePrincipal());
		persona1.imprimir();
		Persona p2=new Persona();
		p2.setNombre("Andres");
		p2.imprimir();
	}

}
