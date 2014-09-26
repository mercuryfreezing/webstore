package com.packt.webstore.domain;

import java.beans.PropertyEditorSupport;

public class ProductCodeEditor extends PropertyEditorSupport{

	public void setTextAs(String text)
	{
		ProductCode pc = new ProductCode();
		pc.setProductCode(text.toUpperCase()); //Formatter
		setValue(pc);
		
	}
	
}
