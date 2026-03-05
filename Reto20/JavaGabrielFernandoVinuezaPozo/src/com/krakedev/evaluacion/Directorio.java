package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos,correctos,incorrectos;
	private Date fechaModificacion;

	public Directorio() {
		// TODO Auto-generated constructor stub
		this.contactos = new ArrayList<Contacto>();
		this.correctos=new ArrayList<Contacto>();
		this.incorrectos=new ArrayList<Contacto>();
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public void setCorrectos(ArrayList<Contacto> correcto) {
		this.correctos = correcto;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrecto) {
		this.incorrectos = incorrecto;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public boolean agregarContacto(Contacto contacto) {
		boolean existe = false;
		for (Contacto contacto1 : contactos) {
			if (contacto1.getCedula().equals(contacto.getCedula())) {
				existe = true;
				break;
			}
		}
		if (!existe) {
			contactos.add(contacto);
			fechaModificacion=new Date();
			
			return true;
		}
		return false;
	}

	public Contacto buscarPorCedula(String cedulaContacto) {
		Contacto s = null;
		for (Contacto contacto : contactos) {
			if (contacto.getCedula().equals(cedulaContacto))
				s = contacto;
		}
		return s;
	}
	public String consultarUltimaModificacion() {
		SimpleDateFormat formato= new SimpleDateFormat();
		formato.applyLocalizedPattern("yyyy/mm/dd HH:mm:ss");
		return formato.format(fechaModificacion);
	}
	public int contarPerdidos() {
		int total=0;
		for (Contacto contacto : contactos) {
			total+=(contacto.getDireccion()==null)?1:0;
		}
		return total;
	}
	public int contarFijos() {
		int total=0;
		for (Contacto contacto : contactos) {
			for (Telefono telefono : contacto.getTelefonos()) {
				total+=(telefono.getTipo().equals("Convencional")&&telefono.getEstado().equals("C"))?1:0;
			}
			
		}
		return total;
	}
	public void depurar() {
		for (Contacto contacto : contactos) {
			if(contacto.getDireccion()!=null) {
				correctos.add(contacto);
			}
			else {
				incorrectos.add(contacto);
			}
			
		}
		contactos.clear();
	}
}
