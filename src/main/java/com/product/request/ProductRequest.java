package com.product.request;

import lombok.Data;

@Data
public class ProductRequest {

    private Long id;
    private String productName;
    private Integer expiryDate;
    private Integer purchaseDate;
}
