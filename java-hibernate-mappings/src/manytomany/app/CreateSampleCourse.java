package manytomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany.entity.Course;
import manytomany.entity.Student;

public class CreateSampleCourse {

public static void main(String[] args) {
	try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
			Session session = sf.getCurrentSession();
			
			){
			
		session.beginTransaction();
		Student student1 = new Student("kanishk", 10.0D);
		Student student2 = new Student("kaka", 5.2D);
		session.save(student1);
		session.save(student2);
		session.getTransaction().commit();
	}
}

}
