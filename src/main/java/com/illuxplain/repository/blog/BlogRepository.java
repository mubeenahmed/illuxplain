package com.illuxplain.repository.blog;

import com.illuxplain.models.blog.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Blog, Long> {

    public Blog findOneByTitle(String title);
}
