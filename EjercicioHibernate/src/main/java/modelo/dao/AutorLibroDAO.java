package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Autorlibro;
import vista.vo.HibernateUtil;

public class AutorLibroDAO {

	public void insertar(Autorlibro autorLibro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        
        session.save(autorLibro);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
	
	public void modificar (Autorlibro autorLibro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        session.update(autorLibro);
        session.getTransaction().commit();
	}
	
	public void eliminar (Autorlibro autorLibro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(autorLibro);
        session.getTransaction().commit();
	}
	
	public ArrayList<Autorlibro> obtenerPorId(int idAutorLibro) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria crit = session.createCriteria(Autorlibro.class);
        crit.add(Restrictions.eq("idAutorLibro", idAutorLibro)); //

        ArrayList <Autorlibro> listaAutores=(ArrayList<Autorlibro>) crit.list();

		return listaAutores;
	}
	
}
