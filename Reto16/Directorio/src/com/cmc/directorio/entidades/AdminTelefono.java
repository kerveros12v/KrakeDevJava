package com.cmc.directorio.entidades;


public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		telefono.setTieneWhatsapp((telefono.getOperadora() != null) ? true : false);
	}
	public int contarMovi(Telefono telf1,Telefono telf2,Telefono telf3) {
		int cont =0;
		if(telf1.getOperadora().equalsIgnoreCase("movi")) {
			cont++;
		}
		if(telf2.getOperadora().equalsIgnoreCase("movi")) {
			cont++;
		}
		if(telf3.getOperadora().equalsIgnoreCase("movi")) {
			cont++;
		}
		return cont;
	}
	public int contarClaro(Telefono telf1,Telefono telf2,Telefono telf3,Telefono telf4) {
		int cont =0;
		if(telf1.getOperadora().equalsIgnoreCase("claro")) {
			cont++;
		}
		if(telf2.getOperadora().equalsIgnoreCase("claro")) {
			cont++;
		}
		if(telf3.getOperadora().equalsIgnoreCase("claro")) {
			cont++;
		}
		if(telf4.getOperadora().equalsIgnoreCase("claro")) {
			cont++;
		}
		return cont;
	}
}
