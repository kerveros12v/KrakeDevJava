package com.krakedev.conexiionbbd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class Reto32 {
	
	public static java.sql.Date fechaSQL(String fecha){
		java.sql.Date retorno=null;
		try {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");			
			Date fechaUtil=  sdf.parse(fecha);
			long fechamilis=fechaUtil.getTime();
			retorno=new java.sql.Date(fechamilis);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retorno;
	}
	public static Time tiempo(String tiempoStr) {
		 
		 Time timeSQL=null;
			try {
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm:ss");			
				Date fechaUtil=  sdf.parse(tiempoStr);
				long fechamilis=fechaUtil.getTime();
				timeSQL=new Time(fechamilis);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return timeSQL;
	}
	public static void insertarBDDpersona(Connection connection,Object[]datos) {
		PreparedStatement ps=null;
		try {
			ps=connection.prepareStatement("INSERT INTO public.persona(cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos)VALUES (?,?,?,?,?,?,?,?);");
			ps.setString(1,(String)datos[0]);
			ps.setString(2,(String)datos[1]);
			ps.setString(3,(String)datos[2]);
			ps.setDouble(4,(double)datos[3]);
			ps.setDate(5,(java.sql.Date)datos[4]);
			ps.setTime(6,(Time)datos[5]);
			ps.setBigDecimal(7,(BigDecimal)datos[6]);
			ps.setInt(8,(int)datos[7]);
			ps.executeUpdate();
			System.out.println("Persona--->Registro Exitoso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	public static void insertarBDDprestamo(Connection connection,Object[]datos) {
		PreparedStatement ps=null;
		try {
			ps=connection.prepareStatement("INSERT INTO public.prestamo(cedula, monto, fecha_prestamo, hora_prestamo, garante) VALUES (?, ?, ?, ?, ?);");
			ps.setString(1,(String)datos[0]);
			ps.setBigDecimal(2,(BigDecimal)datos[1]);
			ps.setDate(3,(java.sql.Date)datos[2]);
			ps.setTime(4,(Time)datos[3]);
			ps.setString(5,(String)datos[4]);
			ps.executeUpdate();
			System.out.println("Prestamo--->Registro Exitoso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
public static void main(String[] args) {
	
	try {
		Connection connection=null;
		
		Class.forName("org.postgresql.Driver");
		connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Krakedev4","postgres","postgres");
		System.out.println("Conexion exitosa");
		Object[] dato= {"1003854189","Sean","Alban"	,1.50	,fechaSQL("1990/12/14"),tiempo("08:00:00"),new BigDecimal(100.00),3};
		Object[] dato1= {"0946146775","Esteban","Espinoza"	,1.80,	fechaSQL("1989/10/01"),tiempo("07:00:00"),new BigDecimal(100.00),	2};
		insertarBDDpersona(connection, dato);
		insertarBDDpersona(connection, dato1);
		Object []dato2= {"1003854189", new BigDecimal(400),fechaSQL( "2026/12/01"),tiempo("08:50:00"), "Fernando Vinueza"};
		Object []dato3= {"0946146775", new BigDecimal(600), fechaSQL("2026/02/01"),tiempo("16:00:00"), "Esteban Espinoza"};
		insertarBDDprestamo(connection, dato2);
		insertarBDDprestamo(connection, dato3);
		connection.close();
		
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
