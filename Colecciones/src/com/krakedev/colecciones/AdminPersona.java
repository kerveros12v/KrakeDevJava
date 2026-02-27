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
	public Persona buscarPorNombre(String nombre) {
		for (Persona persona : personas) {
			return (persona.getNombre().equalsIgnoreCase(nombre))?persona:null;
			
		}
		return null;
	}
	public ArrayList<Persona> buscarMayores(int edad) {
		ArrayList<Persona>resultado=new ArrayList<Persona>();
		for (Persona persona : personas) {
		if(persona.getEdad()>edad)resultado.add(persona);
			
		}
		return resultado;
	}
}
