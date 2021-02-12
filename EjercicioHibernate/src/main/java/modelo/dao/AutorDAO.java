package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Autor;
import vista.vo.HibernateUtil;

public class AutorDAO {
	public void insertar(Autor autor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        
        session.save(autor);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
	
	public void modificar (Autor autor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        session.update(autor);
        session.getTransaction().commit();
	}
	
	public void eliminar (Autor autor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(autor);
        session.getTransaction().commit();
	}
	
	public ArrayList<Autor> obtenerPorId(int idAutor) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
		
		/*
		Criteria criteria = session.createCriteria(Autor.class, "Autor");
		List<Autor> listaAutores2 =session.createQuery("SELECT mt.idAutor FROM Autor mt").list();
		System.out.println(listaAutores2);
		*/
        
        //
        Criteria crit = session.createCriteria(Autor.class);
        crit.add(Restrictions.eq("idAutor", idAutor)); //

        //System.out.println(crit.list());
        ArrayList <Autor> listaAutores=(ArrayList<Autor>) crit.list();
        //System.out.println(autor.getApellidos());
        //System.out.println((Autor) crit.list().get(0));
        //return (Autor) crit.list().get(0);
        
        /*
        Query query = session.createQuery("from Autor");
		
		List<Autor> listaAutores = query.list();
		*/
		return listaAutores;
	}
	
}
