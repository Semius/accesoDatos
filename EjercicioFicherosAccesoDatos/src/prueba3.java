import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class prueba3 {

	public static void main(String[] args) {
		
		
		String ruta="C:\\Users\\PC33\\Desktop\\borrar//ProcesamientoXML.xml";
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
				
		
		
		
		
		String titulo="";
		String editorial="";
		String autor="";
		String fecha="";
		String genero="";
		
	    ArrayList<Personajes> arrayProtagonistas = new ArrayList<Personajes>();
		String personaje="";
		String generoPersonaje="";
		String importancia="";
		
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		    DocumentBuilder builder = factory.newDocumentBuilder();
		    DOMImplementation implementation = builder.getDOMImplementation();
		    Document document = implementation.createDocument(null, "ListaLibros", null); //se crea la lista principal
		    document.setXmlVersion("1.0");
				
		
		    Element raiz = document.getDocumentElement();
		    
			for (Libro s : arrayLibros) {
				titulo=s.getTitulo();
				System.out.println(titulo);
		        editorial=s.getEditorial();
		        autor= s.getAutor();
		        fecha=s.getFecha();
		        genero=s.getGenero();
		        arrayProtagonistas=s.getPersonajes();
		        System.out.println(arrayProtagonistas);
		 
		        
		        
				
				
				
					
					
		        //Item Node LIBRO
		        Element itemNode = document.createElement("Libro");
	            //Key Node
	            Element keyNode = document.createElement("Titulo"); 
	            Text nodeKeyValue = document.createTextNode(titulo);
	            keyNode.appendChild(nodeKeyValue);
	
	            
	            
	            //Editorial
	            Element keyNode2 = document.createElement("Editorial"); 
	            Text nodeKeyValue2 = document.createTextNode(editorial);
	            keyNode2.appendChild(nodeKeyValue2);
	            
	            //Autor
	            
	            Element keyNode3 = document.createElement("Autor"); 
	            Text nodeKeyValue3 = document.createTextNode(autor);
	            keyNode3.appendChild(nodeKeyValue3);
	            
	            //Autor
	            
	            Element keyNode4 = document.createElement("Fecha"); 
	            Text nodeKeyValue4 = document.createTextNode(fecha);
	            keyNode4.appendChild(nodeKeyValue4);
	            
	            //Autor
	            
	            Element keyNode5 = document.createElement("Genero"); 
	            Text nodeKeyValue5 = document.createTextNode(genero);
	            keyNode5.appendChild(nodeKeyValue5);
	            
	
	            
	            
	            
	            //append keyNode and valueNode to itemNode
	            itemNode.appendChild(keyNode);
	            itemNode.appendChild(keyNode2);
	            itemNode.appendChild(keyNode3);
	            itemNode.appendChild(keyNode4);
	            itemNode.appendChild(keyNode5);
	            
	            for (Personajes p: arrayProtagonistas) {
	            	System.out.println("personaje");
	            	
	            	
	            	String nombreP=p.getNombre();
	            	System.out.println(p.getNombre());
	            	String generoP=p.getGeneroPersonaje();
	            	String importanciaP=p.getImportancia();
	            	
	            	Element personajesKey = document.createElement("Personajes");
	            	
	            	//nombre
	            	Element keyNode6 = document.createElement("Nombre"); 
		            Text nodeKeyValue6 = document.createTextNode(nombreP);
		            keyNode6.appendChild(nodeKeyValue6);
		            
		            
		            //genero
		            Element keyNode7 = document.createElement("Genero"); 
		            Text nodeKeyValue7 = document.createTextNode(generoP);
		            keyNode7.appendChild(nodeKeyValue7);
		            
		            //importancia
		            Element keyNode8 = document.createElement("Importancia"); 
		            Text nodeKeyValue8 = document.createTextNode(importanciaP);
		            keyNode8.appendChild(nodeKeyValue8);
		            
		            
		            
		            personajesKey.appendChild(keyNode6);
		            personajesKey.appendChild(keyNode7);
		            personajesKey.appendChild(keyNode8);
		            
		            
		            
		            
		            
		            
		            itemNode.appendChild(personajesKey);
	            }
	            
	            //append itemNode to raiz
	            raiz.appendChild(itemNode); //pegamos el elemento a la raiz "Documento"
	           
	            
			}//for
			
			//Generar XML
            Source source = new DOMSource(document);
            //Indicamos donde lo queremos almacenar
            Result result = new StreamResult(new java.io.File(ruta)); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
			
			}//try
		
			
			catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
	}
		
		
		
}


