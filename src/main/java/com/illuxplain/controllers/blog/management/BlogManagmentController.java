package com.illuxplain.controllers.blog.management;

import com.illuxplain.models.blog.Blog;
import com.illuxplain.services.blog.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;


@Controller
@RequestMapping("/management/blog/")
public class BlogManagmentController {

    @Autowired
    private IBlogServices blogServices;

    @PostMapping("/submit")
    public ModelAndView submitBlog(Blog blog, Principal principal)
    {
        try {
            blogServices.saveBlog(blog, principal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView("submitted-blog");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @GetMapping("/add")
    public ModelAndView getBlogPostPage()
    {
        ModelAndView modelAndView = new ModelAndView("blog-posting");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

}
