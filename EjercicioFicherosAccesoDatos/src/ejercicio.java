/**
 * Clase para probar que todo funciona
 * IGNORARLA
 * @version 1 6/11/2020
 * @author Julián
 */
import java.util.ArrayList;
import java.util.Scanner;


//IGNORAR ESTO
public class ejercicio {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Libro> lista = new ArrayList<Libro>();
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		ArrayList<String> personajes = new ArrayList<String>();
		
		//creo un arraylist para probar y meto valores
		ArrayList<Personajes> arrayProtagonistas2 = new ArrayList<Personajes>();
		Personajes p2= new Personajes("Harry Potter", "genero", "PRICIPAL");
		Personajes p3= new Personajes("Protagonista2", "genero", "SECUNDARIO");
		arrayProtagonistas2.add(p2);
		arrayProtagonistas2.add(p3);
		Libro l2 = new Libro("Harry Potter", "Planeta", "J.K. Rowling", "01/10/1999", "Ciencia Ficción", arrayProtagonistas2);
		Libro l3 = new Libro("TITULO2", "PLANETA2", "sdfs", "01/10/1999", "sfdssfs", arrayProtagonistas2);
		arrayLibros.add(l2);
		arrayLibros.add(l3);
		
		
		System.out.print("Pulsa 1 para ficheros de texto"+ System.lineSeparator()+"Pulsa 2 para archivos XML con DOM"+System.lineSeparator()+"Pulsa 3 para archivos XML con JAXB"+System.lineSeparator()+"Pulsa 4 para Objetos"+System.lineSeparator()+"Pulsa 5 para archivos JSON"+System.lineSeparator());
		int x = sc.nextInt();
		String ruta="";
		
		boolean existe=true;
		/*existe=ProcesamientoFichero.borrarFichero(ruta);
		System.out.println(existe);*/
		
		switch (x) {
		  case 1:
			  ruta="C:\\Users\\PC33\\Desktop\\borrar//ficheroplano.txt";  
		    
			  ProcesoFicheroPlano proc= new ProcesoFicheroPlano();
			  lista= proc.leerFichero(ruta);
		    
		    
			  System.out.println("Pulsa 1 para leer los datos guardados en el archivo o 2 para añadir guardar los datos del array en un fichero");
			  x = sc.nextInt();
			  if(x==1) {
				  System.out.println((lista).get(0));
			  }
			  else {
				  proc.guardarFichero(arrayLibros);
			  }
		    
		    
			  break;
		  case 2:
			  ruta= "C:\\Users\\PC33\\Desktop\\borrar//ficheroxml.xml";
			  ProcesamientoFicherosXMLDOM procXML= new ProcesamientoFicherosXMLDOM();
			  lista=procXML.leerFichero(ruta);
			  
			  
			  
			  System.out.println("Pulsa 1 para leer los datos guardados en el archivo o 2 para guardar los datos del array en un fichero");
			  x = sc.nextInt();
			  if(x==1) {
				  System.out.println(lista.get(0));
			  }
			  
			  else {
				  
				  
				  procXML.guardarFichero(arrayLibros);
			  }
		    break;
		  case 3:
			  ruta="C:\\Users\\PC33\\Desktop\\borrar//XMLJAXB.xml";
			  ProcesamientoFicheroXMLJAXB procJAXB= new ProcesamientoFicheroXMLJAXB();
			  lista=procJAXB.leerFichero(ruta);
			  
			  
			  
			  System.out.println("Pulsa 1 para leer los datos guardados en el archivo o 2 para guardar los datos del array en un fichero");
			  x = sc.nextInt();
			  if(x==1) {
				  System.out.println(lista.get(0));
			  }
			  else {
				  
			  }
			  
			  procJAXB.guardarFichero(arrayLibros);
			  
			  break;
			  
			  
		  case 4:
			  
			  ProcesamientoFicherosObjetos procObj= new ProcesamientoFicherosObjetos();
			  
			  ruta="C:\\Users\\PC33\\Desktop\\borrar//objeto2.txt";
			  
			  //procObj.guardarFichero(arrayLibros);
			  lista=procObj.leerFichero(ruta);
			  System.out.println(lista.get(0));
			  break;
			  
		  case 5:
			  
			  ProcesamientoFicheroJSONHGSON procJSON= new ProcesamientoFicheroJSONHGSON();
			  ruta="C:\\Users\\PC33\\Desktop\\borrar//archivoJSON.json";
			  //procJSON.guardarFichero(arrayLibros);
			  lista=procJSON.leerFichero(ruta);
			  
			  break;
		  
		  
			  
		  case 6:
			  ProcesamientoFicherosSAX procSAX = new ProcesamientoFicherosSAX();
			  lista=procSAX.leerFichero(ruta);
			  
			  break;
		  	default:
		    System.out.println("Looking forward to the Weekend");
		}
		
		
	}



}
