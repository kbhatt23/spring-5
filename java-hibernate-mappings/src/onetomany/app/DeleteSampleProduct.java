package onetomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany.entity.Product;
import onetomany.entity.Sku;

public class DeleteSampleProduct {

	public static void main(String[] args) {



		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Product.class)
								.addAnnotatedClass(Sku.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			
            Product prod= session.get(Product.class, 10);
            System.out.println(prod);
            prod.getChildSkus()
            		.forEach(System.out::println);
            
            session.remove(prod);
			session.getTransaction().commit();
		}
		
	
	
	}

}
