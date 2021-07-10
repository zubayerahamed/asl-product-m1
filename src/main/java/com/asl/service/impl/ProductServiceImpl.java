package com.asl.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asl.entity.Product;
import com.asl.repository.ProductRepository;
import com.asl.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired private ProductRepository repo;

	@Transactional
	@Override
	public Product save(Product product) {
		if(product == null) return null;
		return repo.save(product);
	}

	@Override
	public Product find(Long pid) {
		if(pid == null) return null;
		Optional<Product> res = repo.findById(pid);
		return res.isPresent() ? res.get() : null;
	}

	@Override
	public List<Product> getAll() {
		return repo.findAll();
	}

	@Transactional
	@Override
	public void delete(Product product) {
		if(product == null) return;
		repo.delete(product);
	}
}
