
package com.example.springbootcombat.service.impl;
import com.example.springbootcombat.model.Product;
import com.example.springbootcombat.repository.ProductRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class UserRepositoryImpl {

    private final ProductRepository productRepository;

    public UserRepositoryImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> findAllProducts() {
        return productRepository.findAll();
    }
}



