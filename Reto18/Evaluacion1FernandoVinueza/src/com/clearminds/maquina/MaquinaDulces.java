package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	ArrayList<Celda> celdas;
	double saldo;

	public MaquinaDulces() {
		// TODO Auto-generated constructor stub
		celdas = new ArrayList<Celda>();
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void agregarCelda(Celda celda) {

		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			Celda celda = celdas.get(i);
			System.out.println("Celda " + (i + 1) + ": " + celda.getCodigo());
		}

	}

	public Celda buscarCelda(String codigo) {
		for (Celda celda : celdas) {
			if (celda.getCodigo().equalsIgnoreCase(codigo))
				return celda;
		}
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);

	}

	public void mostrarProductos() {
		String salida = "";
		for (Celda celda : celdas) {
			salida += "Celda: " + celda.getCodigo() + " Stock: " + celda.getStock();
			if (celda.getProducto() != null)
				salida += " Producto : " + celda.getProducto().getCodigo() + " Precio: "
						+ celda.getProducto().getPrecio() + "\n";
			else
				salida += " Sin Producto asignado\n";
		}
		salida += "Saldo: " + this.saldo;
		System.out.println(salida);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		for (Celda celda : celdas) {
			if (celda.getCodigo().equalsIgnoreCase(codigo))
				return celda.getProducto();
		}

		return null;
	}

	public double consultarPrecio(String codigo) {
		Producto p = buscarProductoEnCelda(codigo);
		if (p != null)
			return p.getPrecio();
		return 0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		for (Celda celda : celdas) {
			if (celda.getProducto() != null)
				if (celda.getProducto().getCodigo().equalsIgnoreCase(codigoProducto))
					return celda;
		}
		return null;
	}

	public void incrementarProductos(String codigoProducto, int cantidad) {
		Celda celdaEncontrada = buscarCeldaProducto(codigoProducto);
		if (celdaEncontrada != null)
			celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidad);
	}

	public void vender(String codigoCelda) {
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);

		this.saldo += celdaEncontrada.getProducto().getPrecio();
	}

	public double venderConCambio(String codigoCelda, double valor) {
		double cambio = 0;
		vender(codigoCelda);
		Celda celdaEncontrada = buscarCelda(codigoCelda);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.saldo += celdaEncontrada.getProducto().getPrecio();
		cambio = valor - celdaEncontrada.getProducto().getPrecio();
		return cambio;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> menores = new ArrayList<Producto>();
		for (Celda celda : celdas) {
			if (celda.getProducto() != null) {
				if (celda.getProducto().getPrecio() <= limite)
					menores.add(celda.getProducto());
			}
		}
		return menores;
	}
}
