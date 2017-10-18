package com.illuxplain.controllers;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.models.Comment;

@Controller
public class CategoryTheory {

	@RequestMapping(value = "/monad", method = RequestMethod.GET)
	public String monad() {
//		Object[] params = { "cat-1" };
//		List<Comments> listOfComments = new ArrayList<>(); // commentRepo.readforList(createQueryForAllComments(),
//															// params);
//		ModelAndView modelAndView = new ModelAndView("monad");
//		modelAndView.addObject("commentList", listOfComments);
//		return modelAndView;
		return "monad";
	}
}
