package onetomany.app;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany.entity.Product;
import onetomany.entity.Sku;
import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;
import utils.DateUtils;

public class ReadSampleProductJPQL {

	public static void main(String[] args) {


		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Product.class)
								.addAnnotatedClass(Sku.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			
            Product prod= session.get(Product.class, 11);
            System.out.println(prod);
           
            //session.getTransaction().commit();
			
			 prod.getChildSkus()
     		.forEach(System.out::println);
			 session.getTransaction().commit();
		}
		
	
	}

}
