package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Ejemplar;
import vista.vo.HibernateUtil;

public class EjemplarDAO {
	public void insertar(Ejemplar ejemplar) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        
        session.save(ejemplar);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
	
	public void modificar (Ejemplar ejemplar) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        session.update(ejemplar);
        session.getTransaction().commit();
	}
	
	public void eliminar (Ejemplar ejemplar) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(ejemplar);
        session.getTransaction().commit();
	}
	
	public ArrayList<Ejemplar> obtenerPorId(int idEjemplar) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria crit = session.createCriteria(Ejemplar.class);
        crit.add(Restrictions.eq("idEjemplar", idEjemplar)); //

        ArrayList <Ejemplar> listaAutores=(ArrayList<Ejemplar>) crit.list();

		return listaAutores;
	}
}
