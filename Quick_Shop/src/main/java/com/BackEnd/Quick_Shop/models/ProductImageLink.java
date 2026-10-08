package com.BackEnd.Quick_Shop.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Product_Image")
public class ProductImageLink {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private String ImageLink;
    
}
