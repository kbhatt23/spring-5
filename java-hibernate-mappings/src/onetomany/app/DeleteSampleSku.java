package onetomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany.entity.Product;
import onetomany.entity.Sku;

public class DeleteSampleSku {

	public static void main(String[] args) {



		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Product.class)
								.addAnnotatedClass(Sku.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			
            Sku sku= session.get(Sku.class, 6);
            System.out.println(sku);
            
            //clearing the data
            sku.getProduct().getChildSkus().remove(sku);
            session.remove(sku);
			session.getTransaction().commit();
		}
		
	
	
	}

}
