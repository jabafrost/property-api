package com.example.property_api.model;

import jakarta.persistence.*;

@Entity
@Table(name = "properties")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String address;
    private Double price;
    private String type;

    // Constructors
    public Property() {}

    public Property(String address, Double price, String type) {
        this.address = address;
        this.price = price;
        this.type = type;
    }

    // Getters and Setters
    public Long getId() { return id;}
    public void setId(Long id) { this.id = id; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }
}
