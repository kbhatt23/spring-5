package com.springmvc.basics.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD , ElementType.FIELD})
@Constraint(validatedBy = CourseCodeValidator.class)
public @interface CourseCodePattern {
	
	public String value() default "LUV";
	public String message() default "Property should start with LUV character set";
	

	// define default groups
	public Class<?>[] groups() default {};
	
	// define default payloads
	public Class<? extends Payload>[] payload() default {};	

}
