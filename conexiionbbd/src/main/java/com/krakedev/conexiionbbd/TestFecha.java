package com.krakedev.conexiionbbd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date ;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Se da el formato de la fecha y hora
SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
String fechaStr="2020/03/22 10:05:04";
Time timeSQL;
java.sql.Date fechaSQL;
try {
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
	}

}
