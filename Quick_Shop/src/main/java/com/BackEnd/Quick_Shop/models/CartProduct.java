package com.BackEnd.Quick_Shop.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "Cart_Products")
public class CartProduct {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private UUID Card_Id;
    private UUID Product_Id;
    private int Quantity;
    private double Price;

}
