package com.packt.webstore.domain;

public class ProductCode {

	
	private String productCode;
	
	public ProductCode()
	{
		
	}
	
	public ProductCode(String pc)
	{
		this.productCode = pc;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
}
