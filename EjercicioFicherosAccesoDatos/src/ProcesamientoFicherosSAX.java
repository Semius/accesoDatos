import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

//ejercicio opcional
public class ProcesamientoFicherosSAX extends ProcesamientoFichero {
	
  
	//NO LO ACABE
	@Override
	public ArrayList<Libro> leerFichero(String ruta) {
		
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
		    SAXParser saxParser = factory.newSAXParser();

		    saxParser.parse(new File("C:\\Users\\PC33\\Desktop\\borrar.ficheroxml.xml"),
		    		new LeerSax()
		    		);
		}
		catch (Exception e) {
			
		}
		return null;
	}

	@Override
	public void guardarFichero(ArrayList<Libro> arrayLibros) {
		// NO		
	}
}
