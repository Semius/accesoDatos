import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Properties;

import com.google.gson.*;

public class ProcesamientoFicheroJSONHGSON extends ProcesamientoFichero {

	
	@Override
	public ArrayList<Libro> leerFichero(String ruta) {
		
		//NO FUNCIONA BIEN, ME FALTA ACABARLO
		Gson gson = new Gson();
		
		String fichero = "";
		 
		try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
		    String linea;
		    while ((linea = br.readLine()) != null) {
		        fichero += linea;
		    }
		 
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(fichero);
		Properties properties = gson.fromJson(fichero, Properties.class);
		System.out.println(properties.get("titulo"));
		
		return null;
	}

	
	
	

	
	
	@Override
	public void guardarFichero(ArrayList<Libro> arrayLibros) {
		
		
		System.out.println("Archivo guardado");
		Gson gson = new Gson();
		//paso el array a String con formato JSON
		String json = gson.toJson(arrayLibros);
		System.out.println(json);
		
		//guardo el String con gson
		try (Writer writer = new FileWriter("C:\\Users\\PC33\\Desktop\\borrar//Output.json")) {
			Gson gson2 = new GsonBuilder().create();
			gson2.toJson(json, writer);
		}
		catch (Exception e) {
			
		}
		
	}//arrayLibros

}
