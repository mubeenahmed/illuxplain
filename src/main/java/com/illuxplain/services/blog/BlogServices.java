package com.illuxplain.services.blog;

import com.illuxplain.dtos.blog.MinBlogDTO;
import com.illuxplain.dtos.user.UserGetDTO;
import com.illuxplain.exceptions.NotFoundException;
import com.illuxplain.models.blog.Blog;
import com.illuxplain.models.user.User;
import com.illuxplain.repository.blog.BlogRepository;
import com.illuxplain.services.user.IUserServices;
import com.illuxplain.utils.BlogContentManagement;
import org.jboss.logging.BasicLogger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BlogServices implements IBlogServices {

    @Autowired
    private BlogRepository blogRepository;

    @Autowired
    private BlogContentManagement blogContentManagement;

    @Autowired
    private IUserServices userServices;

    ModelMapper mapper = new ModelMapper();

    @Override
    public Blog getBlog(String title) throws NotFoundException {
        Blog blog = blogRepository.findOneByTitle(title);
        if(blog == null)
        {
            throw new NotFoundException("Not found");
        }
        return blog;
    }

    @Override
    public List<MinBlogDTO> getBlogs() {
        List<Blog> blogs = blogRepository.findAll();
        return blogs.stream()
                .map(blog -> mapper.map(blog, MinBlogDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public Blog saveBlog(Blog blog, Principal principal) throws Exception {
        String title = blog.getTitleContent();
        String alterTitle = blogContentManagement.convertToLowerCaseAndStripeWithDash(title);
        blog.setTitle(alterTitle);

        User user= userServices.getFullUserObjectByEmail(principal.getName());
        blog.setUser(user);

        Blog b = blogRepository.saveAndFlush(blog);
        return b;
    }
}
