package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	Celda celda1, celda2, celda3, celda4;
	double saldo;

	public Celda getCelda1() {
		return celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		celda1 = new Celda(codigo1);
		celda2 = new Celda(codigo2);
		celda3 = new Celda(codigo3);
		celda4 = new Celda(codigo4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda 1: Codigo: " + celda1.getCodigo());
		System.out.println("Celda 2: Codigo: " + celda2.getCodigo());
		System.out.println("Celda 3: Codigo: " + celda3.getCodigo());
		System.out.println("Celda 4: Codigo: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (this.celda1.getCodigo().equalsIgnoreCase(codigo))
			return this.celda1;
		if (this.celda2.getCodigo().equalsIgnoreCase(codigo))
			return this.celda2;
		if (this.celda3.getCodigo().equalsIgnoreCase(codigo))
			return this.celda3;
		if (this.celda4.getCodigo().equalsIgnoreCase(codigo))
			return this.celda4;
		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);

	}

	public void mostrarProductos() {
		System.out.println("************CELDA " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() != null)
			System.out.println("Producto : " + celda1.getProducto().getNombre() + "\nPrecio: "
					+ celda1.getProducto().getPrecio() + "\nCodigo: " + celda1.getProducto().getCodigo());
		else
			System.err.println("La celda no tiene producto!!!");
		
		System.out.println("************CELDA " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() != null)
			System.out.println("Producto : " + celda2.getProducto().getNombre() + "\nPrecio: "
					+ celda2.getProducto().getPrecio() + "\nCodigo: " + celda2.getProducto().getCodigo());
		else
			System.err.println("La celda no tiene producto!!!");
		System.out.println("************CELDA " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() != null)
			System.out.println("Producto : " + celda3.getProducto().getNombre() + "\nPrecio: "
					+ celda3.getProducto().getPrecio() + "\nCodigo: " + celda3.getProducto().getCodigo());
		else
			System.err.println("La celda no tiene producto!!!");
		System.out.println("************CELDA " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() != null)
			System.out.println("Producto : " + celda4.getProducto().getNombre() + "\nPrecio: "
					+ celda4.getProducto().getPrecio() + "\nCodigo: " + celda4.getProducto().getCodigo());
		else
			System.err.println("La celda no tiene producto!!!");
		System.err.println("Saldo: " + this.saldo);

	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (this.celda1.getCodigo().equalsIgnoreCase(codigo))
			return this.celda1.getProducto();
		if (this.celda2.getCodigo().equalsIgnoreCase(codigo))
			return this.celda2.getProducto();
		if (this.celda3.getCodigo().equalsIgnoreCase(codigo))
			return this.celda3.getProducto();
		if (this.celda4.getCodigo().equalsIgnoreCase(codigo))
			return this.celda4.getProducto();
		return null;
	}

	public double consultarPrecio(String codigo) {
		Producto p = buscarProductoEnCelda(codigo);
		if (p != null)
			return p.getPrecio();
		return 0;
	}

	public Celda buscarCeldaProducto(String codigoProducto) {
		if (this.celda1.getProducto() != null)
			if (this.celda1.getProducto().getCodigo().equalsIgnoreCase(codigoProducto))
				return this.celda1;
		if (this.celda2.getProducto() != null)
			if (this.celda2.getProducto().getCodigo().equalsIgnoreCase(codigoProducto))
				return this.celda2;
		if (this.celda3.getProducto() != null)
			if (this.celda3.getProducto().getCodigo().equalsIgnoreCase(codigoProducto))
				return this.celda3;
		if (this.celda4.getProducto() != null)
			if (this.celda4.getProducto().getCodigo().equalsIgnoreCase(codigoProducto))
				return this.celda4;
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
}
