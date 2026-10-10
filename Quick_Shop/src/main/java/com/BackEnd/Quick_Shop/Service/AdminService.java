package com.BackEnd.Quick_Shop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BackEnd.Quick_Shop.DTO.InviteAdminDTO;
import com.BackEnd.Quick_Shop.Exceptions.NotAuthorizedException;
import com.BackEnd.Quick_Shop.models.User;
import com.BackEnd.Quick_Shop.utilities.MappingUtility;

@Service 
public class AdminService {

    UserService userService;
    MappingUtility mappingUtility;

    @Autowired 
    public AdminService(UserService userService, MappingUtility mappingUtility) {
        this.userService = userService;
        this.mappingUtility = mappingUtility;
    }

    public void InviteAdmin(InviteAdminDTO inviteAdminDTO, int userId) {

        //First Validate User ID-> Is it belonging to maint user or not.
        User maint = userService.GetUserById(userId);

        boolean isMaint = userService.isMaintUser(maint);

        if(maint == null || !isMaint) {

            throw new NotAuthorizedException("User is Not Allowed To Preform This Action.");
        }
        //We are getting admin details in InviteAdminDTO, NOw What We want?
        //We want to save the admin details in our user table.
        //For that first we need to map InviteAdminDTO Details to user Objects.  
        //If I will write mapping logic here directly so our code will look clumsy
        //I will create another class or another mapping class And there I will be keeping the mapping logic. 

        User Admin = mappingUtility.MapInviteAdminDtoToUserObject(inviteAdminDTO);

        //I need to save this Admin inthe user table. 

        Admin = userService.SaveOrUpdateUser(Admin);

        //After Saving Admin Object in table we need to mail the admin regarding the invite -> That he wants to join Org or Not.
    }
}
