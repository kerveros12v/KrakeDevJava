package com.krakedev.conexiionbbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConexion {
public static void main(String[] args) {
	Connection connection=null;
	try {
		Class.forName("org.postgresql.Driver");
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","postgres");
		System.out.println("Conexion exitosa");
	} catch (ClassNotFoundException|SQLException e) {
		// TODO: handle exception
		System.err.println(e);
	}
}
}
