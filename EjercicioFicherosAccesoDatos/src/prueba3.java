import java.io.File;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.PropertyException;


public class prueba3 {

	public static void main(String[] args) {
		
		
		String ruta="C:\\Users\\PC33\\Desktop\\borrar//JAXB";
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		ArrayList<Personajes> arrayProtagonistas2 = new ArrayList<Personajes>();
		Personajes p2= new Personajes("Harry Potter", "genero", "PRICIPAL");
		Personajes p3= new Personajes("Protagonista2", "genero", "SECUNDARIO");
		arrayProtagonistas2.add(p2);
		arrayProtagonistas2.add(p3);
		Libro l2 = new Libro("Harry Potter", "Planeta", "J.K. Rowling", "01/10/1999", "Ciencia Ficción", arrayProtagonistas2);
		Libro l1 = new Libro("Libro2", "aaaa", "fdsfsd", "01/10/1999", "Ciencia", arrayProtagonistas2);
		arrayLibros.add(l2);
		arrayLibros.add(l1);
				
		
		
		
		
		try {
            File file= new File(ruta);
            JAXBContext contexto = JAXBContext.newInstance(
                    l1.getClass() );
                Marshaller marshaller = contexto.createMarshaller();
                marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,
                    Boolean.TRUE);
                marshaller.marshal(l1, file);
        } catch (PropertyException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (JAXBException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
			
			
			
	}
		
		
		
}


