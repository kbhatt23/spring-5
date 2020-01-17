package com.configAnnotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Cricket implements Sports {

	@Autowired
	//we can use qualifier if bean id which is the function name of @bean is not same as variable name defined below whihc is cricketballi
	@Qualifier("cricketBall")
	private Bounceable cricketBalli;
	
	@Override
	public void rule() {

		System.out.println("cricket rules are simple");
		cricketBalli.bounce();
	}

}
