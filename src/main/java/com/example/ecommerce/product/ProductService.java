package com.example.ecommerce.product;

public interface ProductService {
    ProductDto getById(long id);

    ProductDto getAllProducts();
}
