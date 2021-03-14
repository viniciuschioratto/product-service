package com.viniciuschioratto.ProductService.entity;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class Product {

    private UUID id = UUID.randomUUID();
    private String name;
    private Float price;
    private String description;
    @CreatedDate
    private Instant dateInsert;
    @LastModifiedDate
    private Date dateUpdate;
    @Version
    private String version;

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Instant getDateInsert() {
        return dateInsert;
    }

    public Date getDateUpdate() {
        return dateUpdate;
    }

    public String getVersion() {
        return version;
    }

    public boolean isValid() {
        return name != null;
    }

}
