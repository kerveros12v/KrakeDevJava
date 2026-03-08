package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public Cliente buscarCliente(String cedula) {
		for (Cliente cliente : clientes) {
			if (cliente.getCedula().equals(cedula))
				return cliente;
		}
		return null;
	}

	public void registrarCliente(Cliente cliente) {
		Cliente c = buscarCliente(cliente.getCedula());
		if (c == null)
			clientes.add(cliente);
		else
			System.err.println("Cliente ya existe: " + cliente.getCedula());
	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente c = buscarCliente(cedula);
		if (c != null) {
			c.setCedula(cedula);
			CalculadoraAmortizacion.generarTabla(prestamo);
			prestamo.setCliente(c);
			prestamos.add(prestamo);

		} else
			System.err.println("No es Cliente del banco: ");
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> lista = new ArrayList<Prestamo>();
		for (Prestamo prestamo : prestamos) {
			if (prestamo.getCliente().getCedula().equals(cedula)) {
				lista.add(prestamo);
			}
		}
		return lista;
	}
	
}
