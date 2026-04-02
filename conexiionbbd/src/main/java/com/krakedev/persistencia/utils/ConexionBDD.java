package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/Krakedev4";
	private final static String USUARIO = "postgres";
	private final static String CLAVE = "postgres";

	public static Connection conectar() throws Exception {
		Connection connection = null;

		try {
			Class.forName(DRIVER);

			connection = DriverManager.getConnection(URL, USUARIO, CLAVE);
			System.out.println("Conectado.....");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw new Exception("Error en la infraestructura");
		} catch (SQLException e) {
			e.printStackTrace();
			throw new Exception("Error al conectarse, revise usuario,clave");
		}

		return connection;

	}
}
