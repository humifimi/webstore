package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Product;
import service.OrderService;
@Controller
public class ProductController {
	@Autowired
	OrderService productService;
	@RequestMapping(value="/")
	public String getAllProduct(Model model){
	List<Product> products= productService.getAllProducts();
	model.addAttribute("products",products);
	return "products";
}
//	@RequestMapping(value="/products")
//	public String getAllProduct1(Model model){
//	List<Product> products= productService.getAllProducts();
//	model.addAttribute("products",products);
//	return "products";
//}
	
}