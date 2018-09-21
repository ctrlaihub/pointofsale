package com.ctrl.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ctrl.domains.stock.Category;
import com.ctrl.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;
	
	public boolean addCategory(Category category){
		
		try{
		categoryRepository.save(category);
		return true;
		}
		catch(Exception e){
			return false;
		}
	}
	
	public List<Category> listAllCategory(){
		return categoryRepository.findByActive(true);
	}
	
	public Optional<Category> getById(long id){
		return categoryRepository.findById(id);
	}
	
//	public boolean deleteCategory(Category category){
//		category.setActive(false);
//		try{
//			categoryRepository.
//		}catch(Exception e){
//			
//		}
//	}
	
}
