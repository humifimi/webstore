package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import model.Product;
import service.OrderService;

@Controller

public class DetailController {
	@Autowired
	OrderService prservice;
	Product product;
	@RequestMapping(value="/detail/{productId}/{count}")
	public String showProduct(@PathVariable String productId,@PathVariable("count") int quantity)
	{
		product=prservice.findproduct(productId);
		ModelAndView model=new ModelAndView("detail");
		model.addObject("product",product);
		//return "redirect:/products";
		return "redirect:/detailpage";
	}
	
	@RequestMapping(value="/detailpage")
	public String showProduct(Model model)
	{
		model.addAttribute(product);
		//return "redirect:/products";
		return "detailpage";
	}
}
