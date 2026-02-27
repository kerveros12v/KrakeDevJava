package com.krakedev.colecciones;

import java.util.ArrayList;

public class AdminPersona {
	ArrayList<Persona> personas;

	public AdminPersona() {
		// TODO Auto-generated constructor stub
		personas = new ArrayList<Persona>();
	}

	public void agregar(Persona persona) {
		personas.add(persona);
	}

	public void imprimir() {
			for (Persona persona : personas) {
				System.out.println("Persona: "+persona.getNombre()+" "+persona.getApellido()+","+persona.getEdad());
			}
	}
}
