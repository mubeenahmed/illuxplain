package com.illuxplain.controllers.introduction;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.illuxplain.dtos.MinBlogDTO;
import com.illuxplain.services.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.illuxplain.models.Comment;

@Controller
public class Home {

	@Autowired
	private IBlogServices blogServices;

	@RequestMapping(value = { "/", "welcome", "home" }, method = RequestMethod.GET)
	public ModelAndView home() {
		List<MinBlogDTO> blogs = blogServices.getBlogs();

		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("blogs", blogs);
		return modelAndView;
	}
}
