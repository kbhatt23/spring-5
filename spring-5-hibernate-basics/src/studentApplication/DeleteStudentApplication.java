package studentApplication;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class DeleteStudentApplication {

	public static void main(String[] args) {
		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				
				){
			
			session.beginTransaction();
			session.createQuery("delete from Student where id=5")
				.executeUpdate();
			
			
			session.getTransaction().commit();
			
			
			/*
			 * session.beginTransaction();
			 * 
			 * List<Student> sa =
			 * session.createQuery("from Student s where s.id=5",Student.class)
			 * .getResultList() ; System.out.println("val fetched "+sa);
			 * session.getTransaction().commit();
			 */
			//no need to close the session and session factory because of autocloseable
		}
	}

}
