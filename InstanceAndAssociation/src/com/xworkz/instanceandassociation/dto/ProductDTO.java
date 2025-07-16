package com.xworkz.instanceandassociation.dto;

import lombok.*;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class ProductDTO {
    private String productName;
    private String category;
    private double price;
    private boolean inStock;
    private CompanyDTO company;
}
