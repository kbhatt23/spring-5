package onetoone.profileExample.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;

public class RemoveFromAddress {

	public static void main(String[] args) {

		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Profile.class)
								.addAnnotatedClass(ProfileAddress.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
			session.beginTransaction();
	
			
			ProfileAddress kanProaddress = session.get(ProfileAddress.class, 11);
			System.out.println(kanProaddress);
			System.out.println(kanProaddress.getProfile());
			//if we want to delete it without deleting , after adding cased as persist only
			//we get excpetion of reference
			//so we shud remove the entity that is going ot be used form other places
			kanProaddress.getProfile().setProfileAddress(null);
			//shud not remove main profile as default casacde do not include remove, infact it is empty
			session.delete(kanProaddress);
			session.getTransaction().commit();
		}
		
	
	}
}
