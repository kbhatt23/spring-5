package onetoone.profileExample.app;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.profileExample.entity.Identification;
import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;
import utils.DateUtils;

public class ProfileIdentificationApp {

	public static void main(String[] args) {

		try(SessionFactory sf = new Configuration()
									.configure()
									.addAnnotatedClass(Profile.class)
									.addAnnotatedClass(ProfileAddress.class)
									.addAnnotatedClass(Identification.class)
									.buildSessionFactory();
				Session session = sf.getCurrentSession();
				){
			
				session.beginTransaction();
				
				//Profile profile = new Profile("naya", "nayalast", DateUtils.convertStringToDate("24/04/1992"));
				//Identification identi = new Identification("adhar", "Asdssd323Sdsd");\
				Profile profile = session.get(Profile.class, 1);
				Identification identi = new Identification("passpport", "ZY232SS");
				identi.setProfile(profile);
				//profile.setIdentifications(Arrays.asList(identi));
				profile.addIdentification(identi);
				session.save(profile);
				
				session.getTransaction().commit();
		}
	}

}
