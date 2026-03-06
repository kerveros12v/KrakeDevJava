package com.test;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;

public class Pruebas {
public static void main(String[] args) {
	Naipe naipe=new Naipe();
	ArrayList<Carta>baraja=naipe.barajar();
	for (Carta carta : baraja) {
	System.out.println(carta.getPalo()+"-"+carta.getNumero());
	}
}
}
