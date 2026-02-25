package com.krakedev.composicion;

public class AdminProducto {
	public Producto buscarMasCaro(Producto producto1, Producto producto2) {
return (producto1.getPrecio()==producto2.getPrecio())?null:(producto1.getPrecio()>producto2.getPrecio())?producto1:producto2;
	}
}
