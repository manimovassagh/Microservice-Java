package com.github.com.ProductCode.DTO;


import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@EqualsAndHashCode
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductCodeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(unique = true)
    private String productName;
    @Column(unique = true)
    private String productCode;


}
