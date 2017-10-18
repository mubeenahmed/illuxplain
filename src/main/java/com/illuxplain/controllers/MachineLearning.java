package com.illuxplain.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.models.Comment;

@Controller
public class MachineLearning {

	@RequestMapping(value = "machine-learning")
	public String machineLearning() {
//		Object[] params = { "machine-1" };
//		List<Comments> listOfComments = new ArrayList<>(); // commentRepo.readforList(createQueryForAllComments(),
//															// params);
//		ModelAndView modelAndView = new ModelAndView("machine-learning");
//		modelAndView.addObject("commentList", listOfComments);
//		return modelAndView;
		return "machine-learning";
	}

}
