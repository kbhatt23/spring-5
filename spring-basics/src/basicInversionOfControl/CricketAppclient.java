package basicInversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CricketAppclient {

	public static void main(String[] args) {

		//load the bean xml, spring has already loaded the beans to the spring context using ioc
		System.out.println("jai shree ganesh");
		//below context will create objects and do the depnedcny injection and cal setters and constructors
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansContext.xml");
		//get the bean
		System.out.println("start fetching bean");
		Coach cricketcoach =context.getBean("cricketCoach" , Coach.class);
		
		System.out.println("start calling trainign");
		cricketcoach.startTraining();
		//singleton and hence change in one will reflect other
		((CricketCoach)cricketcoach).setEmailForCoach("jaishreeram@newEmail.com");
		
		cricketcoach.startTraining();
		context.close();
	
	}

}
