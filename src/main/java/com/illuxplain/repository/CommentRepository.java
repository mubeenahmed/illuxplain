package com.illuxplain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.illuxplain.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{

}
