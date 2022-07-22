package com.technical.springreact.springreact.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection="products")
public class Products {
    @Id
    private String id;
    private String name;
    private float unitPrice;
    private int qty;
    private float totalPrice;
}
