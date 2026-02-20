package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1 = new Fecha();
		f1.setAnio(2026);
		f1.setMes(02);
		f1.setDia(20);
		System.out.println("Fecha ingresada: "+f1.getDia()+"/"+f1.getMes()+"/"+f1.getAnio());
	}

}
