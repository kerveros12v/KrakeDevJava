package com.cmc.evaluacion.entidades;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Cuota {
	private int numero;
	private double cuota, capital, inicio, interes, abonoCapital, saldo;

	public Cuota(int numero) {
		super();
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public double getCapital() {
		return capital;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getCuota() {
		return cuota;
	}

	public double getInicio() {
		return inicio;
	}

	public double getInteres() {
		return interes;
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public void setInicio(double inicio) {
		this.inicio = inicio;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void mostrarPrestamo() {
		DecimalFormat df = new DecimalFormat("#,##0.00");   
		df.setRoundingMode(RoundingMode.HALF_UP);
		DecimalFormat df1 = new DecimalFormat("#,##0.0");   
		df1.setRoundingMode(RoundingMode.HALF_UP);
		String salida = "|";
		int numeroEspacios = 7 - (df1.format(this.numero) + "").length();
		String espaciosNumero = "";
		for (int i = 0; i < numeroEspacios; i++) {
			espaciosNumero += " ";
		}
		int cuotaEspacios = 10 - (df.format(this.cuota) + "").length();
		String espaciosCuota = "";
		for (int i = 0; i < cuotaEspacios; i++) {
			espaciosCuota += " ";
		}

		int inicioEspacios = 23 - (df.format(this.inicio) + "").length();
		String espaciosInicio = "";
		for (int i = 0; i < inicioEspacios; i++) {
			espaciosInicio += " ";
		}
		
		int interesEspacios = 10 - (df.format(this.interes) + "").length();
		String espaciosInteres = "";
		for (int i = 0; i < interesEspacios; i++) {
			espaciosInteres += " ";
		}
	
		int capitalEspacios = 10 - (df.format(this.abonoCapital) + "").length();
		String espaciosCapital = "";
		for (int i = 0; i < capitalEspacios; i++) {
			espaciosCapital += " ";
		}
		
		int saldoEspacios = 10 - (df.format(this.saldo) + "").length();
		String espaciosSaldo= "";
		for (int i = 0; i < saldoEspacios; i++) {
			espaciosSaldo += " ";
		}
		String lineaBaja="";
		for(int i=0;i<88;i++)lineaBaja+="-";
		salida += espaciosNumero +df1.format( this.numero);
		salida += " | "+espaciosCuota + df.format(this.cuota);
		salida+=" | "+espaciosInicio+df.format(this.inicio);
		salida+=" | "+espaciosInteres+df.format(this.interes);
		salida+=" | "+espaciosCapital+df.format(this.abonoCapital);
		salida+=" | "+espaciosSaldo+df.format(this.saldo)+" |";
		salida+="\n"+lineaBaja;
		System.out.println(salida);
	}
}
