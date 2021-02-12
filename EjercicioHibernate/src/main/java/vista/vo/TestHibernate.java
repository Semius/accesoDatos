package vista.vo;

import org.hibernate.Session;

import modelo.entidades.Autor;
import modelo.entidades.Autorlibro;

public class TestHibernate {
	public static void main(String[] args) {
		
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Crear un autor
        Autor autor = new Autor();
        
        autor.setApellidos("apellidos");
        //autor.setAutorlibros(null);
        autor.setIdAutor(6);
        autor.setNombre("a");
        
        
        System.out.println("FUNCIONA");
        /*emp.setFirstName(&quot;demo&quot;);
        emp.setLastName(&quot;user&quot;);*/
        
        session.save(autor);
        
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
