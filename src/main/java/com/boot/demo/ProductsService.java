package com.boot.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsService {

	
	@RequestMapping("/getProducts")
	public @ResponseBody List<ProductData> getAllProducts()
	{
		ProductData product1 = new ProductData("A0001", "Product AAA", "Demo Product", 200.0);
		ProductData product2 = new ProductData("A0002", "Product AAA", "Demo Product", 400.0);
		ProductData product3 = new ProductData("A0003", "Product AAA", "Demo Product", 700.0);
		ProductData product4 = new ProductData("A0004", "Product AAA", "Demo Product", 2100.0);
		
		List<ProductData> dataList = new ArrayList<ProductData>();
				
		dataList.add(product1);
		dataList.add(product2);
		dataList.add(product3);
		dataList.add(product4);
		
		return dataList;
	}
	
}
