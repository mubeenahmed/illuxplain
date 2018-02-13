package com.illuxplain.controllers.blog;

import com.illuxplain.dtos.MinBlogDTO;
import com.illuxplain.models.Blog;
import com.illuxplain.services.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/blog")
public class BlogController {

    @Autowired
    private IBlogServices blogServices;

    @GetMapping("/{path}")
    public ResponseEntity<?> getBlog(@PathVariable String path)
    {
        Blog blog = blogServices.getBlog(path);
        return ResponseEntity.ok(blog);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getMinBlog()
    {
        List<MinBlogDTO> blogs = blogServices.getBlogs();
        return ResponseEntity.ok(blogs);
    }
}
