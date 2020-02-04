package studentApplication;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import entity.Student;
import util.DateUtils;

public class UpdateDateForAllApplication {
public static void main(String[] args) {
	
	try(SessionFactory sf = new Configuration()
								.configure()
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
			Session session = sf.getCurrentSession();
			
			){
		
		String dateOfBirth = "23/03/1991";
		
	//	session.beginTransaction();
		
	//	Student st = session.get(Student.class, 4);
		//st.setDateOfBirth(DateUtils.convertStringToDate(dateOfBirth));
	//	session.getTransaction().commit();
		
		
		session.beginTransaction();
		Student st1 = session.get(Student.class, 4);
		System.out.println(DateUtils.convertDateToString(st1.getDateOfBirth()));
		
		session.getTransaction().commit();
		
	}
}
}
