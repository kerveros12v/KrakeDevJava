package com.krakedev.excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
		System.out.println("inicio");
		String a = "xxxss";
		try {
			a.substring(3);
			System.out.println("fin");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("entra al cacth");
		}finally {
			System.out.println("ingresa a finally");
		}
		System.out.println("fuera del cacth");
	}
}
