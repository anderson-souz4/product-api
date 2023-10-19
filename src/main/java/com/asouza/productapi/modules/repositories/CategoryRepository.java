package com.asouza.productapi.modules.repositories;

import com.asouza.productapi.modules.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
