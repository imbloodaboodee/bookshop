package com.example.bookshop.controller;


import com.example.bookshop.dto.response.UserResponse;
import com.example.bookshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/users")
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<UserResponse> getAllUser() {
        return userService.getAllUser();
    }
}
