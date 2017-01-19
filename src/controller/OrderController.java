package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import model.Product;
import service.OrderService;

@Controller
@SessionAttributes("listpurchase")
public class OrderController {
	@Autowired
	OrderService prservice;
	Product product;
	List<Product> purchaseList;
	double total=0;
	
	
	String id;
	@RequestMapping(value="/order/{productId}/{count}")
	public String processOrder(@PathVariable String productId,@PathVariable("count") int quantity)
	{
		id=productId;
	product=prservice.findproduct(productId);
	ModelAndView model=new ModelAndView("detail");
	model.addObject("product",product);
	//return "redirect:/products";
	return "redirect:/purchaseorder";
	}
	
	
	@RequestMapping(value="/purchaseorder")
	public String showProduct(Model model)
	{
		model.addAttribute(product);
		//return "redirect:/products";
		return "purchaseorder";
	}
	@RequestMapping(value="/purchase",method=RequestMethod.POST)
	public String purchase(@RequestParam("qty") long qty,@RequestParam("id") String id,Model model)
	{
		
 		
		if(prservice.getProductById(id).getUnitsInOrder()>=qty)
		{
			product.setUnitsInStock(qty);
			purchaseList.add(product);
			total=total+product.getUnitPrice().intValue()*qty;
			
			
		}
		model.addAttribute("total",total);
		model.addAttribute("purchase",purchaseList);
	 return "redirect:/viewseorder";
	}

@RequestMapping(value="/viewseorder",method=RequestMethod.GET)
public String showp(Model m)
{
	m.addAttribute("total",total);
	
	m.addAttribute("purchaseList",purchaseList);
	return "viewseorder";
}
}
