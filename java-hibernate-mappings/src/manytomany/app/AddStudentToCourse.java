package manytomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany.entity.Course;
import manytomany.entity.Student;

public class AddStudentToCourse {

	public static void main(String[] args) {

		try(SessionFactory sf = new Configuration()
									.configure()
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
				Session session = sf.getCurrentSession();
				
				){
				
			session.beginTransaction();
			Course course1 = session.get(Course.class, 10);
			Student student2 = new Student("keshav", 10.10D);
			course1.addStudent(student2);
			student2.addCourse(course1);
			session.save(student2);
			session.save(course1);
			session.getTransaction().commit();
		}

	}

}
