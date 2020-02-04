package studentApplication;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class UpdateStudentApplication {

	public static void main(String[] args) {
		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				
				){
			
			session.beginTransaction();
			
			Student s1 = session.get(Student.class, 5);
			s1.setEmail("pavanputra.hanuman@god.com");
			session.getTransaction().commit();
			
			//we can also use query from hibernate Query language to updatea set of rows
			
			
			//no need to close the session and session factory because of autocloseable
		}
	}
}
