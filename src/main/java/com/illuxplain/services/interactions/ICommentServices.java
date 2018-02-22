package com.illuxplain.services.interactions;

import com.illuxplain.exceptions.NotFoundException;
import com.illuxplain.models.interactions.Comment;

import java.util.List;

public interface ICommentServices {

    Comment saveComment(Comment c) throws NotFoundException;
    List<Comment> getCommentsByBlogId(Long id) throws NotFoundException;
}
