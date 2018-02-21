package com.illuxplain.repository.interactions;

import org.springframework.data.jpa.repository.JpaRepository;

import com.illuxplain.models.interactions.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
