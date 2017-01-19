package repository;

import java.util.List;

import model.Product;

public interface ProductRepository {
	List<Product> getAllProducts();
	Product getProductById(String id);

}
