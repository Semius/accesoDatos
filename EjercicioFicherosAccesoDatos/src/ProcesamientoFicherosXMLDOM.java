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
			  /*System.out.println("Número de libros: " + nList.getLength());*/
			  
			  
			  
			  
			  
			  
			  
			  
			  for(int temp = 0; temp < nList.getLength(); temp++) {
				  Node nNode = nList.item(temp);
				  /*System.out.println(temp+" vez que se repite el bucle");*/

				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element eElement = (Element) nNode;

			        /*System.out.println("Root element: " + doc.getDocumentElement().getNodeName());*/

				    /*System.out.println("\nCoche id: " + eElement.getAttribute("id"));*/
				    
				    
				    String titulo = eElement.getElementsByTagName("titulo").item(0).getTextContent();
				    String editorial = eElement.getElementsByTagName("editorial").item(0).getTextContent();
				    String autor = eElement.getElementsByTagName("autor").item(0).getTextContent();
				    String fecha = eElement.getElementsByTagName("fecha").item(0).getTextContent();
				    String genero = eElement.getElementsByTagName("genero").item(0).getTextContent();
				    
				    ArrayList<String> arrayPersonajes = new ArrayList<>();
				    ArrayList<String> arrayGeneros = new ArrayList<>();
				    ArrayList<String> arrayImportancia = new ArrayList<>();
				    /*System.out.println("Titulo "+titulo);*/
				    ArrayList<Personajes> arrayProtagonistas = new ArrayList<Personajes>();
				    try {
				    	int x=0;
				    	while(x>-1) {
				    		
				    		String personaje = eElement.getElementsByTagName("nombre").item(x).getTextContent();
				    		String generoPersonajes = eElement.getElementsByTagName("genero").item(x).getTextContent();
				    		String importancia = eElement.getElementsByTagName("importancia").item(x).getTextContent();
				    		/*System.out.println(x);*/
				    		arrayPersonajes.add(personaje);
				    		arrayGeneros.add(generoPersonajes);
				    		arrayImportancia.add(importancia);
				    		
				    		/*System.out.println(arrayPersonajes.size());*/
				    		/*System.out.println(arrayPersonajes.get(x));*/
				    		
				    		/*System.out.println(arrayPersonajes.get(y));
				    		System.out.println(arrayPersonajes.size());*/
					    	x++;
				    	}
				    	
				    }
				    catch (Exception e) {
				    	/*e.printStackTrace();*/
				    }
				    int y=arrayPersonajes.size()-1;
				    
				   
				    while(y>-1) {
					    Personajes p1= new Personajes(arrayPersonajes.get(y),arrayGeneros.get(y),arrayImportancia.get(y));
					    
					    arrayProtagonistas.add(p1);
					    /*System.out.println("Protagonista "+arrayPersonajes.get(y));
					    System.out.println(titulo);*/
					   
					    y--;
					    /*System.out.println(arrayPersonajes.get(0));
					    System.out.println(arrayPersonajes.get(1));
					    System.out.println(arrayPersonajes.get(2));*/
					    
					    /*System.out.println(personaje);*/
				    }
				    /*System.out.println(temp+ " arrayProtagonistas "+arrayProtagonistas);*/
				    Libro l1 = new Libro(titulo,editorial,autor,fecha,genero,arrayProtagonistas);
				    arrayLibros.add(l1);
				    
				    
				  }
				  
				}
			  
			}
			
			catch(Exception e) {
			  /*e.printStackTrace();*/
			}
		
		
		
		
		
		
		
		
		
		
		
		return arrayLibros;
	}

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
		
		
		
		 
	
	
	
	
	
	
	
	
	
	
	
	
	
	//leerFichero
		 /*public static ArrayList<String> leerFichero() {
			 ArrayList<String> arrayLibros = new ArrayList<String>();
			 
			 try {
				Scanner sc = new Scanner(System.in);
				System.out.println("Escribe la ruta del fichero");
				String ruta= sc.nextLine();
				File archivo = new File(ruta);
				DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		        DocumentBuilder documentBuilder = dbf.newDocumentBuilder();
		        org.w3c.dom.Document documento = documentBuilder.parse(archivo);
		        documento.getDocumentElement().normalize();

		        
		        NodeList nList = documento.getElementsByTagName("Libro");
		        

		        
		        
		        for(int contador = 0; contador < nList.getLength(); contador++) {
		        	  Node nNode = nList.item(contador);
		        	  Element eElement = (Element) nNode;
		        	  
		        	   arrayLibros.add(eElement.getAttribute("Nombre"));
		        }
		        

		        /*for(int temp = 0; temp < nList.getLength(); temp++) {
		        	  Node nNode = nList.item(temp);

		        	  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
		        	    Element eElement = (Element) nNode;

		        	    System.out.println("\nCoche id: " + eElement.getAttribute("Nombre"));
		        	    System.out.println("Marca: "
		        	                + eElement.getElementsByTagName("marca").item(0).getTextContent());
		        	    System.out.println("Modelo: "
		        	                + eElement.getElementsByTagName("modelo").item(0).getTextContent());
		        	  }
		        	}

			}
			
	        catch (Exception e) {
	        	
	        }

			return arrayLibros;
			
		 }*/
		 
		 
		 
		 
		 
		 
		//guardarFichero
		/* public void guardarFichero( ArrayList<Libro> arrayLibros) {
			 if(arrayLibros.isEmpty()){
		            System.out.println("arrayLibros esta vacio");
		            return;
			 }
		            		
		            
			System.out.println("Escribe la ruta en la que quieres guardar el listado");
			Scanner sc = new Scanner(System.in);
			String ruta= sc.nextLine();
			File archivo = new File(ruta);
			try {
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		        DocumentBuilder builder = factory.newDocumentBuilder();
		        DOMImplementation implementation = builder.getDOMImplementation();
		        Document document = implementation.createDocument(null, "libro", null);
		        document.setXmlVersion("1.0");
		        
		        
	            Element raiz = document.getDocumentElement();

	            for(int i=0; i<arrayLibros.size();i++){
	                //Item Node
	                Element itemNode = document.createElement("ITEM"); 
	                //Key Node
	                Element keyNode = document.createElement("KEY"); 
	                Text nodeKeyValue = document.createTextNode(arrayLibros.get(i));
	                keyNode.appendChild(nodeKeyValue);      


	                //append keyNode and valueNode to itemNode
	                itemNode.appendChild(keyNode);
	                
	                //append itemNode to raiz
	                raiz.appendChild(itemNode); //pegamos el elemento a la raiz "Documento"
	            }                
	            //Generate XML
	            Source source = new DOMSource(document);
	            //Indicamos donde lo queremos almacenar
	            Result result = new StreamResult(new java.io.File("li"+".xml")); //nombre del archivo
	            Transformer transformer = TransformerFactory.newInstance().newTransformer();
	            transformer.transform(source, result);
	            
	            
			}
			
			catch (Exception e) {
				
			}
			
			
		 }*/






		
		 
		 
		 
		 
		 
}
