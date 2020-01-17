package com.configAnnotation.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("footballBeanId")
//football rules are tough as it reads from file and rules are not hardcoded like cricket
@PropertySource("classpath:footballRules.properties")
public class Football implements Sports {
	
	private Bounceable footballBounce;
	public Football(@Qualifier("football")Bounceable footballBounce){
		this.footballBounce = footballBounce;
	}
	
	private List<String> ruleLines = new ArrayList<String>();
	
	@Value("${football.rule1}")
	private String rule1;
	
	@Value("${football.rule2}")
	private String rule2;
	
	
	@PostConstruct
	public void initFromFile() {
		ruleLines.add(rule1);
		ruleLines.add(rule2);
	}

	@Override
	public void rule() {
		//System.out.println("football rules are very tough");
		System.out.println("football rules are as follows: ");
		
		ruleLines.forEach(System.out::println);
		System.out.println("football bounce memeory in bounceable class is "+footballBounce);
		footballBounce.bounce();
	}

}
