package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {
	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "09941234123", 10);
		Telefono telf2 = new Telefono("claro", "09912334123", 10);
		Telefono telf3 = new Telefono("movi", "09944564123", 10);
		AdminTelefono adminTelf = new AdminTelefono();
		int totalmovi=adminTelf.contarMovi(telf1, telf2, telf3);
		System.out.println("Total de numeros en operadora movi: "+totalmovi);
	}
}
