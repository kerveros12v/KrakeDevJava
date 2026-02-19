package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto productoA, productoB, productoC;

		productoA=new Producto();
		productoB=new Producto();
		productoC=new Producto();
		
		productoA.nombre="ASPIRINA";
		productoA.descripcion="PARA EL DOLOR DE CABEZA";
		productoA.precio=0.45f;
		productoA.stockActual=5;
		
		productoB.nombre="COMPLEJO B INTRAMUSCULAR";
		productoB.descripcion="PARA DOLORES FUERTES";
		productoB.precio=1.5f;
		productoB.stockActual=15;
		
		productoC.nombre="CERTAL COMPUESTO";
		productoC.descripcion="DOLORES ESTOMACALES";
		productoC.precio=0.5f;
		productoC.stockActual=10;
		
		System.out.println("Producto A\nNombre: "+productoA.nombre+"\nDescripcion: "+productoA.descripcion+"\nPrecio: "+productoA.precio+"\nStock Actual: "+productoA.stockActual);
		System.out.println("----------------------");
		System.out.println("Producto B\nNombre: "+productoB.nombre+"\nDescripcion: "+productoB.descripcion+"\nPrecio: "+productoB.precio+"\nStock Actual: "+productoB.stockActual);
		System.out.println("----------------------");
		System.out.println("Producto C\nNombre: "+productoC.nombre+"\nDescripcion: "+productoC.descripcion+"\nPrecio: "+productoC.precio+"\nStock Actual: "+productoC.stockActual);
	}

}
