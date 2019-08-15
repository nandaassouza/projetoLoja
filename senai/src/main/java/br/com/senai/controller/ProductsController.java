package br.com.senai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.senai.dao.ProductsDao;
import br.com.senai.model.ProductsModel;

@Controller
public class ProductsController {
	
	@Autowired
	private ProductsDao productsDao;
	
	@RequestMapping("/products/form")
	public String index() {
		System.out.println("products");
		return "products/form";
	}
	
	@RequestMapping("/products/ok")
	public String save(ProductsModel products) {
		productsDao.save(products);
		return "products/ok";
	}
}
