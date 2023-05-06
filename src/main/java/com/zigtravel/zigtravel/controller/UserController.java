package com.zigtravel.zigtravel.controller;

import com.zigtravel.zigtravel.model.User;
import com.zigtravel.zigtravel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/compa/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<User> getAllusers(){
        return userRepository.findAll();
    }
}
