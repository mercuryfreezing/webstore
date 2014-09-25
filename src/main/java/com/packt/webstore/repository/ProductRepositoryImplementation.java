package com.packt.webstore.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Product;

@Repository
public class ProductRepositoryImplementation implements ProductService{

	
	private List<Product> listOfProducts;
	
	public ProductRepositoryImplementation()
	{
		listOfProducts = new ArrayList<Product>();
		//public Product (String id, String name, BigDecimal up, String man)
		Product phone1 = new Product("P1", "IPHONE", new BigDecimal(900), "APPLE", "SMARTPHONE");
		Product laptop1 = new Product("P2", "DELL INSPIRION", new BigDecimal(1300), "DELL", "LAPTOP");
		
		listOfProducts.add(phone1);
		listOfProducts.add(laptop1);
	}
	
	public List<Product> getListOfAllProducts()
	{
		return listOfProducts;
	}
	
	public Product getProductById(String id)
	{
		Product theProduct = new Product();
		
		for(Product eachProduct: listOfProducts)
		{
			if(eachProduct.getProductId().equalsIgnoreCase(id))
			{
				theProduct = eachProduct;
			}
			
		}
		
		return theProduct;
	}
	
	public void addProduct(Product product)
	{
		listOfProducts.add(product);
	}
	
}
