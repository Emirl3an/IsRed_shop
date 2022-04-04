package com.example.formid.entity;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Data
public class Product {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
//        private String imageUrl;
        private String description;
        private Integer price;
    }

