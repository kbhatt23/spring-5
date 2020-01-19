package com.springmvc.basics.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.basics.bean.Footballer;

@Controller
@RequestMapping
public class FootballerController {

	@RequestMapping("/showFootballerForm")
	public String showFootballerForm(Model model) {
		//need to send model for form:form tag to populate
		Footballer footballer = new Footballer();
		model.addAttribute("footballerAttribute", footballer);
		
		return "showFootballerForm";
	}
	
	@RequestMapping("/submitFootballForm")
	public String submitForm(@ModelAttribute("footballerAttribute") Footballer footballer) {
		System.out.println("footballer populates using data binding is "+footballer);
		return "footballerSuccess";
		
	}
}
