package com.BackEnd.Quick_Shop.models;

import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class OrderProduct {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private UUID OrderId;
    private UUID PlaceId;
    private int Quantity;
    private double Price;
}
