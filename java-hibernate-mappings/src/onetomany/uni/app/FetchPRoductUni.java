package onetomany.uni.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany.uni.entity.ProductUni;
import onetomany.uni.entity.SkuUni;

public class FetchPRoductUni {

	public static void main(String[] args) {



		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(ProductUni.class)
								.addAnnotatedClass(SkuUni.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			SkuUni sku1 = session.get(SkuUni.class, 3);
			System.out.println(sku1);
			ProductUni product = session.get(ProductUni.class, 11);
			System.out.println(product);
			session.getTransaction().commit();
		}
		
	
	
	}

}
