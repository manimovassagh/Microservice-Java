package com.github.com.ProductCode.Repo;

import com.github.com.ProductCode.DTO.ProductCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProductCodeRepo extends JpaRepository<ProductCode, UUID> {
}
