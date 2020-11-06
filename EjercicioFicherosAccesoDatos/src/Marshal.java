import java.io.File;
import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;


//Clase para llamarse desde ProcesaminentoFicheroXMLJAXB en el metodo guardarFichero

public class Marshal {
	public void generarXML (String archivo) {
		 
        try {
            /*File file = new File (archivo);*/
            JAXBContext contexto = JAXBContext.newInstance(this.getClass());
            Marshaller jaxbMarshaller = contexto.createMarshaller();
 
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
 
            jaxbMarshaller.marshal(this, new FileWriter(archivo, true));
 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//generarXML
}
