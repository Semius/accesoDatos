package modelo.entidades;
// Generated 3 feb. 2021 9:55:59 by Hibernate Tools 5.2.12.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Ejemplar generated by hbm2java
 */
public class Ejemplar implements java.io.Serializable {

	private int idEjemplar;
	private Libro libro;
	private String numEjemplar;
	private String estado;
	private Set prestamos = new HashSet(0);

	public Ejemplar() {
	}

	public Ejemplar(int idEjemplar, Libro libro, String numEjemplar, String estado) {
		this.idEjemplar = idEjemplar;
		this.libro = libro;
		this.numEjemplar = numEjemplar;
		this.estado = estado;
	}

	public Ejemplar(int idEjemplar, Libro libro, String numEjemplar, String estado, Set prestamos) {
		this.idEjemplar = idEjemplar;
		this.libro = libro;
		this.numEjemplar = numEjemplar;
		this.estado = estado;
		this.prestamos = prestamos;
	}

	public int getIdEjemplar() {
		return this.idEjemplar;
	}

	public void setIdEjemplar(int idEjemplar) {
		this.idEjemplar = idEjemplar;
	}

	public Libro getLibro() {
		return this.libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getNumEjemplar() {
		return this.numEjemplar;
	}

	public void setNumEjemplar(String numEjemplar) {
		this.numEjemplar = numEjemplar;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Set getPrestamos() {
		return this.prestamos;
	}

	public void setPrestamos(Set prestamos) {
		this.prestamos = prestamos;
	}

}
