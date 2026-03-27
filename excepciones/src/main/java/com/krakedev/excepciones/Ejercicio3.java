package com.krakedev.excepciones;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {
private static final Logger LOGGER=LogManager.getLogger(Ejercicio3.class);
public static void metodo1() {
	String f=null;
	try {
		f.substring(0);
	} catch (Exception e) {
		LOGGER.error("ERROR al obtener la subcadena",e);
	}
}
public static void main(String[] args) {
	metodo1();
}
}
