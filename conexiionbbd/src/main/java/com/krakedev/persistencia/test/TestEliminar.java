package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.Convertidor;
import com.krakedev.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			AdminPersonas.eliminar(new Persona("1113854489", "Andrea", "Arciniegas", 1.50,
					Convertidor.convertirFecha("1990/12/14"), Convertidor.convertirHora("08:00:00"),
					new BigDecimal(100.00), 3, new EstadoCivil("U", "Union Libre")));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
