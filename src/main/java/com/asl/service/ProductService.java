package com.asl.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.asl.entity.Product;

@Component
public interface ProductService {

	public Product save(Product product);

	public Product find(Long pid);

	public List<Product> getAll();

	public void delete(Product product);
}
