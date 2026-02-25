package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante1 = new Estudiante("Fernando");
		estudiante1.calificar(9);
		System.out.println("Estudiante: "+estudiante1.getNombre()+"\nNota: "+estudiante1.getNota()+"\nResultado: "+estudiante1.getResultado());
	}

}
