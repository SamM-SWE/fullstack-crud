package com.samuelmonneh.fullstackbackend.controller;

import com.samuelmonneh.fullstackbackend.model.User;
import com.samuelmonneh.fullstackbackend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    //Add User
    @PostMapping("/user")
    User newUser(@RequestBody User newuUser) {
        return userRepo.save(newuUser);
    }

    //Get User
    @GetMapping("/users")
    List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
