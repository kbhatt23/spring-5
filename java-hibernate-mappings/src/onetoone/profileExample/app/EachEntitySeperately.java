package onetoone.profileExample.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;
import utils.DateUtils;

public class EachEntitySeperately {

	public static void main(String[] args) {
		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Profile.class)
								.addAnnotatedClass(ProfileAddress.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
			
			Profile profile = new Profile("kanishk", "bhatt", DateUtils.convertStringToDate("23/03/1991"));
			session.save(profile);
			
			ProfileAddress address =new ProfileAddress("C502 Majestic Apartment", "New Delhi", "Delhi");
			session.save(address);
			
			
			session.getTransaction().commit();
		}
		
	}
}
