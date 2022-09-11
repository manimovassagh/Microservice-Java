package com.github.com.ProductCode.DTO;


import lombok.*;
import org.springframework.lang.NonNull;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
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

    @NotNull(message = "product code can not be empty!")
    @Column(unique = true)
    private String productCode;


}
