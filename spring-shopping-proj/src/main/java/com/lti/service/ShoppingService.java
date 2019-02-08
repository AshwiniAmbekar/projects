package com.lti.service;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dto.ShoppingDTO;
import com.lti.entity.Order;
import com.lti.entity.Payment;
import com.lti.entity.Product;
import com.lti.repository.GenericRepository;

//@Component
@Service // same as @Component
public class ShoppingService {
	
	@Autowired
	private GenericRepository genericRepository;
	
   @Transactional
	public void placeOrder(ShoppingDTO shoppingDTO) {
		Product product = genericRepository.fetchById(Product.class, shoppingDTO.getProductId());
		double totalAmount = product.getPrice() * shoppingDTO.getQuantity();

		Order order = new Order();
		order.setAmount(totalAmount);
		order.setOrderDate(new Date());
		genericRepository.store(order);

		Payment p = new Payment();
		p.setAmount(totalAmount);
		p.setPmode(shoppingDTO.getPaymentMode());
		genericRepository.store(p);

		product.setStock(product.getStock() - shoppingDTO.getQuantity());
		genericRepository.store(product);
	}
}
