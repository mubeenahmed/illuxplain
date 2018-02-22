package com.illuxplain.services.interactions;

import com.illuxplain.exceptions.NotFoundException;
import com.illuxplain.models.blog.Blog;
import com.illuxplain.models.interactions.Comment;
import com.illuxplain.repository.interactions.CommentRepository;
import com.illuxplain.services.blog.IBlogServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServices implements ICommentServices {

    @Autowired
    private CommentRepository commentRepository;

    @Autowired
    private IBlogServices blogServices;

    @Override
    public Comment saveComment(Comment c) throws NotFoundException {
        Blog blog = c.getBlog();
        long blogId = blog.getId();

        blogServices.getBlogById(blogId);
        Comment co = commentRepository.saveAndFlush(c);
        return co;
    }

    @Override
    public List<Comment> getCommentsByBlogId(Long id) throws NotFoundException {
        blogServices.getBlogById(id);
        return commentRepository.findAllByBlogId(id);
    }
}
