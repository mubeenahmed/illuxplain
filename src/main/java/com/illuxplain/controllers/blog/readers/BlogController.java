package com.illuxplain.controllers.blog.readers;

import com.illuxplain.exceptions.NotFoundException;
import com.illuxplain.models.blog.Blog;
import com.illuxplain.services.blog.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogServices blogServices;

    @GetMapping("{path}")
    public ModelAndView getBlog(@PathVariable String path)
    {
        String blogTitle = path.toLowerCase();
        Blog blog = null;
        try {
            blog = blogServices.getBlog(blogTitle);
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        ModelAndView modelAndView = new ModelAndView("blog");
        modelAndView.addObject("blog", blog);
        return modelAndView;
    }
}
