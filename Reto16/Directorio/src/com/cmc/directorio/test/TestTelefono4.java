package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf1 = new Telefono("movi", "09941234123", 10);
		Telefono telf2 = new Telefono("claro", "09912334123", 10);
		Telefono telf3 = new Telefono("movi", "09944564123", 10);
		Telefono telf4 = new Telefono("movi", "09944564333", 10);
		AdminTelefono adminTelf = new AdminTelefono();
		int totalclaro=adminTelf.contarClaro(telf1, telf2, telf3,telf4);
		System.out.println("Total de numeros en operadora movi: "+totalclaro);

	}

}
