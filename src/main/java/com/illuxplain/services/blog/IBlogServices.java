package com.illuxplain.services.blog;

import com.illuxplain.dtos.blog.MinBlogDTO;
import com.illuxplain.exceptions.NotFoundException;
import com.illuxplain.models.blog.Blog;

import java.security.Principal;
import java.util.List;

public interface IBlogServices {
    Blog getBlog(String title) throws NotFoundException;
    List<MinBlogDTO> getBlogs();
    Blog saveBlog(Blog blog, Principal principal) throws Exception;
}
