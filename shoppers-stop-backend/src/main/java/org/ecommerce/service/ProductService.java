package org.ecommerce.service;

import org.ecommerce.model.Product;

public interface ProductService {

    Product saveProductToDatabase(Product product);

    Product fetchProductById(int id);

}
