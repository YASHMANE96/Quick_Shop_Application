package com.BackEnd.Quick_Shop.models;

import java.util.List;
import java.util.UUID;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity 
@Table(name = "Cart")
public class Cart {

    @Id  
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private double TotalPrice;

    @OneToOne 
    private User Customer;

    @OneToMany 
    List<CartProduct> cartproducts;
}
