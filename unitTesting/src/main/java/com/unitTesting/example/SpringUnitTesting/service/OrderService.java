package com.unitTesting.example.SpringUnitTesting.service;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ProductService productService;

    public OrderService (ProductService productService) {
        this.productService = productService;
    }

    public String getProductName() {
        return this.productService.getProductName();
    }

}
