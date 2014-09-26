package com.packt.webstore.repository;

import java.util.List;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.ProductCode;


public interface ProductService {

	public List<Product> getListOfAllProducts();
	public Product getProductById(String id);
	public void addProduct(Product product);
	public Product getProductByCode(ProductCode productCode);

	
}
