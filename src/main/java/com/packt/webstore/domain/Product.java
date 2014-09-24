package com.packt.webstore.domain;
import java.math.*;

public class Product {

	private String productId;
	private String name;
	private BigDecimal unitPrice;
	private String manufacturer;
	private String category;
	
	
	public Product()
	{
		
	}
	
	public Product (String id, String name, BigDecimal up, String man, String cat)
	{
		this.productId = id;
		this.name = name;
		this.unitPrice = up;
		this.manufacturer = man;
		this.category = cat;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getId() {
		return productId;
	}

	public void setId(String id) {
		this.productId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	@Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    Product other = (Product) obj;
	    if (productId == null) {
	      if (other.productId != null)
	        return false;
	    } else if (!productId.equals(other.productId))
	      return false;
	    return true;
	  }

	  @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result
	        + ((productId == null) ? 0 : productId.hashCode());
	    return result;
	  }
	
	
	
}
