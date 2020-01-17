package com.configAnnotation.bean;

import org.springframework.stereotype.Component;

//not definign component as i will let devloper to decide if he needs this class object or not
//example is resttemplate
//@Component
public class GillyDanda implements Sports {

	//can not use autowire as per objective we have skipped creation of bean for flexibility
	private Bounceable gillyBall;
	
	 public GillyDanda(Bounceable gillyBall) {
		 this.gillyBall = gillyBall;
	 }
	
	@Override
	public void rule() {
		System.out.println("gilly danda ke practise ki shuruat");
		gillyBall.bounce();
	}

}
