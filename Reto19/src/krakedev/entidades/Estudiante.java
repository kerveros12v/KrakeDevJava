package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String  cedula,nombre, apellido;
	private ArrayList<Nota> notas;
	public Estudiante(String cedula, String nombre, String apellido) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		notas=new ArrayList<Nota>();
	}
	
	public String getNombre() {
		return nombre;
	}

	

	public String getApellido() {
		return apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void agregarNota(Nota nota) {
		boolean existe = false;
		for (Nota nota2 : notas) {
			if (nota2.getMateria() != null && nota.getMateria() != null) {
				if (nota2.getMateria().getCodigo() == nota.getMateria().getCodigo())
					existe = true;
			}
		}
		if (existe == false) {
			if (nota.getCalificacion() >= 0 && nota.getCalificacion() <= 10) {
				notas.add(nota);
			}
		}
	}

	public void modificarNota(String codigo, double nuevaCalificacion) {

		for (Nota nota : notas) {
			if (nota.getMateria() != null) {
				if (nota.getMateria().getCodigo().equalsIgnoreCase(codigo))
					if (nota.getCalificacion() >= 0 && nota.getCalificacion() <= 10) {
						nota.setCalificacion(nuevaCalificacion);
						break;
					}
			}
		}

	}

	public double calcularPromedioNotasEstudiante() {
		double promedio = 0, sumatoria = 0;
		for (Nota nota : notas) {
			sumatoria += nota.getCalificacion();
		}
		promedio = sumatoria / notas.size();
		return promedio;
	}

	public void mostrar() {
		
				System.out.println(this.toString());
	}
	@Override
	public String toString() {
		String salida = "";
		salida += "Estudiante[Cedula= " + this.cedula + " ,Apellido= " + this.apellido + " ,Nombre= " + this.nombre;
		for (Nota nota : notas) {
			salida+=nota.toString()+",";
		}
		
				salida+= "]";
				return (salida);
	}
}
