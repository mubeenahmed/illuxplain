package com.illuxplain.controllers.introduction;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.models.Comment;

@Controller
public class Home {

	@RequestMapping(value = { "/", "welcome", "home" }, method = RequestMethod.GET)
	public String home() {
//		List<Comments> listOfComments = new ArrayList<>(); // commentRepo.readforList(createQueryForAllComments(),
//															// params);
//		ModelAndView modelAndView = new ModelAndView("home");
//		modelAndView.addObject("commentList", listOfComments);
//		return modelAndView;
		return "home";
	}
}
