import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.sun.xml.internal.ws.util.Pool.Unmarshaller;

public class ProcesamientoFicheroXMLJAXB extends ProcesamientoFichero {

	@Override
	public ArrayList<Libro> leerFichero(String ruta) {
		
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		//funciona mal, no lee más de un libro y no lee bien la lista de personajes. Me falta hacer un bucle
		try {
			JAXBContext jc = JAXBContext.newInstance(Libro.class);

	         javax.xml.bind.Unmarshaller unmarshaller = jc.createUnmarshaller();
	         File xml = new File(ruta);
	         Libro l1 = (Libro) unmarshaller.unmarshal(xml);

	         Marshaller marshaller = jc.createMarshaller();
	         marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
	         marshaller.marshal(l1, System.out);     
	         
	         arrayLibros.add(l1);
	         System.out.println(arrayLibros.get(0));
		}//try
		
		catch (Exception e) {
			e.printStackTrace();
		}
			
		
		
		return arrayLibros;
	}//leerFichero

	@Override
	public void guardarFichero(ArrayList<Libro> arrayLibros) {
			int x=0;
			
			while (x<arrayLibros.size()) { //el bucle se repite por cada objeto de tipo Libro que haya en el arrayList
				x++;        
				
		        Libro l1= arrayLibros.get(0);        
		        String archivo="C:\\Users\\PC33\\Desktop\\borrar//XMLJAXB.xml";
		        System.out.println ("Guardado");
		        l1.generarXML(archivo);
			}//while
		
	}//guardarFichero

}
