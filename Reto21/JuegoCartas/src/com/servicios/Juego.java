package com.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<String> jugadores;
	private int posicionNaipes;

	public Juego(ArrayList<String> jugadores) {
		this.naipe = new Naipe();
		this.cartasJugadores = new ArrayList<ArrayList<Carta>>();
		this.jugadores=jugadores;
		naipeBarajado = this.naipe.barajar();
		for (int i = 0; i < jugadores.size(); i++) {
			cartasJugadores.add(new ArrayList<Carta>());
		}
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		for (int j = 0; j < cartasPorJugador; j++) {
			for (int i = 0; i < cartasJugadores.size(); i++) {
				ArrayList<Carta> jugadores = cartasJugadores.get(i);
				if (posicionNaipes < 52) {
					jugadores.add(naipeBarajado.get(posicionNaipes));
					
					posicionNaipes++;
				}
					}
		}
		
	}
public int devolverTotal(int idJugador) {
	int total=0;
	ArrayList<Carta>mano= cartasJugadores.get(idJugador);
	for (Carta carta : mano) {
		total+=carta.getNumero().getValor();
	}
	return total;
}
public String determinarGanador() {
	int ganador=0;
	ArrayList<Integer>totales=new ArrayList<Integer>();
	for (int i=0;i<cartasJugadores.size();i++) {
		totales.add(devolverTotal(i));
	}
	int mayor=0;
	for(int j=0;j<totales.size();j++) {
		if(mayor<totales.get(j)) {
			mayor=totales.get(j);
			ganador=j;
		}
	}
	return jugadores.get(ganador);
}

}
