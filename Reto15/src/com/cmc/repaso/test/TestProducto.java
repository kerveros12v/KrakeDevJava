package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Producto producto1=new Producto("jarabe", -15);
double total=producto1.calcularPrecioPromo(15);
System.out.println("Producto: "+producto1.getNombre()+"\nPrecio: "+producto1.getPrecio()+"\nTotal con descuento: "+total);

Producto producto2=new Producto("jarabe", 25);
double total2=producto2.calcularPrecioPromo(15);
System.out.println("Producto: "+producto2.getNombre()+"\nPrecio: "+producto2.getPrecio()+"\nTotal con descuento: "+total2);

	}

}
