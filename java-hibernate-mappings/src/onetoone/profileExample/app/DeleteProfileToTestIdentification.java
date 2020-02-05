package onetoone.profileExample.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.profileExample.entity.Identification;
import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;

public class DeleteProfileToTestIdentification {

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
System.out.println("main profile "+profile);

if(profile != null) {
profile.getIdentifications().forEach(identification -> identification.setProfile(null));
session.remove(profile);
}
Identification id = session.get(Identification.class, 13);
if(id != null) {
session.remove(id);
}
session.getTransaction().commit();
}
	
	}
}
