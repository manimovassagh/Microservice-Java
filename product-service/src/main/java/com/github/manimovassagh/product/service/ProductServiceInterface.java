package com.github.manimovassagh.product.service;


import com.github.manimovassagh.product.DTO.ProductModel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductServiceInterface {

    public List<ProductModel> getAllProducts();
    public ProductModel addProduct(ProductModel product);
    public Optional<ProductModel> findProduct(UUID uuid);
    public List<ProductModel> findByProductName(String name);

}
