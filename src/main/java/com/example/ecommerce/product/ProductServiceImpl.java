package com.example.ecommerce.product;

import com.example.ecommerce.user.exception.UserNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductDto getById(long id) {
        Product product = repository.findById(id)
                .orElseThrow(() -> new UserNotFoundException(id));

        return toResponse(product);
    }

    @Override
    public ProductDto getAllProducts() {
        return null;
    }
}
