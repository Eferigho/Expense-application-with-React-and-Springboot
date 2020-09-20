package com.owode.expenses.repository;

import com.owode.expenses.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository <Category, Long> {
    Category findByName(String name);
}
