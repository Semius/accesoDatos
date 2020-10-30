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

	
	
	
	//leer texto plano
	
	
	
	
	
	
	
	
	
	
	
	//leerFichero
	
	@Override
	public ArrayList<Libro> leerFichero(String ruta) {
		
		
		File archivo = new File(ruta);
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		try {
			FileReader fr = new FileReader (archivo);
	        BufferedReader br = new BufferedReader(fr);
	        String linea;
	        
	        /*Libro l3 = new Libro(linea, linea, linea, linea, linea, null);*/
	        
	        /*arrayLibros.add(l3);*/
	        
	        
	        
	         while((linea=br.readLine())!=null) {
	        	 
	        	 /*System.out.println(linea);*/
	        	 /*System.out.println(x++);*/
	        	 
	        	 
	        	 ArrayList<String> array = new ArrayList<>(Arrays.asList(linea.split(";")));
	        	 String personajes= array.get(5);
	        	 ArrayList<String> arrayPersonajes = new ArrayList<>(Arrays.asList(personajes.split("-")));
	        	 /*System.out.println(arrayPersonajes.get(0));*/
	        	 ArrayList<Personajes> arrayP1 = new ArrayList<Personajes>();
	        	 
	        	 try {
	        		 int x=0;
	        		 while(x>-1) {
	        			 /*System.out.println("a");*/
	        			 Personajes p1= new Personajes(arrayPersonajes.get(x),null,arrayPersonajes.get(x));
			        	 
	        			 
	        			 /*System.out.println(p1);*/
			        	 arrayP1.add(p1);
	        			 x++;
	        		 }
		        	
		        	 
	        	 }
	        	 
	        	 catch (Exception e) {
	        		 
	        	 }
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 
	        	 /*System.out.println(arrayP1);*/
	        	 
	        	 
	        	 
	        	 int contador=arrayPersonajes.size();
	        	 /*while(contador!=-1) {
	        		 System.out.println(arrayP1(0));
	        		 contador--;
	        	 }*/
	             Libro l1 = new Libro(array.get(0), array.get(1), array.get(2), array.get(3), array.get(4), arrayP1);
	             arrayLibros.add(l1);
	        	 
	         }
	         
	            
		}
		catch(Exception e) {
	          e.printStackTrace();

		}
		

		return arrayLibros;
	}


	private char[] arrayP1(int i) {
		// TODO Auto-generated method stub
		return null;
	}


	private String arrayPersonajes(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	@Override
	public void guardarFichero(ArrayList<Libro> arrayLibros) {
		
		
		String ruta="C:\\Users\\PC33\\Desktop\\borrar";
		System.out.println("Fichero guardado");
		
		File archivo=new File("texto.txt");
		
		
		
		
		
		String textoLibro="";
		for (Libro s : arrayLibros) {
	         textoLibro= textoLibro + s.getTitulo()+ ";" +s.getEditorial()+";"+ s.getAutor() +";"+s.getFecha()+";"+s.getGenero()+";"+s.getPersonajes();
	      }
		
		try (PrintWriter out = new PrintWriter("C:\\Users\\PC33\\Desktop\\borrar//FicheroGuardado.txt")) {
		    out.println(textoLibro);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		System.out.println(textoLibro);
		
		
		
		
	}





}
