package com.github.manimovassagh.product.controller;


import com.github.manimovassagh.product.DTO.ProductModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.rmi.ServerException;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProductControllerInterface {
    public String health();
    public List<ProductModel> findAll();
    public ResponseEntity<ProductModel> create(@RequestBody ProductModel product) throws ServerException;

    public Optional<ProductModel> findProduct(UUID uuid);
    public List<ProductModel> findProductByName(String name);
    public List<ProductModel> findByProductCode(String productCode);
}
