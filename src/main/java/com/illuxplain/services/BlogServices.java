package com.illuxplain.services;

import com.illuxplain.dtos.MinBlogDTO;
import com.illuxplain.models.Blog;
import com.illuxplain.repository.BlogRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServices implements IBlogServices {

    @Autowired
    private BlogRepository blogRepository;

    ModelMapper mapper = new ModelMapper();

    @Override
    public Blog getBlog(String title) {
        return blogRepository.findOneByTitle(title);
    }

    @Override
    public List<MinBlogDTO> getBlogs() {
        List<Blog> blogs = blogRepository.findAll();
        return blogs.stream()
                .map(blog -> mapper.map(blog, MinBlogDTO.class))
                .collect(Collectors.toList());
    }
}
