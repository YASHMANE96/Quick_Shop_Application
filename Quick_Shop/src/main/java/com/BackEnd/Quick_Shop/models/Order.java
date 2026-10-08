package com.BackEnd.Quick_Shop.models;

import java.time.LocalDateTime;
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
@Table(name = "Orders")
public class Order {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;
    private double TotalPrice;
    private String State;
    private LocalDateTime AssignDateTime;
    private LocalDateTime DeliveredDateTime;
    private LocalDateTime PlacedDateTime;

    @OneToMany
    List<OrderProduct> orderproductList;

    @ManyToOne 
    private User customer;

    @ManyToOne 
    private Shop shop;

    @ManyToOne 
    private User DeliveryPartner;


}
