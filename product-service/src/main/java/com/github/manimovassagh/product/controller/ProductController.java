package com.github.manimovassagh.product.controller;


import com.github.manimovassagh.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;


    @GetMapping("/health")
    public String test() {
        return "Product Microservice Controller work";
    }


}
