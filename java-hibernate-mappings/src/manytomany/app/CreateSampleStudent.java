package manytomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany.entity.Course;
import manytomany.entity.Student;

public class CreateSampleStudent {

public static void main(String[] args) {
	try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
			Session session = sf.getCurrentSession();
			
			){
			
		session.beginTransaction();
		Course course1 = new Course("spring boot", "learn spring boot 2.0");
		session.save(course1);
		Course course2 = new Course("react", "learn react 2.0 with redux and DB");
		session.save(course2);
		session.getTransaction().commit();
	}
}

}
