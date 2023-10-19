package com.asouza.productapi.modules.dto;

import com.asouza.productapi.modules.model.Category;
import lombok.Data;

@Data
public class CategoryResponse {
    private Integer id;
    private String name;

    public static CategoryResponse of(Category category) {
        CategoryResponse categoryResponse = new CategoryResponse();
        categoryResponse.setId(category.getId());
        categoryResponse.setName(category.getName());
        return categoryResponse;
    }
}
