package krakedev.entidades;

public class Nota {
	private Materia materia;
	private double calificacion;

	public Nota(Materia materia, double calificacion) {
		super();
		this.materia = materia;
		this.calificacion = calificacion;
	}

	public Materia getMateria() {
		return materia;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public void mostrar() {
		if (materia != null)
			System.out.println("Nota[Materia[codigo= " + this.materia.getCodigo() + ",nombre= "
					+ this.materia.getNombre() + "],calificacion= " + this.calificacion);
		else {
			System.out.println("Nota[materia= " + this.materia + ",calificacion= " + this.calificacion);

		}
	}
	@Override
	public String toString() {
		String s="";
		if (materia != null)
			s+=("Nota[Materia[codigo= " + this.materia.getCodigo() + ",nombre= "
					+ this.materia.getNombre() + "],calificacion= " + this.calificacion+"]");
		else {
			s+=("Nota[materia= " + this.materia + ",calificacion= " + this.calificacion+"]");

		}
		return s;
	}
}
