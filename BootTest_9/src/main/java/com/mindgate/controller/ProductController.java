package com.mindgate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.domain.Product;
import com.mindgate.service.ProductService;
@RestController
@RequestMapping("/product")

public class ProductController {
	@Autowired
	private ProductService productService;

	
	@RequestMapping(value = "/products" , method= RequestMethod.GET)
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	@RequestMapping(value="/product/{name}",method=RequestMethod.GET)
	public Product getProductByName(@PathVariable("name")String name) {
		return productService.getProduct(name);
	}
	@RequestMapping(value="/product",method=RequestMethod.POST)
	public Product addProduct(@RequestBody Product product) {
		System.out.println(product);
		productService.addProduct(product);
		return product;
	}
	@RequestMapping(value="/product/{name}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable("name")String name) {
		productService.deleteProduct(name);
	}
	@RequestMapping(value="/product/{name}",method=RequestMethod.PUT)
	public void updateByName(@PathVariable("name")String name,@RequestBody Product product) {
		productService.updateByName(name,product);
	}

}
