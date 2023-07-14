package com.example.springbootcombat.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springbootcombat.model.Product;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // 可以添加其他自定义查询方法
    // ...
    List<Product> findAll();
}
