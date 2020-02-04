package onetoone.profileExample.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;
import utils.DateUtils;

public class OneToOneBasic {

	public static void main(String[] args) {
		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Profile.class)
								.addAnnotatedClass(ProfileAddress.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			
			ProfileAddress address =new ProfileAddress("C502 Majestic Apartment", "New Delhi", "Delhi");
			//no need to save as cascade contains persist
			//session.save(address);
			
			Profile profile = new Profile("kanishk", "bhatt", DateUtils.convertStringToDate("23/03/1991"));
			profile.setProfileAddress(address);
			session.save(profile);
			
			session.getTransaction().commit();
		}
		
	}
}
