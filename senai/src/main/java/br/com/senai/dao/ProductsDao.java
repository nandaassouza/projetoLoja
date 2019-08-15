package br.com.senai.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.senai.model.ProductsModel;

@Repository
@Transactional
public class ProductsDao {
	
	@PersistenceContext
	private EntityManager manager;
	
	public void save(ProductsModel products) {
		manager.persist(products);
	}
}
