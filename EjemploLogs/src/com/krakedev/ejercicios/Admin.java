package com.krakedev.ejercicios;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger logger = LogManager.getLogger(Admin.class);

	public void agregar() {
		logger.info("mensaje info");
		logger.warn("mensaje warn");
		logger.trace("mensaje trace");
		logger.error("mensaje error");
		logger.debug("mensaje debug");
		
	}
}
