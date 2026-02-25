package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto mc;
		AdminProducto admin = new AdminProducto();
		Producto p1=new Producto("Doritos", 0.55);
		Producto p2=new Producto("Papitas", 0.55);
		mc=admin.buscarMasCaro(p1, p2);
		
		System.out.println((mc!=null)?"El mas caro es: "+mc.getNombre():"Son iguales");
	}

}
