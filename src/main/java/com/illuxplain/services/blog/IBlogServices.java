package com.illuxplain.services.blog;

import com.illuxplain.dtos.blog.MinBlogDTO;
import com.illuxplain.models.blog.Blog;

import java.util.List;

public interface IBlogServices {
    public Blog getBlog(String title);
    public List<MinBlogDTO> getBlogs();
    public Blog saveBlog(Blog blog) throws Exception;
}