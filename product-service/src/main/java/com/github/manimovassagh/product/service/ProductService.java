package com.github.manimovassagh.product.service;


import com.github.manimovassagh.product.DTO.ProductModel;
import com.github.manimovassagh.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ProductService implements ProductServiceInterface {
    @Autowired
    ProductRepository productRepository;

    public List<ProductModel> getAllProducts(){
        return productRepository.findAll();
    }


    public ProductModel addProduct(ProductModel product) {
        productRepository.save(product);
        return product;
    }

    @Override
    public Optional<ProductModel> findProduct(UUID uuid) {
      Optional<ProductModel> product= productRepository.findById(uuid);
      return  product;
    }

    @Override
    public List<ProductModel> findByProductName(String name) {
      List<ProductModel> product= productRepository.findByProductName(name);
      return  product;
    }

    @Override
    public List<ProductModel> findByProductCode(String productCode) {
      return  productRepository.findByProductCode(productCode);
    }


}
