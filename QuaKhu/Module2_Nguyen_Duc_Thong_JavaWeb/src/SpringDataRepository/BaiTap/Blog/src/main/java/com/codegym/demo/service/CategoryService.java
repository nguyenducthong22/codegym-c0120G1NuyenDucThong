package com.codegym.demo.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import com.codegym.demo.model.Category;

public interface CategoryService {
    Page<Category> findAll(Pageable pageable);

    Category findById(Long id);

    Page<Category> findAllByNameContaining(String name, Pageable pageable);



    void save(Category category);

    void remove(Long id);
}