package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		r1.base = 5;
		r1.altura = 6;
		System.out.println("Base: "+r1.base+"\nAltura: "+r1.altura+"\nArea:"+r1.calcularArea()+"\nPerimetro: "+r1.calcularPerimetro());
	}

}
