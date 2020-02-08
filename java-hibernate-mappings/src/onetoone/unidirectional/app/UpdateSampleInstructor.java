package onetoone.unidirectional.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import onetoone.unidirectional.entity.InstructorDetailsUni;
import onetoone.unidirectional.entity.InstructorUni;

public class UpdateSampleInstructor {
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
		InstructorDetailsUni instructorDetailsUni = new InstructorDetailsUni
				("coding", "football");
		//cascade is all and hence will create it
		instructor.setInstructorDetailsUni(instructorDetailsUni);
		session.save(instructor);
		
		
		session.getTransaction().commit();
	}
}
}
