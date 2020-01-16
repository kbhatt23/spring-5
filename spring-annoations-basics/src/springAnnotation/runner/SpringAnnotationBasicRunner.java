package springAnnotation.runner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationBasicRunner {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beansAnnotation.xml");
		HelloWorldComponent cl = context.getBean("helloWorldComponent" , HelloWorldComponent.class);
		cl.sayHello();
		
		context.close();
	}

}
