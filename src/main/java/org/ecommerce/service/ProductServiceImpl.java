package org.ecommerce.service;

import org.ecommerce.exception.ProductNotFoundException;
import org.ecommerce.model.Product;
import org.ecommerce.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repository;

    @Override
    public Product saveProductToDatabase(Product product) {
        return repository.save(product);
    }

    @Override
    public Product fetchProductById(int id) throws ProductNotFoundException {
        Optional<Product> productWrapper = repository.findById(id);

        if (productWrapper.isPresent())
            return productWrapper.get();
        throw new ProductNotFoundException("No Product Found For the ID: " + id);
//    	return repository.findByID(id);
    }
}
