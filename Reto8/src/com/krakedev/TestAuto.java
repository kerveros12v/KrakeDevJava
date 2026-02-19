package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto auto1=new Auto();
		Auto auto2=new Auto();
		auto1.marca="Chevrolet";
		auto1.anio=2015;
		auto1.precio=20500.10f;
		auto2.marca="Toyota";
		auto2.anio=2020;
		auto2.precio=30000f;
		System.out.println("Auto 1: \nMarca: "+auto1.marca+"\nAño: "+auto1.anio+"\nPrecio: "+auto1.precio);
		System.out.println("-------------------------------");
		System.out.println("Auto 2: \nMarca: "+auto2.marca+"\nAño: "+auto2.anio+"\nPrecio: "+auto2.precio);
	}

}
