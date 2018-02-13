package com.illuxplain.repository;

import com.illuxplain.dtos.MinBlogDTO;
import com.illuxplain.models.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long> {

    public Blog findOneByTitle(String title);
}
