package com.github.manimovassagh.product.service;


import com.github.manimovassagh.product.DTO.ProductModel;
import com.github.manimovassagh.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ProductServiceInterface {
    @Autowired
    ProductRepository productRepository;

    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }



}
