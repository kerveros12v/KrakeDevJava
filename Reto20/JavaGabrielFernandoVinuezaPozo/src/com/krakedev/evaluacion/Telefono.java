package com.krakedev.evaluacion;

public class Telefono {
	private String numero, tipo, estado;

	public Telefono(String numero, String tipo) {
		this.numero=numero;
		this.tipo=tipo;
		validacion(numero, tipo);
	}

	private void validacion(String numero, String tipo) {
		if (numero != null && tipo != null) {
			if (tipo.equalsIgnoreCase("Movil")) {
				if (numero.length() == 10) {
					
					this.estado = "C";
				} else {
					this.estado = "E";
				}

			} else if (tipo.equalsIgnoreCase("Convencional")) {
				if (numero.length() == 7) {
					this.estado = "C";
				} else {
					this.estado = "E";
				}
			} else {
				this.estado = "E";
			}

		} else {
			this.estado = "E";
		}
	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

	public void setNumero(String número) {
		this.numero = número;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
