package com.illuxplain.comment.controllers;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.data.CommentPersistence;

@Controller
public class CommentController {
	
	@RequestMapping(value={"/"}, method = RequestMethod.POST)
	public ModelAndView addComment(@ModelAttribute Comment comment, Model model){
		CommentPersistence commentPersistence = new CommentPersistence();
		boolean result = commentPersistence.saveComment(comment);
		//model.addAttribute("comment",comment);
		ModelAndView modelAndView = new ModelAndView("index");
		return modelAndView;
		//return model;
	}
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView addComment(Model model){
		CommentPersistence commentPersistence = new CommentPersistence();
		List<Comment> listOfComment = commentPersistence.getComments();
		model.addAttribute("comment",listOfComment);
		ModelAndView modelAndView = new ModelAndView("index");
		
		return modelAndView;
	}
	
	
	private Date convertIntToDate(long created){
		
		return null;
	}
}
