package com.illuxplain.comment.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.app.Comments;
import com.illuxplain.logic.CommentApplication;

@Controller
public class Home {
	
	
	@RequestMapping(value={"/", "welcome","home"} , method=RequestMethod.GET)
	public ModelAndView home(){
		
		CommentApplication commentApplication = new CommentApplication("wel-1");
		List<Comments> comments = null;
		
		try {
			comments = commentApplication.getAllComments();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		ModelAndView modelAndView = new ModelAndView("index");
		modelAndView.addObject("commentList",comments);
		return modelAndView;
	}
	
}
