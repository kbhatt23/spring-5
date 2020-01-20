package com.springmvc.basics.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeMultipleValidator implements ConstraintValidator<CourseCodeMultiplePattern, String> {

	private String[] courseCodePreFix;

	@Override
	public void initialize(CourseCodeMultiplePattern arg0) {
this.courseCodePreFix = arg0.values();
		
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		if(arg0 == null || arg0.length() ==0) {
			return false;
		}
		
		for(String prefix : courseCodePreFix) {
			if(arg0.startsWith(prefix)) {
				return true;
			}
		}
		
		return false;
	}

}
