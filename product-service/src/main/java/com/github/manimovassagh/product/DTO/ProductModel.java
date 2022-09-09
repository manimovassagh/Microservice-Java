package com.github.manimovassagh.product.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private UUID id;
    @Column(name="product_name")
    private String productName;
    private Integer quantity;
    private Float price;
    public ProductModel(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
}
