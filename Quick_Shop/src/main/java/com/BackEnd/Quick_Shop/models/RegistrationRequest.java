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
@Table(name = "Registration_Request")
public class RegistrationRequest {

    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID Id;

    @ManyToOne 
    private Shop shop;
    private String ShopDescription;

    @OneToMany 
    List<Activity> Activities;
}
