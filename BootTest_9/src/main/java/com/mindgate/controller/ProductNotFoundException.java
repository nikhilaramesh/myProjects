package com.mindgate.controller;

public class ProductNotFoundException extends RuntimeException {
	
	 public ProductNotFoundException(String name) {
		    super("Could not find product " + name);
		  }

}
