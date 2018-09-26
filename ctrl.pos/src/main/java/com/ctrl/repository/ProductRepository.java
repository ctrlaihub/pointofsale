package com.ctrl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrl.domains.stock.Category;
import com.ctrl.domains.stock.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	List<Product> findByActive(boolean b);
//	List<Product> findByCategory();

}
