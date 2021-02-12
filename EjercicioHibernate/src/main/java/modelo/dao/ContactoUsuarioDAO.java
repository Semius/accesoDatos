package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Contactousuario;
import vista.vo.HibernateUtil;

public class ContactoUsuarioDAO {
	public void insertar(Contactousuario contacto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        
        session.save(contacto);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
	
	public void modificar (Contactousuario contacto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        session.update(contacto);
        session.getTransaction().commit();
	}
	
	public void eliminar (Contactousuario contacto) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(contacto);
        session.getTransaction().commit();
	}
	
	public ArrayList<Contactousuario> obtenerPorId(int idUsuario) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Criteria crit = session.createCriteria(Contactousuario.class);
        crit.add(Restrictions.eq("IdUsuario ", idUsuario)); //

        ArrayList <Contactousuario> listaAutores=(ArrayList<Contactousuario>) crit.list();

		return listaAutores;
	}
}
