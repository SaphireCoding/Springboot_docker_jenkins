package com.example.sprbtdkrjnkn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.sprbtdkrjnkn.model.Product;
import com.example.sprbtdkrjnkn.model.Response;

@RestController
@RequestMapping("/app")
public class AppController {
	
	@GetMapping("/welcome")
	public String welcome() {
		return "<h3>Welcome to SPRING BOOT</h3>";
	}
	
	@GetMapping(path="/products")
	public Response getProducts() {
		List<Product> productlist = new ArrayList<Product>();
		productlist.add(new Product("iphone", 900));
		productlist.add(new Product("mac", 3000));
		productlist.add(new Product("ipad", 800));
		
		Response response = new Response(101, "Products fetched successfully", productlist);
		return response;
		
	}
}
