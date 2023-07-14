package com.example.springbootcombat.controller;
import com.example.springbootcombat.model.Product;
import com.example.springbootcombat.service.impl.UserRepositoryImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    private final UserRepositoryImpl userRepository;

    public UserController(UserRepositoryImpl userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/getAllGoods")

    public List<Product> getAllGoods() {
        // 方法体
        return userRepository.findAllProducts();
    }

}


