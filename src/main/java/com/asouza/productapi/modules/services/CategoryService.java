package com.asouza.productapi.modules.services;

import com.asouza.productapi.modules.config.exceptions.NameNotInformedException;
import com.asouza.productapi.modules.dto.CategoryRequest;
import com.asouza.productapi.modules.dto.CategoryResponse;
import com.asouza.productapi.modules.model.Category;
import com.asouza.productapi.modules.repositories.CategoryRepository;
import com.asouza.productapi.modules.utils.Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.asouza.productapi.modules.utils.Utils.isEmptyOrNull;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryResponse create(CategoryRequest categoryRequest) {
        validadeNameWasInformed(categoryRequest);
        var category = categoryRepository.save(Category.of(categoryRequest));
        return CategoryResponse.of(category);
    }

    private void validadeNameWasInformed(CategoryRequest categoryRequest){
        if(isEmptyOrNull(categoryRequest.getName())){
            throw new NameNotInformedException("Name is required");
        }
    }




}
