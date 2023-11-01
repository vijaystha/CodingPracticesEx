package com.unitTesting.example.SpringUnitTesting.test;

import com.unitTesting.example.SpringUnitTesting.service.OrderService;
import com.unitTesting.example.SpringUnitTesting.service.ProductService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
class SpringUnitTestingApplicationTests {

	@Autowired
	private OrderService orderService;

	@Autowired
	private ProductService productService;

	@Test
	public void retrievedNameIsCorrect(){
		Mockito.when(productService.getProductName()).thenReturn("Honey");
		String testName = orderService.getProductName();//Honey
		Assert.assertEquals("Honey", testName);
	}
}
