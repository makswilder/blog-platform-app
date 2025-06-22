package com.blog.platform.service;

import com.blog.platform.domain.entity.Category;

import java.util.List;
import java.util.UUID;

public interface CategoryService {

    List<Category> listCategories();
    Category createCategory(Category category);
    void deleteCategory(UUID id);
}
