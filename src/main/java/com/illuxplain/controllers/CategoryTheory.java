package com.illuxplain.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.models.Comments;
import com.illuxplain.repository.MySqlCommentPresistence;

@Controller
public class CategoryTheory {
	
	@Autowired
	@Qualifier("mysqlCommentRepo")
	MySqlCommentPresistence<Comments> commentRepo;
	
	@RequestMapping(value="/monad" , method=RequestMethod.GET)
	public ModelAndView home(){
		Object[] params = { "cat-1" };
		try {
			List<Comments> listOfComments = commentRepo.readforList(createQueryForAllComments(), params);
			ModelAndView modelAndView = new ModelAndView("monad");
			modelAndView.addObject("commentList",listOfComments);
			return modelAndView;	
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
	private String createQueryForAllComments(){
		return "SELECT * FROM comments WHERE page_id = ? ";
	}
	
}
