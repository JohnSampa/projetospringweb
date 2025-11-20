package com.johnprojects.projectspringwebjohn.repositories;

import com.johnprojects.projectspringwebjohn.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
