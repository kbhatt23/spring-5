package com.springmvc.basics.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.basics.bean.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//we need model data binding instead of direct request param
	@RequestMapping("/showform")
	public String showform(Model model){
		model.addAttribute("customer", new Customer());
		return "showForm";
		
	}
	

	// add an initbinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resolve issue for our validation
	
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
	
	//we need model data binding instead of direct request param
		@RequestMapping("/submitform")
		public String submitform(@Valid @ModelAttribute("customer") Customer pCustomer,
			BindingResult result	){
			System.out.println("customer fetched is "+pCustomer);
			if(result.hasErrors()) {
				System.out.println("redirecting to error page");
				return "showForm";
			}else {
				System.out.println("redirecting to success page");
			return "showForm-success";
			}
			
		}
}
