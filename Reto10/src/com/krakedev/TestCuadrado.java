package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		c1.lado = 5;
		c2.lado = 6;
		c3.lado=8;
		System.out.println("Lado: "+c1.lado+"\nArea:"+c1.calcularArea()+"\nPerimetro: "+c1.calcularPerimetro());
		System.out.println("Lado: "+c2.lado+"\nArea:"+c2.calcularArea()+"\nPerimetro: "+c2.calcularPerimetro());
		System.out.println("Lado: "+c3.lado+"\nArea:"+c3.calcularArea()+"\nPerimetro: "+c3.calcularPerimetro());


	}

}
