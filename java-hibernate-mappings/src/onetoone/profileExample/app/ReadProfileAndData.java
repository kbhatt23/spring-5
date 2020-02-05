package onetoone.profileExample.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.profileExample.entity.Identification;
import onetoone.profileExample.entity.Profile;
import onetoone.profileExample.entity.ProfileAddress;

public class ReadProfileAndData {

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
Profile profile = session.get(Profile.class, 2);
System.out.println("main profile "+profile);

profile.getIdentifications().forEach(System.out::println);
session.getTransaction().commit();
}
	}

}
