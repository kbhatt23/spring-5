package com.springmvc.basics.bean;

import java.util.LinkedHashMap;

public class Footballer {

	private String firstName;
	private int jersey;
	private String lastName;
	private int age;
	private double salary;
	private String country;
	//this is radio button choice
	//can have only one selections
	private String favouriteCoach;
	
	//below choice is for multiple options
	private String[] favouriteMovies;
	
	private static final LinkedHashMap<String, String> countries;
	
	private static final LinkedHashMap<String, String> coaches;
	
	
	static {
		countries = new LinkedHashMap<String, String>();
		countries.put("br", "Brazil");
		countries.put("esp", "Spain");
		countries.put("ge", "Germany");
		countries.put("ar", "Argentina");
		
		coaches = new LinkedHashMap<String, String>();
		coaches.put("guardiola", "Guardiola");
		coaches.put("quique", "Quique");
		coaches.put("bielsa", "Bielsa");
		coaches.put("zidane", "Zidane");
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getJersey() {
		return jersey;
	}
	public void setJersey(int jersey) {
		this.jersey = jersey;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}
	public String getFavouriteCoach() {
		return favouriteCoach;
	}
	public void setFavouriteCoach(String favouriteCoach) {
		this.favouriteCoach = favouriteCoach;
	}
	public  LinkedHashMap<String, String> getCoaches() {
		return coaches;
	}
	@Override
	public String toString() {
		return "Footballer [firstName=" + firstName + ", jersey=" + jersey + ", lastName=" + lastName + ", age=" + age
				+ ", salary=" + salary + ", country=" + country + ", favouriteCoach=" + favouriteCoach + "]";
	}
	public String[] getFavouriteMovies() {
		return favouriteMovies;
	}
	public void setFavouriteMovies(String[] favouriteMovies) {
		this.favouriteMovies = favouriteMovies;
	}
}
