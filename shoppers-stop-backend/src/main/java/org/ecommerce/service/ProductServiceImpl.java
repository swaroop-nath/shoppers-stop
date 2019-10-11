package org.ecommerce.service;

import org.ecommerce.model.Product;
import org.ecommerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service(value = "service")
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repository;

    @Override
    public Product saveProductToDatabase(Product product) {
        return repository.save(product);
    }

    @Override
    public Product fetchProductById(int id) {
        return repository.findById(id).get();
    }
}
