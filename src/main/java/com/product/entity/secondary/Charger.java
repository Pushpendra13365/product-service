package com.product.entity.secondary;

import jakarta.persistence.*;

@Entity
@Table(name = "charger")
public class Charger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "charger_type")
    private String chargerType;

    @Column(name = "issue_date")
    private Double issueDate;
}
