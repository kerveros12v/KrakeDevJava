package com.krakedev;

public class TestCalculadora {
public static void main(String[] args) {
	Calculadora calculadora=new Calculadora();
	System.out.println("Suma : "+calculadora.sumar(3, 5));
	System.out.println("Resta : "+calculadora.restar(13, 8));
	System.out.println("Multiplicar : "+calculadora.multiplicar(3, 8));
	System.out.println("Division : "+calculadora.dividir(35, 5));
	System.out.println("Promediar : "+calculadora.promediar(3, 5,7));
	System.out.println("Mensaje: "+calculadora.mostrarResultado());
}
}
