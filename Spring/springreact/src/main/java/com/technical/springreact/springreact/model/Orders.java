package com.technical.springreact.springreact.model;



import java.util.Date;
import java.util.List;

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
@Document(collection="orders")
public class Orders {
    @Id 
    private String id;
    private int orderNumber;
    private Date date;
    private List<Products> products;
    private float finalPrice;
}
