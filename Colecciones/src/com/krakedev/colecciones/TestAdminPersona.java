package com.krakedev.colecciones;

public class TestAdminPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersona admin = new AdminPersona();
		admin.agregar(new Persona("Mario", "Bennedeti", 50));
		admin.agregar(new Persona("Leo", "Messi",30));
		admin.agregar(new Persona("Cristiano", "Ronaldo",25));
		admin.agregar(new Persona("Thiago", "Messi",10));
		admin.imprimir();
	}

}
