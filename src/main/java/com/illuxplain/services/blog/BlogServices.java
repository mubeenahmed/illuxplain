package com.illuxplain.services.blog;

import com.illuxplain.dtos.blog.MinBlogDTO;
import com.illuxplain.models.blog.Blog;
import com.illuxplain.repository.blog.BlogRepository;
import com.illuxplain.utils.BlogContentManagement;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServices implements IBlogServices {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private BlogContentManagement blogContentManagement;

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

    @Override
    public Blog saveBlog(Blog blog) throws Exception {
        String title = blog.getTitleContent();
        String alterTitle = blogContentManagement.convertToLowerCaseAndStripeWithDash(title);
        blog.setTitle(alterTitle);

        Blog b = blogRepository.saveAndFlush(blog);
        return b;
    }
}
