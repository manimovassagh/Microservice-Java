package com.github.manimovassagh.product.controller;


import com.github.manimovassagh.product.DTO.ProductModel;
import com.github.manimovassagh.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product-health")
    public String health() {
        return "Product Microservice Controller work";
    }


    @GetMapping("/")
    public List<ProductModel> findAll() {
        return productService.getAllProducts();
    }


}
