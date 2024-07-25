package com.mlin9.mollusc.controller;

import com.mlin9.mollusc.entity.Product;
import com.mlin9.mollusc.repository.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String home() {
        return "Hello World";
    }

    @PostMapping("/products")
    public Product saveProduct(@RequestBody Product product) {
        return this.productRepository.save(product);
    }

    @GetMapping("/all")
    public Iterable<Product> findAllProducts() {
        return this.productRepository.findAll();
    }
}
