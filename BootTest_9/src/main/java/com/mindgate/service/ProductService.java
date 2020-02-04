package com.mindgate.service;

import java.util.List;

import com.mindgate.domain.Product;

public interface ProductService {
	public List<Product> getProducts();

	void addProduct(Product product);

	Product getProduct(String name);

	void deleteProduct(String name);
	
	public void updateByName(String name,Product product);
	
}
