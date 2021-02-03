package modelo.entidades;
// Generated 3 feb. 2021 9:55:59 by Hibernate Tools 5.2.12.Final

import java.util.Date;

/**
 * Prestamo generated by hbm2java
 */
public class Prestamo implements java.io.Serializable {

	private int idPrestamo;
	private Ejemplar ejemplar;
	private Usuario usuario;
	private Date fechaPrestamo;
	private Date fechaDevolucion;

	public Prestamo() {
	}

	public Prestamo(int idPrestamo, Ejemplar ejemplar, Usuario usuario, Date fechaPrestamo, Date fechaDevolucion) {
		this.idPrestamo = idPrestamo;
		this.ejemplar = ejemplar;
		this.usuario = usuario;
		this.fechaPrestamo = fechaPrestamo;
		this.fechaDevolucion = fechaDevolucion;
	}

	public int getIdPrestamo() {
		return this.idPrestamo;
	}

	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}

	public Ejemplar getEjemplar() {
		return this.ejemplar;
	}

	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFechaPrestamo() {
		return this.fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}

	public Date getFechaDevolucion() {
		return this.fechaDevolucion;
	}

	public void setFechaDevolucion(Date fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}

}