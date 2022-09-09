package com.github.manimovassagh.product.repository;


import com.github.manimovassagh.product.DTO.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, UUID> {
    public List<ProductModel> findByProductName(String name);
}
