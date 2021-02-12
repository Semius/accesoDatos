package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.entidades.Autor;
import modelo.entidades.Libro;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Autor autor = new Autor();
        
        autor.setApellidos("apellidos");
        //autor.setAutorlibros(null);
        autor.setIdAutor(5);
        autor.setNombre("b");
        
        AutorDAO AutorDao = new AutorDAO();
        ArrayList<Autor> listaAutores = AutorDao.obtenerPorId(5);
        autor=listaAutores.get(0);
        System.out.println(autor);
        */
		
		
		LibroDAO LibroDao = new LibroDAO();
		/*
		Libro libro = new Libro();
		libro.setCodLibro("3");
		libro.setEditorial("editorial");
		libro.setTitulo("titulo");
		libro.setPrecio(10);
		
		
		//LibroDao.insertar(libro);
		
		ArrayList<Libro> listaLibros = LibroDao.obtenerPorId("1");
		libro=listaLibros.get(0);
		System.out.println(libro.getTitulo());
		
		*/
		
		LibroDao.obtenerPorNombreAutor("a");
	}

}
