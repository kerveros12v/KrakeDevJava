package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersona admin = new AdminPersona();
		admin.agregar(new Persona("Mario", "Bennedeti", 50));
		admin.agregar(new Persona("Leo", "Messi", 30));
		admin.agregar(new Persona("Cristiano", "Ronaldo", 25));
		admin.agregar(new Persona("Thiago", "Messi", 10));
		Persona p1 = admin.buscarPorNombre("MArio");
		System.err.println("Persona: " + p1.getNombre() + " " + p1.getApellido() + " , " + p1.getEdad());
		admin.imprimir();
		ArrayList<Persona> personasMayores = admin.buscarMayores(25);
		System.out.println("Mayores: " + personasMayores.size());
	}

}
