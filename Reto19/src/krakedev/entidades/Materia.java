package krakedev.entidades;

public class Materia {
private String codigo,nombre;

public Materia(String codigo, String nombre) {
	super();
	this.codigo = codigo;
	this.nombre = nombre;
}

public String getCodigo() {
	return codigo;
}

public String getNombre() {
	return nombre;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

}
