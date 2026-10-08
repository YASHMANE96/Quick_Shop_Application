package com.BackEnd.Quick_Shop.models;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor 
@Data 
@Entity 
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private UUID Id;
    private String Product_Name;
    private String Product_Specification;
    private String Manufacturer;
    private String Price;
    private double Discount;
    private String Category;

    @ManyToOne 
    private Shop shop;
    
    @OneToMany 
    List<ProductImageLink> productImageLinks;


}
