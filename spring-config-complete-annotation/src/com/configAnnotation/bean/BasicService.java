package com.configAnnotation.bean;

import org.springframework.stereotype.Component;

//using @bean in config file
//uncommenting to test the override behviour enabling open closed prinicple
@Component
public class BasicService {

	public void test() {
		System.out.println("jai shree ram from basic class");
	}
}
