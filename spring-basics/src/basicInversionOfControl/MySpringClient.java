package basicInversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringClient {

	public static void main(String[] args) {
		//load the application context to get spring container access
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansContext.xml");
		
		//get brena form container
		Coach footballCoach = context.getBean("footballCoach", Coach.class);
		footballCoach.startTraining();
		
		System.out.println("baskteball coach ki shuruat");
		Coach basketballcoach = context.getBean("basketballCoach", Coach.class);
		basketballcoach.startTraining();
		
		
		System.out.println("cricket coach ki shuruat");
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		cricketCoach.startTraining();
		
		
		//close the context
		context.close();
	}

}
