package com.illuxplain.comment.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.illuxplain.app.Comments;


@Controller
public class CommentController {
	
	@RequestMapping(value="comment" , method=RequestMethod.POST)
	public String submitHomeComment(@ModelAttribute Comments comment){
		String commentText = comment.getCommentText();
		String commentorName = comment.getNameOfCommentor();
		
		return "OK";
	}	

	
}
