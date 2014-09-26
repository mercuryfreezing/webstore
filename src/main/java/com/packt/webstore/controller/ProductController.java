package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.packt.webstore.domain.Product;
import com.packt.webstore.domain.ProductCode;
import com.packt.webstore.domain.ProductCodeEditor;
import com.packt.webstore.repository.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {

@Autowired
	private ProductService productService;
	

@RequestMapping
public String showProducts(Model model)
{
	model.addAttribute("products", productService.getListOfAllProducts());
	return "products";
}

@RequestMapping(value = "/{id}", method=RequestMethod.GET)
public String getProduct(Model model, @PathVariable (value="id")String productId)
{
	model.addAttribute("product", productService.getProductById(productId));
	return "product";
}

@InitBinder
public void initialiseBinder(WebDataBinder binder)
{
	binder.registerCustomEditor(ProductCode.class, new ProductCodeEditor());
	binder.setDisallowedFields("currentStock", "country");
}

@RequestMapping(value= "/add", method = RequestMethod.GET)
public String getProductForm(Model model)
{
	Product theProduct = new Product();
	model.addAttribute("theProduct", theProduct);	
	return "productform";
}

@RequestMapping(value= "/add", method = RequestMethod.POST)
public String processProductForm(Model model, @ModelAttribute (value = "theProduct") Product product, BindingResult result)
{
	String[] suppresedFields = result.getSuppressedFields();
	if(suppresedFields.length > 0)
	{
		throw new RuntimeException("Attempting to bind disallowed fields: " + StringUtils.arrayToCommaDelimitedString(suppresedFields));
	}
	productService.addProduct(product);
	return "redirect:/products";
}

@RequestMapping(value="/code/{code}", method=RequestMethod.GET)
public String getProductByC(Model model, @ModelAttribute(value="code") ProductCode productCode)
{
	model.addAttribute("product", productService.getProductByCode(productCode));
	return "product";
}

}
