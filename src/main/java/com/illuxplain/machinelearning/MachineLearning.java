package com.illuxplain.machinelearning;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MachineLearning {

	@RequestMapping(value="machine-learning")
	public ModelAndView machineLearning(){
		
		ModelAndView modelAndView = new ModelAndView("machine-learning");
		return modelAndView;
	}
}
