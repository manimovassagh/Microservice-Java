package com.github.manimovassagh.product.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
    @Id
    private UUID id;
    @Column(name="product_name")
    private String productName;
    private int quantity;

}
