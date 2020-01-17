package com.configAnnotation.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.configAnnotation.GillydandaConfig;

public class GillyDandaRunner {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GillydandaConfig.class);
		
		Sports gillyDanda = context.getBean("gillyDanda", Sports.class);
		
		gillyDanda.rule();
		
		//Sports cricket = context.getBean("cricket", Sports.class);
		//cricket.rule();
		
		context.close();
	
	}

}
