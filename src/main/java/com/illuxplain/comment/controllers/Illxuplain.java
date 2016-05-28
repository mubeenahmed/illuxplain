package com.illuxplain.comment.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.app.Comments;
import com.illuxplain.logic.CommentApplication;

@Controller
public class Illxuplain {
	
	@RequestMapping(value="illuxplain")
	public ModelAndView machineLearning(){
		
		CommentApplication commentApplication = new CommentApplication("wel-1");
		List<Comments> comments = null;
		try {
			comments = commentApplication.getAllComments();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		ModelAndView modelAndView = new ModelAndView("illuxplain");
		modelAndView.addObject("commentList",comments);
		return modelAndView;
	}
}
