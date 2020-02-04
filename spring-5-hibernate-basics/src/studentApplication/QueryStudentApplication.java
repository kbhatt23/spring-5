package studentApplication;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class QueryStudentApplication {

	public static void main(String[] args) {
		
		try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
				Session session = sf.getCurrentSession();
				
				){
			
			session.beginTransaction();
			System.out.println("--------All Students-------");
			
			List<Student> allStudents = session.createQuery("from Student", Student.class)
					.getResultList()
					;
			displayStudents(allStudents);
			System.out.println("--------All Students-------");
			
			System.out.println();
			
			System.out.println("--------Name is Students-------");
			List<Student> likeStudents = session.createQuery("from Student s where s.lastName='madhav'", Student.class)
					.getResultList()
					;
			displayStudents(likeStudents);
			System.out.println("--------Name is Students-------");
			System.out.println();
			
			System.out.println("--------Like is Students-------");
			List<Student> likeStudents1 = session.createQuery("from Student s where s.lastName like '%ma%'", Student.class)
					.getResultList()
					;
			displayStudents(likeStudents1);
			System.out.println("--------Like is Students-------");
			
			
			
			session.getTransaction().commit();
			//no need to close the session and session factory because of autocloseable
		}
	}

	private static void displayStudents(List<Student> allStudents) {
		allStudents.forEach(System.out::println);
	}
}
