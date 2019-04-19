package com.ctrl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao {

	@PersistenceContext	
	private EntityManager entityManager;
	
	/*public void updateCategory(Category category){
		
	Category oldData=(Category)entityManager.find(Category.class, category.getId());
		oldData.setActive(false);
//		entityManager.merge(oldData);
	}*/
}
