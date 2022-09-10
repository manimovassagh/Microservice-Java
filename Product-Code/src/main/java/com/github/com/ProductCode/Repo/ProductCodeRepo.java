package com.github.com.ProductCode.Repo;

import com.github.com.ProductCode.DTO.ProductCodeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductCodeRepo extends JpaRepository<ProductCodeModel, UUID> {
    public ProductCodeModel findByProductCode(String productCode);
}
