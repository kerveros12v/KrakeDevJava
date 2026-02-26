package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		/*
		 * La celda con codigo A1 no tiene un producto asignado
		 * por lo que no puede ingresar al atributo nombre
		 * la variable que activa el nullpointException es prod
		 */
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		
		
		
	}
}
