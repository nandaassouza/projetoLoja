package br.com.senai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductsModel {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProducts;
	private String title;
	private String description;
	private Double value;
	private String category;
	
	public int getIdProducts() {
		return idProducts;
	}
	public void setIdProducts(int idProducts) {
		this.idProducts = idProducts;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getValue() {
		return value;
	}
	public void setValue(Double value) {
		this.value = value;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
}
