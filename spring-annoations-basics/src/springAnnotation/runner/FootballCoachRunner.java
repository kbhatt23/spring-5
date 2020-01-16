package springAnnotation.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAnnotation.coachService.Coach;

public class FootballCoachRunner {

	public static void main(String[] args) {
		//get the context from spring for object factory
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansAnnotation.xml");
		
		//use context to access object form object factory
		
		Coach footballCoach = context.getBean("footballCoach" , Coach.class);
		
		//call the method
		
		footballCoach.startTraining();
		//close spring context
		
	Coach cricketCoach = context.getBean("sitaRam" , Coach.class);
		
		//call the method
		
	cricketCoach.startTraining();
	

	Coach basketBallCoach = context.getBean("basketballCoach" , Coach.class);
	basketBallCoach.startTraining();
		
		context.close();
		
	}

}
