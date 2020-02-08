package onetomany.uni.app;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetomany.entity.Product;
import onetomany.entity.Sku;
import onetomany.uni.entity.ProductUni;
import onetomany.uni.entity.SkuUni;

public class SaveSampleUniProductSku {
public static void main(String[] args) {


		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(ProductUni.class)
								.addAnnotatedClass(SkuUni.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			SkuUni sku1 = new SkuUni("sku11", "sku Desc 11", 10.0D);
			SkuUni sku2 = new SkuUni("sku22", "sku Desc 22", 20.0D);
			ProductUni product = new ProductUni("product1", "product 1 desc");
			product.addChildSku(sku1);
			product.addChildSku(sku2);
			session.save(product);
			session.getTransaction().commit();
		}
		
	
	}
}
