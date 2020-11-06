import java.util.ArrayList;


public interface IProcesamientoFichero { 
	 
	 
	 //MÉTODOS
	/**
	 * lee un archivo y devuelve un arraylist de tipo libro con sus elementos
	 * @param ruta del archivo que se quiere leer
	 * @return devuelve un arrayList con los objetos de tipo libro que haya en el archivo
	 */
	public ArrayList<Libro> leerFichero(String ruta); //RECIBE UNA RUTA Y DEVUELVE UN ARRAYLIST DE LIBROS
	
	/**
	 * Recibe un arrayList con elementos de tipo Libro y los guarda en un fichero
	 * @param arrayLibros arrayLista con elementos de tipo Libro
	 */
	
	public void guardarFichero( ArrayList<Libro> arrayLibros);	//RECIBE UN ARRAYLIST DE LIBROS Y LO GUARDA

	
	
}
