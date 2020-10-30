import java.util.ArrayList;

public class Libro {
	
	
	private String titulo;
	private String editorial;
	private String autor;
	private String fecha;
	private String genero;
	private ArrayList<Personajes> personajes;
	
	
	
	
	//constructor
	public Libro (String titulo, String editorial, String autor, String fecha, String genero, ArrayList<Personajes> arrayProtagonistas) {

	        this.titulo = titulo;
	        this.editorial = editorial;
	        this.autor = autor;
	        this.fecha = fecha;
	        this.genero = genero;
	        this.personajes = arrayProtagonistas;
	    } //Cierre del constructor
	
	
	
	
	//métodos
	
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
	public ArrayList<Personajes> getPersonajes () { 
		return personajes; }

	
	
	//set
	public void setTitulo(String titulo) {
	    this.titulo = titulo;
	  }
	public void setEditorial(String editorial) {
	    this.editorial = editorial;
	  }
	public void setAutor(String autor) {
	    this.autor = autor;
	  }
	public void setGenero(String genero) {
	    this.genero = genero;
	  }
	public void setPersonajes(ArrayList<Personajes> personajes) {
	    this.personajes = personajes;
	  }
	

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Titulo: "+this.getTitulo() + " Editorial:" +this.getEditorial() +  " Autor:"+this.getAutor() 
		+ " Fecha:"+this.getFecha() +  " Genero:"+this.getGenero() + " \nPersonajes: "+this.getPersonajes();
		
	}
	
	
	
	
}
