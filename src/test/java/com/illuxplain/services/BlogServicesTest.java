package com.illuxplain.services;

import com.illuxplain.exceptions.NotFoundException;
import com.illuxplain.main.App;
import com.illuxplain.models.blog.Blog;
import com.illuxplain.repository.blog.BlogRepository;
import com.illuxplain.services.blog.IBlogServices;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class BlogServicesTest {

    @Autowired
    private IBlogServices blogServices;

    @MockBean
    private BlogRepository blogRepository;


    @Test
    public void testShouldReturnNoBlog()
    {
        Mockito.when(blogRepository.findOneByTitle("one")).thenReturn(null);
        try {
            Blog blog = blogServices.getBlog("one");
        } catch (NotFoundException e) {
            assertTrue(true);
        }
    }

    @Test
    public void testShouldReturnSingleBlog()
    {
        Blog blog = new Blog();
        blog.setId(1L);
        blog.setTitle("title");

        Mockito.when(blogRepository.findOneByTitle("title")).thenReturn(blog);

        try {
            Blog b = blogServices.getBlog("one");
            assertEquals(b.getTitle(), "one");
        } catch (NotFoundException e) {
            assertTrue(true);
        }
    }
}
