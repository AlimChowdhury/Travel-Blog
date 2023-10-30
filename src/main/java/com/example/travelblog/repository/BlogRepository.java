package com.example.travelblog.repository;

import com.example.travelblog.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long> {
    List<Blog> findBlogByUserName(String userName);
    void deleteById(Long id);
}
