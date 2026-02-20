package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		auto1.setMarca("Chevrolet");
		auto1.setAnio(2015);
		auto1.setPrecio(20500.10f);
		auto2.setMarca("Toyota");
		auto2.setAnio(2020);
		auto2.setPrecio(30000f);
		System.out.println("Auto 1: \nMarca: "+auto1.getMarca()+"\nAño: "+auto1.getAnio()+"\nPrecio: "+auto1.getPrecio());
		System.out.println("-------------------------------");
		System.out.println("Auto 2: \nMarca: "+auto2.getMarca()+"\nAño: "+auto2.getAnio()+"\nPrecio: "+auto2.getPrecio());
	}

}
