import java.io.File;

public abstract class ProcesamientoFichero implements IProcesamientoFichero {
	
	
	//comprueba si en la ruta que se le envia hay un fichero
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
	 
	 
	 //recibe una ruta de un fichero y la intenta borrar
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
