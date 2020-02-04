package com.mindgate.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.mindgate.controller.ProductNotFoundException;
import com.mindgate.domain.Product;
import com.mindgate.repository.ProductRepository;
@Repository
public class ProductRepositaryImpl implements ProductRepository {
	private static String ALL_PRODUCT_SQL="Select product_name,product_price from products";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	private static String INSERT_PRODUCT_SQL="insert into products(product_name,product_price) values(?,?)";
	private static String GET_PRODUCT_BY_NAME="select *from products where product_name=?";
	private static String DELETE_PRODUCT_NAME="delete from products where product_name=?";
	private static String UPDATE_PRODUCT_NAME="update products set product_price=? where product_name=?";
	
	public List<Product> getProducts() {
		return this.jdbcTemplate.query(ALL_PRODUCT_SQL,new ProductRowMapper());
	}
	private static final class ProductRowMapper implements RowMapper<Product>{

		
		public Product mapRow(ResultSet rs, int rownum) throws SQLException {
			Product product=new Product();
			product.setProductName(rs.getString("product_name"));
			product.setPrice(rs.getInt("product_price"));
			return product;
		}
		
	}

	public void addProduct(Product product) {
		jdbcTemplate.update(INSERT_PRODUCT_SQL,product.getProductName(),product.getPrice());
	}
	
	public Product getProduct(String name) {
		try {
			return this.jdbcTemplate.queryForObject(GET_PRODUCT_BY_NAME, new Object[] {name},new ProductRowMapper());
		}catch(Exception e) {
			throw new ProductNotFoundException(name);
		}
	}
	
	public void deleteProduct(String name) {
		jdbcTemplate.update(DELETE_PRODUCT_NAME,new Object[] {name});
	}
	
	public void updateByName(String name,Product product) {
		jdbcTemplate.update(UPDATE_PRODUCT_NAME,new Object[] {product.getPrice(),name});
	}

}
