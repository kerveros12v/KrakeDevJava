package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {
	public static void main(String[] args) {
		Alarma a1=new Alarma(DiasSemana.LUNES,1,30);
		Alarma a2=new Alarma(DiasSemana.MARTES,2,40);
		Alarma a3=new Alarma(DiasSemana.MIERCOLES,3,50);
		Alarma a4=new Alarma(DiasSemana.JUEVES,4,10);
		Alarma a5=new Alarma(DiasSemana.VIERNES,5,20);
		Alarma a6=new Alarma(DiasSemana.SABADO,6,30);
		Alarma a7=new Alarma(DiasSemana.DOMINGO,7,10);
		AdminAlarmas adminAlarmas=new AdminAlarmas();
		adminAlarmas.agregarAlarma(a1);
		adminAlarmas.agregarAlarma(a2);
		adminAlarmas.agregarAlarma(a3);
		adminAlarmas.agregarAlarma(a4);
		adminAlarmas.agregarAlarma(a5);
		adminAlarmas.agregarAlarma(a6);
		adminAlarmas.agregarAlarma(a7);
		System.out.println(adminAlarmas);
	}
}
