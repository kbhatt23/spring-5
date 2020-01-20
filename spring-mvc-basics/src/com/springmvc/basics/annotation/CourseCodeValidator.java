package com.springmvc.basics.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeValidator implements ConstraintValidator<CourseCodePattern, String> {

	private String courseCodePreFix;
	@Override
	public void initialize(CourseCodePattern arg0) {
		this.courseCodePreFix = arg0.value();
	}

	@Override
	public boolean isValid(String courseCode, ConstraintValidatorContext arg1) {
		if(courseCode == null || courseCode.length() == 0) {
			//making it mandatory
			return false;
		}
		boolean isPrefixPresent = courseCode.startsWith(courseCodePreFix);
		return isPrefixPresent;
	}

}
