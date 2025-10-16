package com.product.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class MobileResponse implements Serializable {
    private Long id;
    private String productName;
    private Integer expiryDate;
}
