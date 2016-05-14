package com.illuxplain.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Illxuplain {
	@RequestMapping(value="illuxplain")
	public ModelAndView machineLearning(){
		
		ModelAndView modelAndView = new ModelAndView("illuxplain");
		return modelAndView;
	}
}
