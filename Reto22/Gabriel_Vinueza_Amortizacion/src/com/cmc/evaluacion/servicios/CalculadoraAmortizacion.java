package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	public static double calcularCuota(Prestamo prestamo) {

		double n = prestamo.getPlazo();
		double co = prestamo.getMonto();

		double tazaMensual = interesMensual(prestamo.getInteres());
		return co * tazaMensual / (1 - Math.pow(1 + tazaMensual, (-n)));
	}

	public static  double interesMensual(double interes) {
		double tazaAnual = (interes / 100);
		double tazaMensual = tazaAnual / 12;
		return tazaMensual;
	}

	public static void generarTabla(Prestamo prestamo) {
		double monto = prestamo.getMonto();

		double interes = monto/100;
		double cuota = calcularCuota(prestamo);
		double capital = cuota - interes;
		double saldo = monto - capital;
		for (int i = 0; i < prestamo.getCuota().length; i++) {
			Cuota c = new Cuota(i + 1);
			c.setInicio(monto);
			c.setCuota(cuota);
			c.setInteres(interes);
			c.setAbonoCapital(capital);
			c.setSaldo(saldo);
			prestamo.getCuota()[i] = c;
			monto = saldo;
			interes = (monto / 100) ;

			if (cuota > saldo && (prestamo.getCuota().length - 2) == i) {
				cuota = saldo + interes;
			} else {

			}
			capital = cuota - interes;
			saldo = monto - capital;

		}
	}

	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("........................................................................................");
		System.out.println("| Numero |    Cuota   | Capital Inicial Periodo |  Interes   |  Capital   | Saldo Final|");
		System.out.println("........................................................................................");
		for (Cuota cuota : prestamo.getCuota()) {
			cuota.mostrarPrestamo();
		}
	}

}
