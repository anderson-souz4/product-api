package com.asouza.productapi.modules.model;

import com.asouza.productapi.modules.dto.CategoryRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    public static Category of(CategoryRequest categoryRequest) {
        return new Category(categoryRequest.getId(), categoryRequest.getName());
    }
}
