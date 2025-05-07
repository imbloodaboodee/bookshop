package com.example.bookshop.entity;

import com.example.bookshop.entity.enumeration.MediaType;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Table(name = "media")
@Entity
@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column
    String mediaUrl;

    @Column
    Long referenceId;

    @Enumerated(EnumType.STRING)
    MediaType mediaType;

}
