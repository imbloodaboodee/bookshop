package com.example.bookshop.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@Table(name = "product")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String title;

    @Column(columnDefinition = "TEXT")
    String description;

    @Column
    LocalDate publishedDate;

    @Column
    String isbn;

    @Column
    Long price;

    @Column
    Long stock;

    @Column
    String material;

    @Column
    String coverImage;

    @ManyToOne
    @JoinColumn(name = "publisher_id")
    Publisher publisher;

    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;

    @OneToMany(mappedBy = "product")
    List<Review> reviews;
}
