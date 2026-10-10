package com.BackEnd.Quick_Shop.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor 
@NoArgsConstructor 
public class InviteAdminDTO {

    private String Name;
    private String Email;
    private Long MobileNumber;
    private int Pincode;
    private String AddressLine1;
    private String AddressLine2;
    private String AddressLine3;
    private String Gender;

}
