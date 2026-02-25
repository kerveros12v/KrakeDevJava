package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf1 = new Telefono("claro", "09941234123", 10);
		Contacto contacto1 = new Contacto("Fernando", "Vinueza", 150, telf1);
	
		contacto1.imprimir();
		Contacto contacto2 = new Contacto("Maria", "Castro", 180, new Telefono("claro", "0999999999", 10));
		contacto2.imprimir();
		AdminContactos adminContactos=new AdminContactos();
		Contacto maspesado=adminContactos.buscarMasPesado(contacto1, contacto2);
		System.out.println("---------Contacto mas Pesado--------------");
		maspesado.imprimir();
		System.out.println("---------Comparar Operadoras-------------");
		System.out.println("Son iguales: "+adminContactos.compararOperadoras(contacto1, contacto2)); 
		
	}

}
