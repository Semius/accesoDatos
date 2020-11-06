import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class prueba4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ArrayList<Libro> lista = new ArrayList<Libro>();
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		ArrayList<String> personajes = new ArrayList<String>();
		
		//creo un arraylist y meto un libro con 2 personajes
		ArrayList<Personajes> arrayProtagonistas2 = new ArrayList<Personajes>();
		Personajes p2= new Personajes("Harry Potter", "genero", "PRICIPAL");
		Personajes p3= new Personajes("Protagonista2", "genero", "SECUNDARIO");
		arrayProtagonistas2.add(p2);
		arrayProtagonistas2.add(p3);
		Libro l2 = new Libro("Harry Potter", "Planeta", "J.K. Rowling", "01/10/1999", "Ciencia Ficción", arrayProtagonistas2);
		arrayLibros.add(l2);
		
		
		
		
				
	}

}
