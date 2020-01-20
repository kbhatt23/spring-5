package com.springmvc.basics.bean;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.springmvc.basics.annotation.CourseCodeMultiplePattern;
import com.springmvc.basics.annotation.CourseCodePattern;

public class Customer {

	private String firstName;
	
	@NotNull(message = " lastname is required")
	@NotEmpty
	private String lastName;
	
	
	@Min(value = 1 , message = "minimum value should be 1")
	@Max(value = 108 , message = "maximum value should be 108")
	private int age;
	
	@CourseCodePattern
	//@CourseCodePattern(value = "kbhatt" , message = "jai shree ram nahi kaha")
	private String courseCode;
	
	//@CourseCodeMultiplePattern
	@CourseCodeMultiplePattern(values = {"COURSE" , "RAMBHAKT" , "KESHAV"}
	, message = "jai shree radha krishna nahi kaha"
			)
	private String multiplePrefixCode;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getMultiplePrefixCode() {
		return multiplePrefixCode;
	}
	public void setMultiplePrefixCode(String multiplePrefixCode) {
		this.multiplePrefixCode = multiplePrefixCode;
	}
}
