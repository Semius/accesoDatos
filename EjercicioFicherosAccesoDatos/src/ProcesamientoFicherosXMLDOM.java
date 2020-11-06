import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;

public class ProcesamientoFicherosXMLDOM extends ProcesamientoFichero {
	
	
	@Override
	public ArrayList<Libro> leerFichero(String ruta) {
		
		File file = new File(ruta);
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		
		
		try {
			  DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			  DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			  Document doc = dBuilder.parse(file);
			  doc.getDocumentElement().normalize();
			  NodeList nList = doc.getElementsByTagName("libro");		  
			  
			  
			  for(int temp = 0; temp < nList.getLength(); temp++) {
				  Node nNode = nList.item(temp);

				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) nNode;


				    //buscar cada tag en el archivo XML y guardar cada uno en su String
				    String titulo = eElement.getElementsByTagName("titulo").item(0).getTextContent();
				    String editorial = eElement.getElementsByTagName("editorial").item(0).getTextContent();
				    String autor = eElement.getElementsByTagName("autor").item(0).getTextContent();
				    String fecha = eElement.getElementsByTagName("fecha").item(0).getTextContent();
				    String genero = eElement.getElementsByTagName("genero").item(0).getTextContent();
				    
				    ArrayList<String> arrayPersonajes = new ArrayList<>();
				    ArrayList<String> arrayGeneros = new ArrayList<>();
				    ArrayList<String> arrayImportancia = new ArrayList<>();
				    ArrayList<Personajes> arrayProtagonistas = new ArrayList<Personajes>();
				    try {
				    	int x=0;
				    	while(x>-1) {
				    		
				    		String personaje = eElement.getElementsByTagName("nombre").item(x).getTextContent();
				    		String generoPersonajes = eElement.getElementsByTagName("genero").item(x).getTextContent();
				    		String importancia = eElement.getElementsByTagName("importancia").item(x).getTextContent();

				    		arrayPersonajes.add(personaje);
				    		arrayGeneros.add(generoPersonajes);
				    		arrayImportancia.add(importancia);

					    	x++;
				    	}//while
				    	
				    }//este try se cierra en el momento en que no quedan más personajes
				    catch (Exception e) {
				    	
				    }
				    int y=arrayPersonajes.size()-1;
				    
				   
				    while(y>-1) {
					    Personajes p1= new Personajes(arrayPersonajes.get(y),arrayGeneros.get(y),arrayImportancia.get(y));  
					    arrayProtagonistas.add(p1);
					   
					    y--;
				    }
				    
				    //mete todos los valores en un Libro
				    Libro l1 = new Libro(titulo,editorial,autor,fecha,genero,arrayProtagonistas);
				    arrayLibros.add(l1);
				    
				    
				  }
				  
				}
			  
			}//try
			
			catch(Exception e) {
			  e.printStackTrace();
			}
		
		return arrayLibros;
	}//leerFichero

	
	@Override
	public void guardarFichero(ArrayList<Libro> arrayLibros) {

		String ruta="C:\\Users\\PC33\\Desktop\\borrar//ProcesamientoXML.xml";
		String titulo="";
		String editorial="";
		String autor="";
		String fecha="";
		String genero="";
	    ArrayList<Personajes> arrayProtagonistas = new ArrayList<Personajes>();
		
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
		        //System.out.println(arrayProtagonistas);
		        				
		        //Item Node LIBRO
		        Element itemNode = document.createElement("Libro");

	            //Titulo
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
	            
				//Fecha
	            Element keyNode4 = document.createElement("Fecha"); 
	            Text nodeKeyValue4 = document.createTextNode(fecha);
	            keyNode4.appendChild(nodeKeyValue4);
	            
	            //Genero
	            Element keyNode5 = document.createElement("Genero"); 
	            Text nodeKeyValue5 = document.createTextNode(genero);
	            keyNode5.appendChild(nodeKeyValue5);
	            
	
	            
	            
	            
	            //append keyNode and valueNode to itemNode
	            itemNode.appendChild(keyNode);
	            itemNode.appendChild(keyNode2);
	            itemNode.appendChild(keyNode3);
	            itemNode.appendChild(keyNode4);
	            itemNode.appendChild(keyNode5);
	            
	            //bucle para los valores de personaje
	            for (Personajes p: arrayProtagonistas) { 
	            	
	            	String nombreP=p.getNombre();
	            	//System.out.println(p.getNombre());
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
	            }//for
	            
	            //append itemNode to raiz
	            raiz.appendChild(itemNode); //pegamos el elemento a la raiz "Documento"
	           
	            
			}//for
			
			//Generar XML
            Source source = new DOMSource(document);
            //Donde lo queeremos guardar
            Result result = new StreamResult(new java.io.File(ruta)); //nombre del archivo
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);
			
			}//try
		
			
			catch (Exception e) {
				e.printStackTrace();
			}
			
			
			
	}	 
		 
}
