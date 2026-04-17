package com.krakedev.conexiionbbd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date ;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestFecha {
	private static final Logger LOGGER=LogManager.getLogger();
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
	LOGGER.info(fecha);
	//Se obtiene el valor long de la fecha
	long fechamilis=fecha.getTime();
	LOGGER.info(fechamilis);
	//llamamos a Date de sql y le pasamos el valor long para obtener la fecha
	fechaSQL=new java.sql.Date(fechamilis);
	LOGGER.info(fechaSQL);
	//llamamos Time de sql y le pasamos el valor long para obtener 
	//el tiempo en horas minutos y segundos
	 timeSQL=new Time(fechamilis);
	 LOGGER.info(timeSQL);
} catch (ParseException e) {
	e.printStackTrace();
}
	}

}
