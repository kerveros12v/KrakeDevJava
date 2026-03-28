package com.krakedev.persistencia.entidades;

public class EstadoCivil {
private String codigo,detalle;

public EstadoCivil() {
	super();
}

public EstadoCivil(String codigo, String detalle) {
	super();
	this.codigo = codigo;
	this.detalle = detalle;
}

public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

public String getDetalle() {
	return detalle;
}

public void setDetalle(String detalle) {
	this.detalle = detalle;
}

@Override
public String toString() {
	return "EstadoCivil [codigo=" + codigo + ", detalle=" + detalle + "]";
}

}
