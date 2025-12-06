package com.example.ecommerce.product;

public class ProductDto {
    private String id;

    public ProductDto(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
