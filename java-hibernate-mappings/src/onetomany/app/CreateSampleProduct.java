package onetomany.app;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany.entity.Product;
import onetomany.entity.Sku;

public class CreateSampleProduct {

	public static void main(String[] args) {


		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Product.class)
								.addAnnotatedClass(Sku.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			
			Product product = new Product("laptop", "Lenovo's best laptop");
			Sku sku1 = new Sku("sku1", "sku1 is best description", 10.10D);
			sku1.setProduct(product);
			Sku sku2 = new Sku("sku2", "sku2 is best description", 20.10D);	
			sku2.setProduct(product);
			Sku sku3 = new Sku("sku3", "sku3 is best description", 30.10D);	
			sku3.setProduct(product);
			Sku sku4 = new Sku("sku4", "sku4 is best description", 40.10D);	
			sku4.setProduct(product);
			List<Sku> skus = Arrays.asList(sku1,sku2,sku3,sku4);
			product.setChildSkus(skus);
			session.save(product);
			
			session.getTransaction().commit();
		}
		
	
	}

}
