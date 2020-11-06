import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class ProcesamientoFicherosObjetos extends ProcesamientoFichero implements Serializable {

	@Override
	public ArrayList<Libro> leerFichero(String ruta) {
		
		ArrayList<Libro> arrayLibros = new ArrayList<Libro>();
		Libro l1 = new Libro();
		//NO FUNCIONA BIEN DEL TODO
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));

			Object objeto = ois.readObject();

			while (objeto!=null)
			{
			   if (objeto instanceof Libro) {
				   System.out.println(objeto);
				   l1 = (Libro)objeto;
				   arrayLibros.add(l1);
			   }

			   objeto = ois.readObject();	
			   
			}
			ois.close();
		}//try
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return arrayLibros;
	}//leerFichero

	@Override
	public void guardarFichero(ArrayList<Libro> arrayLibros) {
		
		for (Libro l2: arrayLibros) {	//el bucle se repite por cada elemento del arrayList
			l2= arrayLibros.get(0);
			
			try {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\PC33\\Desktop\\borrar//objeto3.txt"));
				oos.writeObject(arrayLibros);
				oos.close();
				System.out.println("guardado");
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}//for
	}//guardarFichero

	
	
	
}
