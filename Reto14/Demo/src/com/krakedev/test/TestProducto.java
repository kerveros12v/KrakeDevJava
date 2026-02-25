package com.krakedev.test;

import com.krakedev.demo.Producto;

public class TestProducto {
public static void main(String[] args) {
	// TODO Auto-generated method stub
		Producto producto1=new Producto(123, "Arroz");
		producto1.setDescripcion("Granos");
		producto1.setPeso(5);
		System.out.println("Producto: "+producto1.getNombre()+"\nCodigo: "+producto1.getCodigo()+"\nDescripcion: "+producto1.getDescripcion()+"\nPeso: "+producto1.getPeso());

}
}
