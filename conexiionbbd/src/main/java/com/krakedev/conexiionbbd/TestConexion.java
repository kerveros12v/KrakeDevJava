package com.krakedev.conexiionbbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestConexion {
public static void main(String[] args) {
	Connection connection=null;
	PreparedStatement ps=null;
	
	try {
		Class.forName("org.postgresql.Driver");
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Krakedev4","postgres","postgres");
		System.out.println("Conexion exitosa");
		ps=connection.prepareStatement("INSERT INTO public.cliente(cedula, nombre, apellido)VALUES (?,?,?);");
		ps.setString(1,"1003854179");
		ps.setString(2,"Fernando");
		ps.setString(3,"Vinueza");
		ps.executeUpdate();
		System.out.println("Insercion Exitosa");
	} catch (ClassNotFoundException|SQLException e) {
		// TODO: handle exception
		System.err.println(e);
	}
}
}
