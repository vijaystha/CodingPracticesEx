package com.unitTesting.example.SpringUnitTesting.test;

import com.unitTesting.example.SpringUnitTesting.service.ProductService;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Profile("test")
@Configuration
public class TestConfiguration {
@Bean
@Primary
public ProductService getProductService() {
    return Mockito.mock(ProductService.class);
}
}
