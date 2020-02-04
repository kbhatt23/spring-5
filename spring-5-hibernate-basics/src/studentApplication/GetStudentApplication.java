package studentApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;

public class GetStudentApplication {

	public static void main(String[] args) {

		SessionFactory sf = new Configuration()
		//defualt ocnfiguraeis mapped to hibernate.cfg.xml
		.configure()
		.addAnnotatedClass(Student.class)
		.buildSessionFactory();
		
		//Session s = sf.getCurrentSession();
		
		try(Session s = sf.getCurrentSession();){
			s.beginTransaction();
			
			Student stu =s.get(Student.class, 1);
			System.out.println(stu);
			s.getTransaction().commit();
		}
		finally {
			//s.close();
			sf.close();
		}
	}

}
