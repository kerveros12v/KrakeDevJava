package com.cmc.test;

import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.servicios.CalculadoraAmortizacion;

public class TestCalculadora {
    public static void main(String[] args) {
        Prestamo prestamo = new Prestamo(7000, 24, 36);

        CalculadoraAmortizacion.generarTabla(prestamo);
        CalculadoraAmortizacion.mostrarTabla(prestamo);
    }
}
