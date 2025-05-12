package com.example.bookshop.service;

import com.example.bookshop.dto.response.UserResponse;
import com.example.bookshop.entity.User;

import java.util.List;


public interface UserService {

    List<UserResponse> getAllUser();
}
