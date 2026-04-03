package com.krakedev.persistencia.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convertidor {
	private static final String FORMATO_FECHA = "yyyy/MM/dd";
	private static final String FORMATO_HORA = "hh:mm:ss";

	public static Date convertirFecha(String fecha) throws Exception {
		Date fechaUtil = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_FECHA);
			fechaUtil = sdf.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("No tiene el formato correcto");
		}
		return fechaUtil;
	}

	public static Date convertirHora(String fecha) throws Exception {
		Date horaUtil = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(FORMATO_HORA);
			horaUtil = sdf.parse(fecha);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new Exception("No tiene el formato correcto");
		}
		return horaUtil;
	}
}
