package com.krakedev;

public class TestConstructores {
public static void main(String[] args) {
	System.out.println("-------------- Auto ----------------");
	Auto auto1=new Auto("Chevrolet",2015,20500.10f);
	Auto auto2=new Auto();

	auto2.setMarca("Toyota");
	auto2.setAnio(2020);
	auto2.setPrecio(30000f);

	System.out.println("Auto 1: \nMarca: "+auto1.getMarca()+"\nAño: "+auto1.getAnio()+"\nPrecio: "+auto1.getPrecio());
	System.out.println("-------------------------------");
	System.out.println("Auto 2: \nMarca: "+auto2.getMarca()+"\nAño: "+auto2.getAnio()+"\nPrecio: "+auto2.getPrecio());
	
	
	System.out.println("---------------- Fecha ---------------");
	Fecha f1 = new Fecha();
	Fecha f2 = new Fecha(15,12,1990);
	f1.setAnio(2026);
	f1.setMes(02);
	f1.setDia(20);

	System.out.println("Fecha ingresada: "+f1.getDia()+"/"+f1.getMes()+"/"+f1.getAnio());
	System.out.println("Fecha ingresada: "+f2.getDia()+"/"+f2.getMes()+"/"+f2.getAnio());
	
	System.out.println("---------------- Persona ---------------");
	Persona p1 = new Persona();
	p1.setNombre("Mario");
	p1.setEdadPersona(45);
	p1.setEstatura(1.58);

	System.out.println("nombre: "+p1.getNombre());
	System.out.println("edad: "+p1.getEdadPersona());
	System.out.println("estatura: "+p1.getEstatura());
	System.out.println("-------------------------------");
	Persona p2 = new Persona("Juan",30,1.68);
	
	System.out.println("nombre: "+p2.getNombre());
	System.out.println("edad: "+p2.getEdadPersona());
	System.out.println("estatura: "+p2.getEstatura());
	
	System.out.println("---------------- Productos ---------------");
	Producto productoA, productoB, productoC;
	productoA=new Producto();
	productoB=new Producto("COMPLEJO B INTRAMUSCULAR",1.5f,15);
	productoC=new Producto("CERTAL COMPUESTO","DOLORES ESTOMACALES",0.5f,10);
	
	productoA.setNombre("ASPIRINA");
	productoA.setDescripcion("PARA EL DOLOR DE CABEZA");
	productoA.setPrecio(0.45f);
	productoA.setStockActual(5);
	
	
	System.out.println("Producto A\nNombre: "+productoA.getNombre()+"\nDescripcion: "+productoA.getDescripcion()+"\nPrecio: "+productoA.getPrecio()+"\nStock Actual: "+productoA.getStockActual());
	System.out.println("----------------------");
	System.out.println("Producto B\nNombre: "+productoB.getNombre()+"\nDescripcion: "+productoB.getDescripcion()+"\nPrecio: "+productoB.getPrecio()+"\nStock Actual: "+productoB.getStockActual());
	System.out.println("----------------------");
	System.out.println("Producto C\nNombre: "+productoC.getNombre()+"\nDescripcion: "+productoC.getDescripcion()+"\nPrecio: "+productoC.getPrecio()+"\nStock Actual: "+productoC.getStockActual());

}
}
