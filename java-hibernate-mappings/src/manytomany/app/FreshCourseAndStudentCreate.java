package manytomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany.entity.Course;
import manytomany.entity.Student;

public class FreshCourseAndStudentCreate {
public static void main(String[] args) {

	try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Course.class)
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
			Session session = sf.getCurrentSession();
			
			){
			
		session.beginTransaction();
		Course course1 = new Course("ramacharit", "learn ram charitra to release pain of bhakats");
		Student student = new Student("rambhakt", 10.00D);
		course1.addStudent(student);
		student.addCourse(course1);
		session.save(student);
		session.save(course1);
		session.getTransaction().commit();
	}

}
}
