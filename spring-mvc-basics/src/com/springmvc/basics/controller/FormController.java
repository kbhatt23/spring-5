package com.springmvc.basics.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {

	//@PostMapping("/submitBasicForm")
	@RequestMapping("/submitBasicForm")
	public ModelAndView formSubmit1(@RequestParam("input1") String ia1 , @RequestParam("input2") String ia2) {
		System.out.println("form submission data , input1 "+ia1+ " and input2 "+ia2);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("formSubmitSuccess");
		mv.addObject("inputs", ia1+ia2);
		return mv;
	}
	
	@RequestMapping("/showBasicForm")
	public String showBasicForm() {
		return "formBasic";
	}
	

	@PostMapping("/submitBasicForm")
	public ModelAndView formSubmitPost(@RequestParam("input1") String ia1 , @RequestParam("input2") String ia2) {
		System.out.println("form submission data , input1 "+ia1+ " and input2 "+ia2);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("formSubmitSuccess");
		mv.addObject("inputs", ia1+ia2);
		return mv;
	}
	
	@PostMapping("/submitBasicFormv1")
	public String formSubmitPostV1(HttpServletRequest req, Model model) {
		String input1 = req.getParameter("input1");
		String input2 = req.getParameter("input2");
		System.out.println("form submission data , input1 "+input1+ " and input2 "+input2);
		
		model.addAttribute("messiName" , input1.toUpperCase()+input2.toUpperCase());
		return "formSubmitSuccess";
	}
}
