package studentApplication;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class SaveStudentApplication {

	public static void main(String[] args) {
		

		//create session factory
	SessionFactory sessionFactory=	new Configuration()
			.configure("hibernate.cfg.xml")
			.addAnnotatedClass(Student.class)
			.buildSessionFactory();
		
		
		//fetch session
		
		//use session and save data in db
	Session session = sessionFactory.getCurrentSession();
		try {
		
			Student student = new Student("pavanputra", "hanuman", "ramaduta.hanuman@god.com");
			//student.setId(1);
			session.beginTransaction();
			session.save(student);
			
			session.getTransaction().commit();
			
			
		}
		finally {
			session.close();
			sessionFactory.close();
		}
		
	}

}
