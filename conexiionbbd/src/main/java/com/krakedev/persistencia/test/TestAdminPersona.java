package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.servicios.AdminPersonas;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminPersona {
	public static void main(String[] args) {
		try {
			AdminPersonas.insertar(new Persona("1113854489", "SeaGHn", "AlbaFFn", 1.50,
					Convertidor.convertirFecha("1990/12/14"), Convertidor.convertirHora("08:00:00"),
					new BigDecimal(100.00), 3, new EstadoCivil("U", "Union Libre")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
