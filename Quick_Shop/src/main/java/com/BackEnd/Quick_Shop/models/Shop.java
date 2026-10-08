package com.BackEnd.Quick_Shop.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor 
@AllArgsConstructor 
@Data 
@Entity 
@Table(name = "Shops")
public class Shop {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private String ShopName;
    private String GSTNumber;
    private String State;
    private int Pincode;
    private String AddressLine1;
    private String AddressLine2;
    private String AddressLine3;
    private Long MobileNumber;

    @OneToOne 
    private User ShopKeeper;
}
