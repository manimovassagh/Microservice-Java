package com.github.manimovassagh.product.DTO;


import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;


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
    @NotNull
    private String productCode;
    public ProductModel(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
}
