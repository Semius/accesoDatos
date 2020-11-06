import java.io.File;

public abstract class ProcesamientoFichero implements IProcesamientoFichero {
	
	
	/**
	 * Comprueba si un archivo existe y devuelve con booleano, true si existe y false si no existe
	 * @param ruta del archivo que se quiere comprobar si existe
	 * @return un boleano true si el archivo existe o false si no existe
	 */
	 public static boolean existeFichero(String ruta) {
		 boolean x = true;
		 
		 File archivo = new File(ruta);
		 if (archivo.exists()) {
			    if (archivo.isFile()) System.out.println("Es un archivo");
			    if (archivo.isDirectory()) x=false; //la ruta es un directorio
			}
			else {
				x=false;
				//no existe el archivo
				
			}
		 
		 
		 return x;
	 }
	 
	 
	 /**
	  * borra un archivo y devuelve un booleano true si puede o false si no puede borrarlo
	  * @param ruta del archivo que se quiere borrar
	  * @return un booleano true si el archivo se puede borrar o false si no se puede
	  */
	 public static boolean borrarFichero(String ruta) {
		 boolean x = true;
		 
		 File fichero = new File(ruta);

		 if (fichero.delete())
			   x=true;
			else
			   x=false;
		 
		 return x;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
