package com.BackEnd.Quick_Shop.models;


import jakarta.persistence.Column;
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
    private int Id;
    private String Name;

    @Column(unique = true)
    private String Email;
    private String Password;

    @Column(unique = true)
    private Long MobileNumber;
    private int Pincode;
    private String AddressLine1;
    private String AddressLine2;
    private String AddressLine3;
    private String UserType;
    private String Gender;
    private String Status;

}
