package com.asouza.productapi.modules.dto;

import com.asouza.productapi.modules.model.Category;
import lombok.Data;

@Data
public class CategoryRequest {
    private Integer id;
    private String name;

    public static CategoryRequest of(Category category) {
        CategoryRequest categoryRequest = new CategoryRequest();
        categoryRequest.setId(category.getId());
        categoryRequest.setName(category.getName());
        return categoryRequest;
    }
}
