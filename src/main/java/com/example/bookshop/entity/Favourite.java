package com.example.bookshop.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@AllArgsConstructor
@Entity
@Table(name = "favourite")
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Favourite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @OneToMany(mappedBy = "favourite")
    List<FavouriteItem> favouriteItem;

    @OneToOne
    @JoinColumn(name = "user_id")
    User user;
}
