package com.ctrl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ctrl.domains.stock.Category;

public interface CategoryRepository extends JpaRepository<Category, String> {
	List<Category> findByActive(Boolean b);
}
