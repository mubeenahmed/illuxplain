package com.illuxplain.visitor;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.data.VistorInfo;

@Controller
public class VisitorController {
	
	@RequestMapping( value = "/")
	public ModelAndView storeVisitor(){

		storeVisitorInfo();
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
	}
	
	private void storeVisitorInfo(){
		String visitor = "Got Visitor";
		VistorInfo info = new VistorInfo();
		info.storeVistor(visitor);
	}
}
