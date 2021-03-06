package vista.vo;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	 private static final SessionFactory sessionFactory = buildSessionFactory();
     
	    private static SessionFactory buildSessionFactory() {
	    	Configuration configuration = new Configuration().configure(); // configuration
            // settings
            // from
            // hibernate.cfg.xml

			StandardServiceRegistryBuilder serviceRegistryBuilder = new StandardServiceRegistryBuilder();
			
			
			serviceRegistryBuilder.applySettings(configuration.getProperties());
			
			ServiceRegistry serviceRegistry = serviceRegistryBuilder.build();
			
			return configuration.buildSessionFactory(serviceRegistry);
	    }
	    
	    
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	  
	    public static void shutdown() {
	        // cerrar cache y conexiones
	        getSessionFactory().close();
	    }
}
