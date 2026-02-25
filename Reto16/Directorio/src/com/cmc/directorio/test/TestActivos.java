package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf1 = new Telefono("claro", "09941234123", 10);
		Contacto contacto1 = new Contacto("Fernando", "Vinueza", 150, telf1);
		contacto1.imprimir();
		System.out.println("------------------------");
		AdminTelefono admintelf = new AdminTelefono();
		admintelf.activarMensajeria(telf1);
		AdminContactos adminContactos = new AdminContactos();
		adminContactos.activarUsuario(contacto1);
		contacto1.imprimir();
	}

}
