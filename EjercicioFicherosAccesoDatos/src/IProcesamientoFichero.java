import java.util.ArrayList;


public interface IProcesamientoFichero { 
	 
	 
	 //M�TODOS
	
	public ArrayList<Libro> leerFichero(String ruta); //RECIBE UNA RUTA Y DEVUELVE UN ARRAYLIST DE LIBROS
	
	public void guardarFichero( ArrayList<Libro> arrayLibros);	//RECIBE UN ARRAYLIST DE LIBROS Y LO GUARDA

	
	
}
