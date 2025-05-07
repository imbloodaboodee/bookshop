package com.example.bookshop.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@AllArgsConstructor
@Table(name = "cart_item")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FavouriteItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @JoinColumn(name = "favourite_id")
    Favourite favourite;

}
