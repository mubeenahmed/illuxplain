package com.illuxplain.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.models.Comment;

@Controller
public class Illxuplain {

	@RequestMapping(value = "illuxplain")
	public String machineLearning() {

		//Object[] params = { "illux-1" };
		//List<Comments> listOfComments = new ArrayList<>(); // commentRepo.readforList(createQueryForAllComments(),
															// params);
		//ModelAndView modelAndView = new ModelAndView("illuxplain");
		//modelAndView.addObject("commentList", listOfComments);
		//return modelAndView;
		return "illuxplain";
	}

}
