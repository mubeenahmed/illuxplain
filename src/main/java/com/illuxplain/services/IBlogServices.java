package com.illuxplain.services;

import com.illuxplain.dtos.MinBlogDTO;
import com.illuxplain.models.Blog;

import java.util.List;

public interface IBlogServices {
    public Blog getBlog(String title);
    public List<MinBlogDTO> getBlogs();
}
