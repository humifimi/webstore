package service;

import java.util.List;

import model.Product;

public interface OrderService {
	 List<Product> getAllProducts();
//	public void processOrder(String productId, int quantity);
	public Product findproduct(String id);
	public Product getProductById(String id);

}
