package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBDD {
	private final static String DRIVER = "org.postgresql.Driver";
	private final static String URL = "jdbc:postgresql://localhost:5432/Krakedev4";
	private final static String USUARIO = "postgres";
	private final static String CLAVE = "postgres";

	public static Connection conectar()  {
		Connection connection = null;

		try {
			Class.forName(DRIVER);

			connection = DriverManager.getConnection(URL, USUARIO, CLAVE);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return connection;

	}
}
