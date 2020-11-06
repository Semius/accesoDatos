import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ProcesoFicheroPlano extends ProcesamientoFichero  {

	
	
	//leerFichero
	
	@Override
	public ArrayList<Libro> leerFichero(String ruta) {
		
		//EL FICHERO TIENE QUE ESTAR CORRECTAMENTE ORDENADO
		File archivo = new File(ruta);
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		try {
			FileReader fr = new FileReader (archivo);
	        BufferedReader br = new BufferedReader(fr);
	        String linea;	        
	        
	        
	         while((linea=br.readLine())!=null) { //el bucle sigue mientras haya lineas que leer

	        	 ArrayList<String> array = new ArrayList<>(Arrays.asList(linea.split(";")));
	        	 String personajes= array.get(5);
	        	 ArrayList<String> arrayPersonajesJunto = new ArrayList<>(Arrays.asList(personajes.split("-")));
	        	 
	        	 int y=0;
	        	 ArrayList<Personajes> arrayP1 = new ArrayList<Personajes>();
	        	 while (y<arrayPersonajesJunto.size()) {
	        		 //System.out.println(arrayPersonajesJunto.get(0));
	        		 String personajes2= arrayPersonajesJunto.get(y);
	        		 
	        		 ArrayList<String> arrayPersonajes = new ArrayList<>(Arrays.asList(personajes2.split(",")));
 
		        	 try {	//el try se acaba en el momento en el que no encuentra más personajes
		        		 int x=0;
		        		 
		        		 int contadorNombre=0;
	        			 int contadorGenero=1;
	        			 int contadorImportancia=2;
		        		 while(x>-1) {
				        	 Personajes p1 = new Personajes(arrayPersonajes.get(contadorNombre),arrayPersonajes.get(contadorGenero),arrayPersonajes.get(contadorImportancia));
		        			 
		        			 contadorNombre=contadorNombre+3;
		        			 contadorGenero=contadorGenero+3;
		        			 contadorImportancia=contadorImportancia+3;

				        	 arrayP1.add(p1);
		        			 x++;
		        		 }
		        	 }//try
		        	 
		        	 catch (Exception e) { 
		        	 } 
	        		 y++;
	        	 }//while

	             Libro l1 = new Libro(array.get(0), array.get(1), array.get(2), array.get(3), array.get(4), arrayP1);
	             arrayLibros.add(l1);        	 
	         }
		}//try
		catch(Exception e) {
	          e.printStackTrace();

		}
		

		return arrayLibros;
	}//leerFichero


	@Override
	public void guardarFichero(ArrayList<Libro> arrayLibros) {
		
		
		System.out.println("Fichero guardado");
		

		String textoLibro="";
		for (Libro s : arrayLibros) { //el bucle se repite por cada elemento del arrayLibros. Une cada elemento en un String
	         textoLibro= textoLibro + s.getTitulo()+ ";" +s.getEditorial()+";"+ s.getAutor() +";"+s.getFecha()+";"+s.getGenero()+";"+s.getPersonajes();
	      }//for
		
		//guarda el archivo
		try (PrintWriter out = new PrintWriter("C:\\Users\\PC33\\Desktop\\borrar//FicheroGuardado.txt")) {
		    out.println(textoLibro);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}


	}//arrayLibros
}
