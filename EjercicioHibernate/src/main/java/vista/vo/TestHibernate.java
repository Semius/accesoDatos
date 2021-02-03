package vista.vo;

import org.hibernate.Session;

import modelo.entidades.Autor;

public class TestHibernate {
	public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Add new Employee object
        Autor autor = new Autor();
        autor.setIdAutor(2);
        autor.setApellidos("aaa");
        autor.setNombre("aaa");
        /*emp.setFirstName(&quot;demo&quot;);
        emp.setLastName(&quot;user&quot;);*/
         
        session.save(autor);
         
        session.getTransaction().commit();
        HibernateUtil.shutdown();
    }
}
