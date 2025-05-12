package com.example.bookshop.dto.response;

import com.example.bookshop.entity.Address;
import com.example.bookshop.entity.Cart;
import com.example.bookshop.entity.Favourite;
import com.example.bookshop.entity.Order;
import com.example.bookshop.entity.enumeration.Gender;
import com.example.bookshop.entity.enumeration.Rank;
import com.example.bookshop.entity.enumeration.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponse {

    Long id;

    String email;

    String phoneNumber;

    Long points;

    LocalDate dob;

    Rank rank;

    Role role;

    Gender gender;

    List<Address> addresses;

    List<Order> orders;
}
