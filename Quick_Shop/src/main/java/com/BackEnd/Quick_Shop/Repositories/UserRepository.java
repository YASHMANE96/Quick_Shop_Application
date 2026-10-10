package com.BackEnd.Quick_Shop.Repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.BackEnd.Quick_Shop.models.User;

@Repository 
public interface UserRepository extends JpaRepository<User, UUID> {

    public User findByEmail(String email);
}
