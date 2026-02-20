package com.krakedev;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona();
		p1.setNombre("Mario");
		p1.setEdadPersona(45);
		p1.setEstatura(1.58);
		System.out.println("nombre: "+p1.getNombre());
		System.out.println("edad: "+p1.getEdadPersona());
		System.out.println("estatura: "+p1.getEstatura());
		Persona p2 = new Persona();
		p2.setNombre("Juan");		
		p2.setEdadPersona(30);
		p2.setEstatura(1.68);
		System.out.println("nombre: "+p2.getNombre());
		System.out.println("edad: "+p2.getEdadPersona());
		System.out.println("estatura: "+p2.getEstatura());
	}

}
