package com.illuxplain.controllers.introduction;

import java.util.List;

import com.illuxplain.dtos.blog.MinBlogDTO;
import com.illuxplain.services.blog.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class Home {

	@Autowired
	private IBlogServices blogServices;

	@GetMapping
	public ModelAndView home() {
		List<MinBlogDTO> blogs = blogServices.getBlogs();

		ModelAndView modelAndView = new ModelAndView("home");
		modelAndView.addObject("blogs", blogs);
		return modelAndView;
	}
}
