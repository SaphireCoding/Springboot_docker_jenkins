package com.example.sprbtdkrjnkn.model;

import java.util.List;

public class Response {
	Integer code;
	String message;
	List<Product> products;
	
	public Response(Integer code, String message, List<Product> products) {
		this.code = code;
		this.message = message;
		this.products = products;
	}
	
	public Integer getCode() {
		return code;
	}
	
	public void setCode(Integer code) {
		this.code = code;
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public List<Product> getProductlist() {
		return products;
	}
	
	public void setProductlist(List<Product> products) {
		this.products = products;
	}
	
}
