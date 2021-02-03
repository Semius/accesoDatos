package modelo.entidades;
// Generated 3 feb. 2021 9:55:59 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Libro generated by hbm2java
 */
public class Libro implements java.io.Serializable {

	private String codLibro;
	private String titulo;
	private String editorial;
	private float precio;
	private Set autorlibros = new HashSet(0);
	private Set ejemplars = new HashSet(0);

	public Libro() {
	}

	public Libro(String codLibro, String titulo, String editorial, float precio) {
		this.codLibro = codLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.precio = precio;
	}

	public Libro(String codLibro, String titulo, String editorial, float precio, Set autorlibros, Set ejemplars) {
		this.codLibro = codLibro;
		this.titulo = titulo;
		this.editorial = editorial;
		this.precio = precio;
		this.autorlibros = autorlibros;
		this.ejemplars = ejemplars;
	}

	public String getCodLibro() {
		return this.codLibro;
	}

	public void setCodLibro(String codLibro) {
		this.codLibro = codLibro;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return this.editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public Set getAutorlibros() {
		return this.autorlibros;
	}

	public void setAutorlibros(Set autorlibros) {
		this.autorlibros = autorlibros;
	}

	public Set getEjemplars() {
		return this.ejemplars;
	}

	public void setEjemplars(Set ejemplars) {
		this.ejemplars = ejemplars;
	}

}