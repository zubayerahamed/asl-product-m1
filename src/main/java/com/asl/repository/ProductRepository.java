/**
 * 
 */
package com.asl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asl.entity.Product;

/**
 * @author zubayer
 *
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
