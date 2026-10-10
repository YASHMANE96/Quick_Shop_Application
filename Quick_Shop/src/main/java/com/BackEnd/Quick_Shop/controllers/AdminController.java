package com.BackEnd.Quick_Shop.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.BackEnd.Quick_Shop.DTO.InviteAdminDTO;

@RequestMapping("/api/v1/admin")
public class AdminController {

    @PostMapping("/invite")
    public ResponseEntity InviteAdmin(@RequestBody InviteAdminDTO inviteAdminDTO, @RequestParam int userId) {

        return ResponseEntity.ok("Admin invitation received");
    }
}
