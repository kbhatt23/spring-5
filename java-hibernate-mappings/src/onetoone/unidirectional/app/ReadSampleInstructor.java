package onetoone.unidirectional.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.unidirectional.entity.InstructorDetailsUni;
import onetoone.unidirectional.entity.InstructorUni;

public class ReadSampleInstructor {
public static void main(String[] args) {
	try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(InstructorUni.class)
								.addAnnotatedClass(InstructorDetailsUni.class)
								.buildSessionFactory();
			Session session = sf.getCurrentSession();
			
			){
			
		session.beginTransaction();
		InstructorUni instructor = session.get(InstructorUni.class, 1);
		//one to one is eager
		System.out.println(instructor);
		
		InstructorDetailsUni instructorDetails = session.get(InstructorDetailsUni.class, 10);
		System.out.println(instructorDetails);
		session.getTransaction().commit();
	}
}
}
