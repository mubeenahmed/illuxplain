package com.illuxplain.controllers.blog;

import com.illuxplain.dtos.MinBlogDTO;
import com.illuxplain.models.Blog;
import com.illuxplain.services.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

}
