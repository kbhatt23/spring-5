package springAnnotation.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import springAnnotation.coachService.Coach;

public class CoachRunnerWithScope {
public static void main(String[] args) {
	//create a context from xml
	//this will instantiate beans then call constructors then 
	//call the init hook method which is postconstruct annotation
	//call setter or method depencies
	System.out.println("coach game ki shuruat");
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansAnnotation.xml");
	
	//get the bean
	
	Coach basket1 = context.getBean("basketballCoachSingleton" , Coach.class);
	
	try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	Coach basket2 = context.getBean("basketballCoachSingleton" , Coach.class);
	
	System.out.println("is both basketball coach same "+(basket1 == basket2));
	System.out.println("basket memory locations are "+basket1 + " and "+basket2);
	
	//football is prototype
	
	
	
	
	
	context.close();
	
}
}
