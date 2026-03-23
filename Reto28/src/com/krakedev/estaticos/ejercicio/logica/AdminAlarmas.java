package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	ArrayList<Alarma> alarmas = new ArrayList<Alarma>();

	public void agregarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}
	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String s="";
		for (Alarma alarma : alarmas) {
			s+="\n"+alarma;
		}
		return s;
	}
}
