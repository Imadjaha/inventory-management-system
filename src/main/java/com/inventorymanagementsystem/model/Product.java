package com.inventorymanagementsystem.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "products", uniqueConstraints = @UniqueConstraint(columnNames = "sku"))
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long product_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String sku;

    private BigDecimal unitCost;
    private Integer quantityOnHand = 0;
    private Integer reorderThreshold = 5;

    @ManyToOne
    private Category category;

}
