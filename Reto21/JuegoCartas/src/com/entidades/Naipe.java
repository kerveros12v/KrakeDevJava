package com.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;

	public Naipe() {
		// TODO Auto-generated constructor stub
		numerosPosibles = new ArrayList<Numero>();
		cartas = new ArrayList<Carta>();
		Palos palos = new Palos();
		ArrayList<String> lstpalos = new ArrayList<String>();
		lstpalos.add(palos.getCorazonNegro());
		lstpalos.add(palos.getCorazonRojo());
		lstpalos.add(palos.getDiamante());
		lstpalos.add(palos.getTrevol());
		numerosPosibles.add(new Numero("A", 11));
		for (int c2 = 2; c2 < 11; c2++) {
			numerosPosibles.add(new Numero(c2 + "", c2));
		}
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
		for (String pl1 : lstpalos) {
			for (Numero num : numerosPosibles) {
				cartas.add(new Carta(num, pl1));
			}
		}
	}

	public ArrayList<Carta> getCartas() {
		return cartas;
	}

	public ArrayList<Carta> barajar() {
		ArrayList<Carta> auxcartas = new ArrayList<Carta>();
		int movimientos=0;
		while (auxcartas.size() < 52) {
			Carta auxcart = cartas.get(Random.obtenerPosicion());
			if (auxcart.getEstado().equals("N")) {
				auxcart.setEstado("C");
				auxcartas.add(auxcart);
			}
			movimientos++;
			
		}
		return auxcartas;
	}
}
