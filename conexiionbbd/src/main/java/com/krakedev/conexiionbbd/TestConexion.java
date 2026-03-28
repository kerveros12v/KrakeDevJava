package com.krakedev.conexiionbbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexion {
public static void main(String[] args) {
	Connection connection=null;
	PreparedStatement ps=null;
	
	try {
		Class.forName("org.postgresql.Driver");
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Krakedev4","postgres","postgres");
		System.out.println("Conexion exitosa");
		
		//Procesamiento de la fecha
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaStr="1990/12/10 06:15:00";
		Time timeSQL = null;
		java.sql.Date fechaSQL = null;
		try {
			System.out.println("ingreso al tryCatch");
			//Se transforma a Date la fecha formateada
			Date fecha=  sdf.parse(fechaStr);
			System.out.println(fecha);
			//Se obtiene el valor long de la fecha
			long fechamilis=fecha.getTime();
			System.out.println(fechamilis);
			//llamamos a Date de sql y le pasamos el valor long para obtener la fecha
			 fechaSQL=new java.sql.Date(fechamilis);
			System.out.println(fechaSQL);
			//llamamos Time de sql y le pasamos el valor long para obtener 
			//el tiempo en horas minutos y segundos
			 timeSQL=new Time(fechamilis);
			System.out.println(timeSQL);	
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		////
				
		ps=connection.prepareStatement("INSERT INTO public.empleado(codigo_empleado, nombre, fecha, hora) VALUES (?,?,?,?);");
		ps.setInt(1,1);
		ps.setString(2,"Fernando Vinueza");
		ps.setDate(3,fechaSQL);
		ps.setTime(4,timeSQL);
		ps.executeUpdate();
		System.out.println("Insercion Exitosa");

	} catch (ClassNotFoundException|SQLException e) {
		// TODO: handle exception
		System.err.println(e);
	}
}

}
