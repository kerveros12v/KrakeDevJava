package com.krakedev.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger();

	public static void insertar(Persona persona) {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"INSERT INTO public.persona(cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos,estado_civil)VALUES (?,?,?,?,?,?,?,?,?);");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setDouble(4, persona.getEstatura());
			ps.setDate(5, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(6, new Time(persona.getHora_nacimiento().getTime()));
			ps.setBigDecimal(7, (BigDecimal) persona.getCantidad_ahorrada());
			ps.setInt(8, persona.getNumero_hijos());
			ps.setString(9, persona.getEstado().getCodigo());
			ps.executeUpdate();
			LOGGER.info("insertar....OK");
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void actualizar(Persona persona) {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement(
					"UPDATE public.persona	SET  nombre=?, apellido=?, estatura=?, fecha_nacimiento=?, hora_nacimiento=?, cantidad_ahorrada=?, numero_hijos=?, estado_civil=? WHERE cedula=?;");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setDouble(3, persona.getEstatura());
			ps.setDate(4, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(5, new Time(persona.getHora_nacimiento().getTime()));
			ps.setBigDecimal(6, (BigDecimal) persona.getCantidad_ahorrada());
			ps.setInt(7, persona.getNumero_hijos());
			ps.setString(8, persona.getEstado().getCodigo());
			ps.setString(9, persona.getCedula());
			ps.executeUpdate();
			LOGGER.info("actualizacion....OK");
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
	public static void eliminar(Persona persona) {
		Connection con = null;
		PreparedStatement ps;
		try {
			con = ConexionBDD.conectar();
			ps = con.prepareStatement("DELETE FROM public.persona WHERE cedula=?;");
			ps.setString(1, persona.getCedula());
			ps.executeUpdate();
			LOGGER.info("actualizacion....OK");
		} catch (Exception e) {
			// TODO: handle exception
			LOGGER.error(e.getMessage());
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
