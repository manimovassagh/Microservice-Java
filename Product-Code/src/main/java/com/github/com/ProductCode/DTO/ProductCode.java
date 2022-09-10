package com.github.com.ProductCode.DTO;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@EqualsAndHashCode
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ProductCode {
    @Id
    private UUID id;
    private String productName;
    private String productCode;


}
