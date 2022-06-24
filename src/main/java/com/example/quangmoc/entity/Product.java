package com.example.quangmoc.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//
    private int id;
    private String name;
    private String slug;
    private String thumbnail;
    @Column(columnDefinition = "Text")
    private String description;
    private int status;
}
