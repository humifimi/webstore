package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Product;
import repository.ProductRepository;

@Service
public class OrderServiceImpl implements OrderService
{
	@Autowired
	ProductRepository productRepository;
	@Override
//	public void processOrder(String productId, int quantity)
//	{
//		Product orderdProduct= productRepository.getProductById(productId);
//
//if(orderdProduct!= null) {
//	if(quantity< orderdProduct.getUnitsInStock()) 
//		orderdProduct.setUnitsInStock(orderdProduct.getUnitsInStock() -quantity);
//}
//else{
//	throw new IllegalArgumentException();
//
//}
//}
	public  List<Product> getAllProducts(){
		 return productRepository.getAllProducts();
	 }
	@Override
	public Product findproduct(String id) {
		
		List<Product> pro=productRepository.getAllProducts();
		for(Product p:pro)
		{
			if(p.getProductId().equals(id))
				return p;
		}
		return null;
	}
	@Override
	public Product getProductById(String id) {
		
		return productRepository.getProductById(id);
	}
}