package com.illuxplain.controllers.blog;

import com.illuxplain.models.blog.Blog;
import com.illuxplain.services.blog.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {

    @Autowired
    private IBlogServices blogServices;

    @RequestMapping(value = "blog/{path}")
    public ModelAndView getBlog(@PathVariable String path)
    {
        String blogTitle = path.toLowerCase();
        Blog blog = blogServices.getBlog(blogTitle);

        ModelAndView modelAndView = new ModelAndView("blog");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @RequestMapping(value = "blog/submit", method = RequestMethod.POST)
    public ModelAndView submitBlog(Blog blog)
    {
        try {
            blogServices.saveBlog(blog);
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModelAndView modelAndView = new ModelAndView("submitted-blog");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }

    @RequestMapping(value = "/add/blog", method = RequestMethod.GET)
    public ModelAndView getBlogPostPage()
    {
        ModelAndView modelAndView = new ModelAndView("blog-posting");
        modelAndView.addObject("blog", new Blog());
        return modelAndView;
    }

}
