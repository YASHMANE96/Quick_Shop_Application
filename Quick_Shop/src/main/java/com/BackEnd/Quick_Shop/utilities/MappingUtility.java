package com.BackEnd.Quick_Shop.utilities;

import com.BackEnd.Quick_Shop.enums.UserState;
import com.BackEnd.Quick_Shop.enums.UserType;
//import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.BackEnd.Quick_Shop.DTO.InviteAdminDTO;
import com.BackEnd.Quick_Shop.models.User;

//@Component 
@Service 
public class MappingUtility {

    public User MapInviteAdminDtoToUserObject(InviteAdminDTO inviteAdminDTO) {

        User user = new User();
        user.setName(inviteAdminDTO.getName());
        user.setEmail(inviteAdminDTO.getEmail());
        user.setPassword("TempPassword@123");
        user.setUserType(UserType.ADMIN.toString());
        user.setMobileNumber(inviteAdminDTO.getMobileNumber());
        user.setGender(inviteAdminDTO.getGender());
        user.setAddressLine1(inviteAdminDTO.getAddressLine1());
        user.setAddressLine2(inviteAdminDTO.getAddressLine2());
        user.setAddressLine3(inviteAdminDTO.getAddressLine3());
        user.setStatus(UserState.INVITED.toString());
        user.setPincode(inviteAdminDTO.getPincode());

        return user;
    }
}
