package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Prestamo;
import vista.vo.HibernateUtil;

public class PrestamoDAO {
	public void insertar(Prestamo prestamo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        
        session.save(prestamo);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
	
	public void modificar (Prestamo prestamo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        session.update(prestamo);
        session.getTransaction().commit();
	}
	
	public void eliminar (Prestamo prestamo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(prestamo);
        session.getTransaction().commit();
	}
	
	public ArrayList<Prestamo> obtenerPorId(int idPrestamo) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Criteria crit = session.createCriteria(Prestamo.class);
        crit.add(Restrictions.eq("idPrestamo", idPrestamo)); //

        ArrayList <Prestamo> listaAutores=(ArrayList<Prestamo>) crit.list();

		return listaAutores;
	}
}
