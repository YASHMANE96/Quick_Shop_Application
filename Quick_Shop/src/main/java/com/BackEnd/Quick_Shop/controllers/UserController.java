package com.BackEnd.Quick_Shop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BackEnd.Quick_Shop.DTO.SigninDTO;
import com.BackEnd.Quick_Shop.Exceptions.InvalidCredentialsException;
import com.BackEnd.Quick_Shop.Exceptions.UserNotFoundException;
import com.BackEnd.Quick_Shop.Service.UserService;
import com.BackEnd.Quick_Shop.models.User;

@RestController 
@RequestMapping("/api/v1/user")
public class UserController {

    UserService userService;

    @Autowired 
    public UserController(UserService userService) {
        this.userService = userService;
    }

    /*
        Whenever Our API Response Back It just not only Return Response Body
        It Returns Multiple Things 
        Headers, ResponseBody And Status Code
        When User Tried To Login And Enter Credentials then It is a failure Then Our API will Return What Status Code? -> 401 UnAuthorized
        On Post Success call What Status we Should Return? -> 201
    */

    @PostMapping("/singin")
    public ResponseEntity Singin(@RequestBody SigninDTO signinDTO){
        //Need To Create DTO
        //WE Need to Call Service layer to validate Email And Pasword of the User

        try {

            User user = this.userService.Signin(signinDTO);
            return new ResponseEntity(user, HttpStatus.CREATED);

        } catch (UserNotFoundException e) {
        
            return  new ResponseEntity(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (InvalidCredentialsException e) {

            return  new ResponseEntity(e.getMessage(), HttpStatus.UNAUTHORIZED);
        } catch (Exception e) {

            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
