package com.configAnnotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//@config means instead of xml we can define beans here for IOC, spring will manage bean creation and its depedency injection

import com.configAnnotation.bean.BasicService;
import com.configAnnotation.bean.Bounceable;
@Configuration
//in xml based we can do component scan to search beans inside the subpackages
@ComponentScan
public class RootBeanConfig {
	
	//with this we can create beans without @component
	//if we add bean here we can override and follow open closed behvaiour without manipulating the main component class created by other developer
	@Bean
	//method name will be the bean id
	public BasicService basicService() {
		return new BasicService() {
			public void test() {
				System.out.println("jai shree ram from Bean config class");
			}
		};
	}
	
	//bean id is the method name
	@Bean
	public Bounceable football() {
		return () -> System.out.println("football bouncing");
	}
	
	//method name is always the bean id
	@Bean
	public Bounceable cricketBall() {
		return () -> System.out.println("cricket ball bouncing");
	}

}
