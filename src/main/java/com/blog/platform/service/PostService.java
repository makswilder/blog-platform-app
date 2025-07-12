package com.blog.platform.service;

import com.blog.platform.domain.entity.Post;

import java.util.List;
import java.util.UUID;

public interface PostService {
    List<Post> getAllPosts(UUID categoryId, UUID tagId);
}
