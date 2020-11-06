/**
 * Una clase para guardar y representar los elementos de Personajes
 * Esta clase se usa en la clase Libro también
 * @version 1 6/11/2020
 * @author Julián
 */
import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="personaje")

public class Personajes extends Marshal implements Serializable {
	private String nombre;
	private String generoPersonaje;
	private String importancia;
	
	//constructores
	public Personajes (String nombre, String generoPersonaje, String importancia) {
			
			this.nombre = nombre;
			this.generoPersonaje = generoPersonaje;
			this.importancia = importancia;
			
		}
	public Personajes () {
		
	}

	
	
	//get
		public String getNombre () { 
			return nombre; }
		public String getGeneroPersonaje () { 
			return generoPersonaje; }
		public String getImportancia () { 
			return importancia; }
	
	//set
		@XmlElement
		public void setNombre(String nombre) {
		    this.nombre = nombre;
		  }
		@XmlElement
		public void setGeneroPersonaje(String generoPersonaje) {
		    this.generoPersonaje = generoPersonaje;
		  }
		@XmlElement
		public void setImportancia(String importancia) {
		    this.importancia = importancia;
		  }
		
		
		//toString
		@Override
		public String toString() {
			return 
				"Nombre:"+this.getNombre() + " Genero:" +this.getGeneroPersonaje() +  " Importancia:"+this.getImportancia() ;
			
		}
}
