package com.illuxplain.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.models.Comment;

@Controller
public class MachineLearning {

	@RequestMapping(value = "machine-learning")
	public ModelAndView machineLearning() {
		Object[] params = { "machine-1" };
		List<Comment> listOfComments = null; // commentRepo.readforList(createQueryForAllComments(),
												// params);
		ModelAndView modelAndView = new ModelAndView("machine-learning");
		modelAndView.addObject("commentList", listOfComments);
		return modelAndView;

	}

	private String createQueryForAllComments() {
		return "SELECT * FROM comments WHERE page_id = ?";
	}
}
