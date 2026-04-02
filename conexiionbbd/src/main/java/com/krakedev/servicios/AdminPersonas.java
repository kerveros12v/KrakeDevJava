package com.krakedev.servicios;
import java.sql.Connection;
import java.sql.SQLException;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
public static void insertar(Persona persona) {
	Connection con=null;
	try {
	con=ConexionBDD.conectar();
	System.out.println("insertar....OK");
	} catch (Exception e) {
		// TODO: handle exception
		System.err.println(e.getMessage());
		e.printStackTrace();
	}finally {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
}
}
