package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA, productoB, productoC;

		productoA=new Producto();
		productoB=new Producto();
		productoC=new Producto();
		
		productoA.setNombre("ASPIRINA");
		productoA.setDescripcion("PARA EL DOLOR DE CABEZA");
		productoA.setPrecio(0.45f);
		productoA.setStockActual(5);
		
		productoB.setNombre("COMPLEJO B INTRAMUSCULAR");
		productoB.setDescripcion("PARA DOLORES FUERTES");
		productoB.setPrecio(1.5f);
		productoB.setStockActual(15);
		
		productoC.setNombre("CERTAL COMPUESTO");
		productoC.setDescripcion("DOLORES ESTOMACALES");
		productoC.setPrecio(0.5f);
		productoC.setStockActual(10);
		
		System.out.println("Producto A\nNombre: "+productoA.getNombre()+"\nDescripcion: "+productoA.getDescripcion()+"\nPrecio: "+productoA.getPrecio()+"\nStock Actual: "+productoA.getStockActual());
		System.out.println("----------------------");
		System.out.println("Producto B\nNombre: "+productoB.getNombre()+"\nDescripcion: "+productoB.getDescripcion()+"\nPrecio: "+productoB.getPrecio()+"\nStock Actual: "+productoB.getStockActual());
		System.out.println("----------------------");
		System.out.println("Producto C\nNombre: "+productoC.getNombre()+"\nDescripcion: "+productoC.getDescripcion()+"\nPrecio: "+productoC.getPrecio()+"\nStock Actual: "+productoC.getStockActual());
	}

}
