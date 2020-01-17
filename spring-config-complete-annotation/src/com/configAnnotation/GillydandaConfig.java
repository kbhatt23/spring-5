package com.configAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//as i am going to define gilly danda bean

import com.configAnnotation.bean.Bounceable;
import com.configAnnotation.bean.GillyBall;
import com.configAnnotation.bean.GillyDanda;
@Configuration
@ComponentScan
public class GillydandaConfig {
	
	//use case is simliar to resttemplate
	//restTemplate oob has all features
	//but @component is not added so as to let developer decide if 
	//he wants to use it, then @bean will instantiate the class to spring bean
	
	
	@Bean
	public GillyDanda gillyDanda() {
		return new GillyDanda(gillyBall());
	}
	
	@Bean
	public Bounceable gillyBall() {
		return new GillyBall();
	}
	

}
