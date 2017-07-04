package com.illuxplain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ContactController {
	
	@RequestMapping(value="contact")
	public View contact(){
			ModelAndView modelAndView = new ModelAndView("contact");
			return modelAndView;	
	}
}
