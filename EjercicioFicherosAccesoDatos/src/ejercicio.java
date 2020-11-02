import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Libro> lista = new ArrayList<Libro>();
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		ArrayList<String> personajes = new ArrayList<String>();

		System.out.print("Pulsa 1 para ficheros de texto"+ System.lineSeparator()+"Pulsa 2 para archivos XML"+System.lineSeparator());
		int x = sc.nextInt();
		String ruta="";
		
		boolean existe=true;
		existe=ProcesamientoFichero.existeFichero();
		/*System.out.println(existe);*/
		
		switch (x) {
		  case 1:
			  ruta="C:\\Users\\PC33\\Desktop\\borrar//ficheroplano.txt";
			  ArrayList<Personajes> arrayProtagonistas = new ArrayList<Personajes>();
			  
			  Personajes p1= new Personajes("Harry Potter", null, "PRICIPAL");
			  arrayProtagonistas.add(p1);
			  
			  Libro l1 = new Libro("Harry Potter", "Planeta", "J.K. Rowling", "01/10/1999", "Ciencia Ficción", arrayProtagonistas);
			  arrayLibros.add(l1);
		    
		    
			  ProcesoFicheroPlano proc= new ProcesoFicheroPlano();
			  lista= proc.leerFichero(ruta);
		    
		    
			  System.out.println("Pulsa 1 para leer los datos guardados en el archivo o 2 para añadir guardar los datos del array en un fichero");
			  x = sc.nextInt();
			  if(x==1) {
				  System.out.println((lista).get(1));
			  }
			  else {
				  proc.guardarFichero(arrayLibros);
			  }
		    
		    
			  break;
		  case 2:
			  ruta= "C:\\Users\\PC33\\Desktop\\borrar//ficheroxml.xml";
			  
		    
		    
		    
			  ProcesamientoFicherosXMLDOM procXML= new ProcesamientoFicherosXMLDOM();
			  lista=procXML.leerFichero(ruta);
			  
			  
			  
			  System.out.println("Pulsa 1 para leer los datos guardados en el archivo o 2 para añadir guardar los datos del array en un fichero");
			  x = sc.nextInt();
			  if(x==1) {
				  System.out.println(lista.get(0));
			  }
			  
			  else {
				  ArrayList<Personajes> arrayProtagonistas2 = new ArrayList<Personajes>();
				  Personajes p2= new Personajes("Harry Potter", "genero", "PRICIPAL");
				  Personajes p3= new Personajes("Protagonista2", "genero", "SECUNDARIO");
				  arrayProtagonistas2.add(p2);
				  arrayProtagonistas2.add(p3);
				  Libro l2 = new Libro("Harry Potter", "Planeta", "J.K. Rowling", "01/10/1999", "Ciencia Ficción", arrayProtagonistas2);
				  arrayLibros.add(l2);
				  
				  procXML.guardarFichero(arrayLibros);
			  }
			  
			  
			  
			  
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    break;
		  default:
		    System.out.println("Looking forward to the Weekend");
		}
		
		
		// TODO Auto-generated method stub
		/*String ruta="C:\\Users\\PC33\\Desktop\\borrar//ficheroplano.txt";
		ArrayList<Libro> lista = new ArrayList<Libro>();
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		
		
		ArrayList<String> personajes = new ArrayList<String>();
		personajes.add("Harry Potter");
		Libro l1 = new Libro("Harry Potter", "Planeta", "J.K. Rowling", "01/10/1999", "Ciencia Ficción", personajes);
		
		arrayLibros.add(l1);
		
		ProcesoFicheroPlano proc= new ProcesoFicheroPlano();
		lista= proc.leerFichero(ruta);
		
		
		
		
		proc.guardarFichero(arrayLibros);
		
		
		
		
		System.out.println((lista).get(0));		//imprime la lista
		
		*/
		
		
	}



}
