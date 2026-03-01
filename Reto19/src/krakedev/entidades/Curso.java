package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante1) {
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.getCedula().equalsIgnoreCase(estudiante1.getCedula())) {
				return "Encontrado";
			}
		}
		return null;
	}

	public void matricularEstudiante(Estudiante estudiante1) {
		boolean existe = false;
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.getCedula().equalsIgnoreCase(estudiante1.getCedula())) {
				existe = true;
				break;
			}
		}
		if (!existe) {
			estudiantes.add(estudiante1);
		}
	}

	public double calcularPromedioCurso() {
		double sumatoria = 0;
		for (Estudiante estudiante : estudiantes) {
			sumatoria += estudiante.calcularPromedioNotasEstudiante();
		}
		return sumatoria / estudiantes.size();
	}

	public void mostrar() {
		for (Estudiante estudiante : estudiantes) {
			estudiante.mostrar();
		}
	}
}
