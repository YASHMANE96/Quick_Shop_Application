package com.BackEnd.Quick_Shop.models;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Entity 
@Table(name = "Users")
public class User {

    @Id 
    @GeneratedValue (strategy = GenerationType.AUTO)
    private UUID Id;
    private String Name;
    private String Email;
    private String Password;
    private Long MobileNumber;
    private int Pincode;
    private String AddressLine1;
    private String AddressLine2;
    private String AddressLine3;
    private String UserType;
    private String Gender;
    private String Status;

}
