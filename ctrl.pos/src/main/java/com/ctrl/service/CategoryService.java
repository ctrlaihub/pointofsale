package com.ctrl.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctrl.dao.CategoryDao;
import com.ctrl.domains.stock.Category;
import com.ctrl.repository.CategoryRepository;

@Service
@Transactional
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private CategoryDao categoryDao;
	
	
	/*
	 * For creating new Category
	 *
	 * */
	public boolean addCategory(Category category){
		try{
		categoryRepository.save(category);
		return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	/*
	 * To list all categories
	 * 
	 * */
	public List<Category> listAllCategory(){
		return categoryRepository.findAll();
	}
	
	/*
	 * To list only active categories
	 * 
	 * */
	public List<Category> listAllActiveCategory(){
		return categoryRepository.findByActive(true);
	}
	
	/*
	 * To get category by id
	 * 
	 * */
	public Optional<Category> getById(long id){
		return categoryRepository.findById(id);
	}
	
	
	/*
	 * To SOFT delete category
	 * 
	 * 
	 * Alternate method
	 * 		try{
			Category cat=(Category)categoryRepository.getOne(category.getId());
			cat.setActive(false);
			return true;
		}catch(Exception e){
			return false;
		}
	 * */
	public boolean deleteCategory(Category category){
		try{
			categoryDao.updateCategory(category);
			return true;
		}catch(Exception e){
			return false;
		}
	}
	
	
	public boolean updateCategory(Category category){
		return true;
	}
}
