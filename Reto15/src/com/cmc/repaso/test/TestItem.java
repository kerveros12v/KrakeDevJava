package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item();
		item.setNombre("zapatos");
		item.setProductosActuales(15);
		item.imprimir();
		item.vender(4);
		System.out.println("-------------------");
		item.imprimir();
		item.devolver(1);
		System.out.println("-------------------");
		item.imprimir();
	}

}
