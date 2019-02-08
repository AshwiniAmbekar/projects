package com.lti.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.lti.dto.ShoppingDTO;
import com.lti.entity.Product;
import com.lti.repository.GenericRepository;
import com.lti.service.ShoppingService;

public class TestShoppingApp {
@Test
public void addProducts() {
	Product product =new Product();
	product.setName("Nokia");
	product.setPrice(34555);
	product.setStock(100);
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config1.xml");  
	GenericRepository repo=context.getBean(GenericRepository.class);
	repo.store(product);

}

@Test
public void placeOrder() {
	ShoppingDTO dto=new ShoppingDTO();
	dto.setProductId(101);
	dto.setPaymentMode("Credit card");
	dto.setQuantity(3);
	
	ApplicationContext context = new ClassPathXmlApplicationContext("spring-config1.xml");  
	ShoppingService ss=context.getBean(ShoppingService.class);
	ss.placeOrder(dto);
}
}
