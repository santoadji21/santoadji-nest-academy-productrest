package com.santoadji21.springnestacademy.presist.repos;

import com.santoadji21.springnestacademy.presist.model.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepos extends JpaRepository<ProductModel, Long> {
}
