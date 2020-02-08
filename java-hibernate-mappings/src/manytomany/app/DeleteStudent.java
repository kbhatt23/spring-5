package manytomany.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import manytomany.entity.Course;
import manytomany.entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {


		try(SessionFactory sf = new Configuration()
									.configure()
									.addAnnotatedClass(Course.class)
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
				Session session = sf.getCurrentSession();
				
				){
				
			session.beginTransaction();
			Student student = session.get(Student.class, 11);
			for(Course course : student.getCourses()) {
				//student.removeCourse(course);
				course.removeStudent(student);
			}
			session.remove(student);
			Course course  = session.get(Course.class, 10);
			System.out.println(course);
			System.out.println(course.getStudents());
			session.getTransaction().commit();
		}


	}

}
