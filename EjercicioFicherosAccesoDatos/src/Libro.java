/**
 * Una clase para guardar y representar los elementos de Libro
 * @version 1 6/11/2020
 * @author Julián
 */


import java.io.Serializable;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author FP
 *
 */
@XmlRootElement (name="Libro")
public class Libro extends Marshal implements Serializable {
	
	
	private String titulo;
	private String editorial;
	private String autor;
	private String fecha;
	private String genero;
	private ArrayList<Personajes> personajes;
	
	
	
	/**
	 * @param titulo titulo del libro
	 * @param editorial editorial del libro
	 * @param autor autor del libro
	 * @param fecha	fecha de publicación
	 * @param genero genero del libro
	 * @param arrayProtagonistas ArrayList de los personajes del libro, contiene su nombre,genero y importancia
	 */
	//constructor
	public Libro (String titulo, String editorial, String autor, String fecha, String genero, ArrayList<Personajes> arrayProtagonistas) {

	        this.titulo = titulo;
	        this.editorial = editorial;
	        this.autor = autor;
	        this.fecha = fecha;
	        this.genero = genero;
	        this.personajes = arrayProtagonistas;
	    } //Cierre del constructor
	
	public Libro () {
		
	}
	
	
	//get
	public String getTitulo () { 
		return titulo; }
	
	public String getEditorial () {
		return editorial; }
	
	public String getAutor () { 
		return autor; }
	
	public String getFecha() {
		return fecha;
	}
	public String getGenero () { 
		return genero; }
	
	
	@XmlElementWrapper(name = "listaPersonajes")
	public ArrayList<Personajes> getPersonajes () { 
		return personajes; }

	
	
	//set
	@XmlElement
	public void setTitulo(String titulo) {
	    this.titulo = titulo;
	  }
	@XmlElement
	public void setEditorial(String editorial) {
	    this.editorial = editorial;
	  }
	@XmlElement
	public void setAutor(String autor) {
	    this.autor = autor;
	  }
	@XmlElement
	public void setGenero(String genero) {
	    this.genero = genero;
	  }
	@XmlElement
	public void setPersonajes(ArrayList<Personajes> personajes) {
	    this.personajes = personajes;
	  }
	

	//toString
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titulo: "+this.getTitulo() + " Editorial:" +this.getEditorial() +  " Autor:"+this.getAutor() 
		+ " Fecha:"+this.getFecha() +  " Genero:"+this.getGenero() + " \nPersonajes: "+this.getPersonajes();
		
	}
	
	
}
