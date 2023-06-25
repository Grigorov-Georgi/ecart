package com.midnightsun.productservice.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO extends AbstractAuditingDTO{
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private Long quantity;
    private BigDecimal weight;
    private Long length;
    private Long width;
    private Long height;
}
