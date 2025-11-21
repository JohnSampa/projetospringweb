package com.johnprojects.projectspringwebjohn.repositories;

import com.johnprojects.projectspringwebjohn.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
