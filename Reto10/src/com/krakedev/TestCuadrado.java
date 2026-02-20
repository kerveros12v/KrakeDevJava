package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		c1.setLado(5);
		c2.setLado(6);
		c3.setLado(8);
		System.out.println("Lado: "+c1.getLado()+"\nArea:"+c1.calcularArea()+"\nPerimetro: "+c1.calcularPerimetro());
		System.out.println("Lado: "+c2.getLado()+"\nArea:"+c2.calcularArea()+"\nPerimetro: "+c2.calcularPerimetro());
		System.out.println("Lado: "+c3.getLado()+"\nArea:"+c3.calcularArea()+"\nPerimetro: "+c3.calcularPerimetro());


	}

}
