package com.illuxplain.controllers.blog.readers;

import com.illuxplain.exceptions.NotFoundException;
import com.illuxplain.models.blog.Blog;
import com.illuxplain.models.interactions.Comment;
import com.illuxplain.services.blog.IBlogServices;
import com.illuxplain.services.interactions.ICommentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogServices blogServices;

    @Autowired
    private ICommentServices commentServices;

    @GetMapping("{path}")
    public ModelAndView getBlog(@PathVariable String path)
    {
        String blogTitle = path.toLowerCase();
        Blog blog = null;
        List<Comment> comments = new ArrayList<>();
        try {
            blog = blogServices.getBlog(blogTitle);
            comments = commentServices.getCommentsByBlogId(blog.getId());
        } catch (NotFoundException e) {
            e.printStackTrace();
        }


        ModelAndView modelAndView = new ModelAndView("blog");
        modelAndView.addObject("blog", blog);
        modelAndView.addObject("comments", comments);
        return modelAndView;
    }
}
