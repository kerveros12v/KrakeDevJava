package com.krakedev.estaticos.ejercicio.utils;

public class Util {
public static String formatearHora(int numero) {
	return ""+((numero<10)?"0":"")+numero;
}
public static String formatearDia(int numero) {
	String s="";
	switch (numero) {
	case 0: {
		s="Lunes";
	break;
	}
	case 1: {
		s="Martes";
		break;
		}
	case 2: {
		s="Miercoles";
		break;
		}
	case 3: {
		s="Jueves";
		break;
		}
	case 4: {
		s="Viernes";
		break;
		}
	case 5: {
		s="Sabado";
		break;
		}
	case 6: {
		s="Domingo";
		break;
		}
	default:
		break;
	}
	return s;
}
}
