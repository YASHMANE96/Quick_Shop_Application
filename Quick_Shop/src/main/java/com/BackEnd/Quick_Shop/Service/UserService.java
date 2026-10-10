package com.BackEnd.Quick_Shop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BackEnd.Quick_Shop.DTO.SigninDTO;
import com.BackEnd.Quick_Shop.Exceptions.InvalidCredentialsException;
import com.BackEnd.Quick_Shop.Exceptions.UserNotFoundException;
import com.BackEnd.Quick_Shop.Repositories.UserRepository;
import com.BackEnd.Quick_Shop.models.User;

@Service 
public class UserService {

    //@Autowired 
    //UserRepository userRepository; //It is Field Based Autowired We Dont prefer Field Based Autowired

    /* 
        Constructor Based Autowired 
        This is what we use in the industry
        @Param UserRepository
    */
    
    UserRepository userRepository;
    @Autowired 
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User Signin(SigninDTO signinDTO) {

        String Email = signinDTO.getEmail();

        //We need to get UserRepository ANd from UserRepository we will get user by Email
        User user = userRepository.findByEmail(Email);

        if(user == null) {
            //Will Throw Exception User Does Not Exist
            throw new UserNotFoundException(String.format("User With Id %s Does Not Exist", Email));
        }

        if(user.getPassword().equals(signinDTO.getPassword())) {
            return user;
        }
        throw new InvalidCredentialsException("Wrong Email And Password Entered"); 

    }   
}
