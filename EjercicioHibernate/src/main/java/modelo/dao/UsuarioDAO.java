package modelo.dao;

import java.util.ArrayList;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import modelo.entidades.Usuario;
import vista.vo.HibernateUtil;

public class UsuarioDAO {
	public void insertar(Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        
        session.save(usuario);
        session.getTransaction().commit();
        HibernateUtil.shutdown();
	}
	
	public void modificar (Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        System.out.println("FUNCIONA");
        session.update(usuario);
        session.getTransaction().commit();
	}
	
	public void eliminar (Usuario usuario) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.delete(usuario);
        session.getTransaction().commit();
	}
	
	public ArrayList<Usuario> obtenerPorId(int idUsuario) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        Criteria crit = session.createCriteria(Usuario.class);
        crit.add(Restrictions.eq("IdUsuario ", idUsuario)); //

        ArrayList <Usuario> listaAutores=(ArrayList<Usuario>) crit.list();

		return listaAutores;
	}
}
