package com.ctrl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ctrl.dao.ProductDao;
import com.ctrl.domains.stock.Product;
import com.ctrl.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductDao productDao;
	
	public boolean createProduct(Product product){
		try{
			 productRepository.save(product);
			 return true;
		}catch(Exception e){
			return false;
		}
	}
	
	public List<Product> listAllProducts(){
		return productRepository.findAll();
	}
	
	public List<Product> listAllActiveProducts(){
		return productRepository.findByActive(true);
	}
	
////	@Transactional
//	public List<Product> listProductByCategory(){
//		return productDao.findProductsByCategory(Long id);
//	}
	
	@Transactional
	public boolean deleteProduczsst(Product product){
		try{
			productDao.deleteProduct(product);
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
