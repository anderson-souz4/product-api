package com.asouza.productapi.modules.controller;

import com.asouza.productapi.modules.dto.CategoryRequest;
import com.asouza.productapi.modules.dto.CategoryResponse;
import com.asouza.productapi.modules.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public CategoryResponse create(@RequestBody CategoryRequest categoryRequest) {
        return categoryService.create(categoryRequest);
    }
}
