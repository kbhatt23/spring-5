package onetomany.app;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import onetomany.entity.Product;
import onetomany.entity.Sku;
import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;
import utils.DateUtils;

public class ReadSampleProduct {

	public static void main(String[] args) {


		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Product.class)
								.addAnnotatedClass(Sku.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			
          //  Product prod= session.get(Product.class, 11);
            Query<Product> query = session.createQuery("select i from Product i"+" "
            		+ "JOIN FETCH i.childSkus where i.id=:productId", 
            		Product.class
            		);
            query.setParameter("productId", 11);
          // List<Product>  products = query.getResultList();
            	Product product = query.getSingleResult();
            System.out.println(product);
           
            //session.getTransaction().commit();
			
			 
			 
			 product.getChildSkus().forEach(System.out::println);
			 session.getTransaction().commit();
		}
		
	
	}

}
