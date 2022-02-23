package com.lavanya.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.lavanya.product.dto.Product;

public class ProductDAPimplTest {

	@Test
	public void CreateShouldCreateAProduct() {
		
		ProductDAO dao = new ProductDAPimpl();
		Product product =new Product();	
		product.setId(1);
		product.setName("IPhone");
		product.setDescription("It's Awesome!!");
		product.setPrice(10000);
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("IPhone",result.getName());
	}

}
