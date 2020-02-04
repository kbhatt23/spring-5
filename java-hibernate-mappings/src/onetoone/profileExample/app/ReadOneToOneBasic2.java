package onetoone.profileExample.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;
import utils.DateUtils;

public class ReadOneToOneBasic2 {

	public static void main(String[] args) {
		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Profile.class)
								.addAnnotatedClass(ProfileAddress.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			
			Profile kanPro = session.get(Profile.class, 3);
			System.out.println(kanPro);
			System.out.println(kanPro.getProfileAddress());
			System.out.println("===================");
			ProfileAddress address1 = session.get(ProfileAddress.class, 11);
			System.out.println(address1);
			System.out.println(address1.getProfile());
			session.getTransaction().commit();
		}
		
	}
}
