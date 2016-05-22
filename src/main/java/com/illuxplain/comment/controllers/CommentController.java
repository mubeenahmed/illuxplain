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

import com.illuxplain.app.Comments;


@Controller
public class CommentController {
	
	@RequestMapping(value={"/"}, method = RequestMethod.POST)
	public ModelAndView addComment(@ModelAttribute Comments comment, Model model){
		return null;
	}
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public ModelAndView addComment(Model model){
		return null;
	}
	
	
	private Date convertIntToDate(long created){
		
		return null;
	}
}
