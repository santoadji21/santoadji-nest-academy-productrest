package com.santoadji21.springnestacademy.presist.usecase;

import com.santoadji21.springnestacademy.presist.model.ProductModel;
import com.santoadji21.springnestacademy.presist.repos.ProductRepos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductUsecase {

    @Autowired
    private ProductRepos productRepos;

    public List<ProductModel> findAll() {
        return productRepos.findAll();
    }

    public ProductModel findById(Long id) {
        return productRepos.findById(id).get();
    }

    public ProductModel createProduct(ProductModel product) {
        return productRepos.save(product);
    }

    public void deleteById(Long id) {
        productRepos.deleteById(id);
    }

    public ProductModel updateProduct(ProductModel product) {
        return productRepos.save(product);
    }
}




