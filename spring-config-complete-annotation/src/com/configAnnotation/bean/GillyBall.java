package com.configAnnotation.bean;

import org.springframework.stereotype.Component;
//below is comments so taht devloper can decide if he wants this class or not
//otherwise perfiormance impact
//@Component
public class GillyBall implements Bounceable {

	@Override
	public void bounce() {
		System.out.println("gilly do not bounce so easiliy");
	}

}
