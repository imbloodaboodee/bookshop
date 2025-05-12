package com.example.bookshop.mapper;

import com.example.bookshop.dto.response.UserResponse;
import com.example.bookshop.entity.User;

public class UserMapper {
    public UserResponse mapToUserResponse(User user){
        UserResponse userResponse = new UserResponse();
        userResponse.setId(user.getId());
        userResponse.setDob(user.getDob());
        userResponse.setGender(user.getGender());
        userResponse.setEmail(user.getEmail());
        userResponse.setPoints(user.getPoints());
        userResponse.setRole(user.getRole());
        userResponse.setRank(user.getRank());
        userResponse.setPhoneNumber(user.getPhoneNumber());
        return userResponse;
    }
}
