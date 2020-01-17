package com.configAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configAnnotation.bean.BasicService;
import com.configAnnotation.bean.Bounceable;
import com.configAnnotation.bean.Football;
import com.configAnnotation.bean.Sports;

public class SportsRunner {

	public static void main(String[] args) {

		//get the context from annotation config class instead of xml file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(RootBeanConfig.class);
		
		//get the bean
		Sports cricket = context.getBean("cricket", Sports.class);
		
		cricket.rule();
		
		Sports football = context.getBean("footballBeanId", Football.class);
		football.rule();
		
		BasicService basicService =context.getBean("basicService",BasicService.class);
		basicService.test();
		
		Bounceable footballBounce = context.getBean("football",Bounceable.class);
		System.out.println("football bounce memeory in main class is "+footballBounce);
		
		context.close();
	}

}
