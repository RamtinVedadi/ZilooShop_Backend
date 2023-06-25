package com.ziloo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Product extends AbstractModel {
    @Column
    private String productName;

    @Column
    private Long productPrice;

    @Column
    private Long productDiscountPrice;

    @Column(length = 65535, columnDefinition = "Text")
    private String productDescription;
}
