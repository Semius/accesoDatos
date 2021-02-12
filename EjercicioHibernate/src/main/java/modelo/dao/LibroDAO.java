package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Autor;
import modelo.entidades.Libro;
import vista.vo.HibernateUtil;

public class LibroDAO {
	public void insertar(Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        
        session.save(libro);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
	
	public void modificar (Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        session.update(libro);
        session.getTransaction().commit();
	}
	
	public void eliminar (Libro libro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(libro);
        session.getTransaction().commit();
	}
	
	public ArrayList<Libro> obtenerPorId(String idLibro) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Criteria crit = session.createCriteria(Libro.class);
        crit.add(Restrictions.eq("codLibro", idLibro)); //

        ArrayList <Libro> listaAutores=(ArrayList<Libro>) crit.list();

		return listaAutores;
	}

	/////
	
	
	//Obtener los libros prestados entre dos fechas
	public void obtenerPorFechaPrestamo() {
		
	}
	
	
	//Obtener libros dado el nombre de su autor
	public void obtenerPorNombreAutor(String nombre) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
		
		
		List<Autor> listaAutores2 =session.createQuery("SELECT mt.idAutor FROM Autor mt").list();
		System.out.println(listaAutores2);
	}
	
	
	//Obtener libros cuyo precio sea inferior a 20€ o que no tengan precio asignado
	public void obtenerPrecioInferior() {
		
	}
	
}
