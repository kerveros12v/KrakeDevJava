package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("c1"));
        maquina.agregarCelda(new Celda("C2"));
		Producto producto=new Producto("AE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("A456","Doritos",0.50);
		maquina.cargarProducto(producto2, "A2", 6);
		
		Producto producto3=new Producto("BE34","Jet",0.25);
		maquina.cargarProducto(producto3, "B1", 4);
		
		Producto producto4=new Producto("B456","DeTodito",0.60);
		maquina.cargarProducto(producto4, "B2", 6);
		Producto producto5=new Producto("CE34","Rufles",0.95);
		maquina.cargarProducto(producto5, "C1", 4);
		
		Producto producto6=new Producto("C456","Salticas",0.91);
		maquina.cargarProducto(producto6, "C2", 6);
		System.out.println("Productos Menores: "+maquina.buscarMenores(0.90).size());
		for (Producto auxProducto : maquina.buscarMenores(0.90)) {
			System.out.println("Nombre: "+auxProducto.getNombre()+" Precio: "+auxProducto.getPrecio());
		}
		
	}

}
