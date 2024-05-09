package com.skillstorm.models;


import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import jakarta.annotation.Generated;
import jakarta.persistence.*;


@Entity
@Table(name = "groceries")

public class GroceryItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String name;
    private String address;
    private List orders;
    
}
