package io.ducozil1003.store.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;
    @Getter @Setter
    private String name;
    @Getter @Setter
    private double price;
    @Getter @Setter
    private String image;
    @Getter @Setter
    private String detailDesc;
    @Getter @Setter
    private String shortDesc;
    @Getter @Setter
    private long quantity;
    @Getter @Setter
    private long sold;
    @Getter @Setter
    private String factory;
    @Getter @Setter
    private String target;
}

