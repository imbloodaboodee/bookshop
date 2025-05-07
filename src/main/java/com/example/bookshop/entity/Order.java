package com.example.bookshop.entity;

import com.example.bookshop.entity.enumeration.OrderStatus;
import com.example.bookshop.entity.enumeration.PaymentMethod;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "order")
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    LocalDateTime orderDate;

    @Column
    Long totalPrice;

    @Column
    @Enumerated(EnumType.STRING)
    OrderStatus orderStatus;

    @Column
    @Enumerated(EnumType.STRING)
    PaymentMethod paymentMethod;

    @ManyToOne
    @JoinColumn(name = "address_id")
    Address address;

    @ManyToOne
    @JoinColumn(name = "user_id")
    User user;
}
