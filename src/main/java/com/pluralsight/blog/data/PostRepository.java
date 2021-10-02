package com.pluralsight.blog.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.pluralsight.blog.model.Post;

@Component
public interface PostRepository extends JpaRepository<Post, Long> {}
