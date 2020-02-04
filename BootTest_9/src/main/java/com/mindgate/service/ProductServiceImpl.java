package com.mindgate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.mindgate.domain.Product;
import com.mindgate.repository.ProductRepository;

@Service(value="productService")
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepositary;
	
	public List<Product> getProducts() {
		
		return productRepositary.getProducts();
	}
	
	
	public void addProduct(Product product) {
		productRepositary.addProduct(product);
	}
	
	
	public Product getProduct(String name) {
		return productRepositary.getProduct(name);
		
	}
	
	public void deleteProduct(String name) {
		productRepositary.deleteProduct(name);
	}

	
	public void updateByName(String name, Product product) {
		
		productRepositary.updateByName(name, product);
	}

}
