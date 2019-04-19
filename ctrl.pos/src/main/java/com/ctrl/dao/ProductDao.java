package com.ctrl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.ctrl.domains.stock.Category;
import com.ctrl.domains.stock.Product;

@Repository
public class ProductDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	/*public void deleteProduct(Product product){
	Product p=(Product)entityManager.find(Product.class, product.getId());
	p.setActive(false);
	}
*/
//	public List<Product> findProductsByCategory(long id){
//	List<Product> list=(List<Product>)entityManager.createQuery("select t FROM Product t where t.category = :value1 ")
//		.setParameter("value1", id).getResultList();
//	 return list;
//	}
	
}
