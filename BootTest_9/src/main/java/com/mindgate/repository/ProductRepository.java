package com.mindgate.repository;

import java.util.List;

import com.mindgate.domain.Product;

public interface ProductRepository {
	public List<Product> getProducts();

	void addProduct(Product product);

	Product getProduct(String name);

	void deleteProduct(String name);

	void updateByName(String name, Product product);
}
