package com.product.entity.primary;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "product",schema = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Mobile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "expire_date")
    private Integer expiryDate;

    @Column(name = "purchase_date")
    private Integer purchaseDate;
}
