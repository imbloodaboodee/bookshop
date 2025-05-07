package com.example.bookshop.entity;

import com.example.bookshop.entity.enumeration.Gender;
import com.example.bookshop.entity.enumeration.Rank;
import com.example.bookshop.entity.enumeration.Role;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "user")
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String email;

    @Column
    String password;

    @Column
    String phoneNumber;

    @Column
    Long points;

    @Column
    LocalDate dob;

    @Column
    @Enumerated(EnumType.STRING)
    Rank rank;

    @Column
    @Enumerated(EnumType.STRING)
    Role role;

    @Column
    @Enumerated(EnumType.STRING)
    Gender gender;

    @OneToOne(mappedBy = "user")
    @JoinColumn(name = "cart_id")
    Cart cart;

    @OneToOne(mappedBy = "user")
    @JoinColumn(name = "favourite_id")
    Favourite favourite;

    @OneToMany(mappedBy = "user")
    List<Address> addresses;

    @OneToMany(mappedBy = "user")
    List<Order> orders;

}
