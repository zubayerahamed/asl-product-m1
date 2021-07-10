/**
 * 
 */
package com.asl.controller;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asl.entity.Product;
import com.asl.service.ProductService;

/**
 * @author zubayer
 *
 */
@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired ProductService service;

	@GetMapping("/products")
	public List<Product> getAllProducts(){
		return service.getAll();
	}

	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		if(StringUtils.isBlank(product.getName())) return null;
		return service.save(product);
	}

	@GetMapping("/{pid}")
	public Product findById(@PathVariable Long pid) {
		return service.find(pid);
	}

	@DeleteMapping("/delete/{pid}")
	public String delete(@PathVariable Long pid) {
		service.delete(service.find(pid));
		return "Deleted successfully";
	}
}
