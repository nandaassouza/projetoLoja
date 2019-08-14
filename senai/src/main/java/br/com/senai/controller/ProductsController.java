package br.com.senai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductsController {
	@RequestMapping("/products/form")
	public String index() {
		System.out.println("products");
		return "/products/form";
	}
}
