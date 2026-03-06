package com.entidades;

public class Random {
public static int obtenerPosicion() {
	java.util.Random numeroaleatorio=new java.util.Random();
	return numeroaleatorio.nextInt(52);
}
}
