package com.illuxplain.repository.interactions;

import org.springframework.data.jpa.repository.JpaRepository;

import com.illuxplain.models.interactions.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long>{
    List<Comment> findAllByBlogId(long id);
}
