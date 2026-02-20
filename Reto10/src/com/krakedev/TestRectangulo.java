package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		r1.setBase(5);
		r1.setAltura(6);
		System.out.println("Base: "+r1.getBase()+"\nAltura: "+r1.getAltura()+"\nArea:"+r1.calcularArea()+"\nPerimetro: "+r1.calcularPerimetro());
	}

}
