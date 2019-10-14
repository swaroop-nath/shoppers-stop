package org.ecommerce.rest;

import org.ecommerce.exception.ProductNotFoundException;
import org.ecommerce.model.Product;
import org.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @GetMapping(value = "/{id}", produces = "application/json")
    public Product getProductByID(@PathVariable int id) throws ProductNotFoundException {
        return service.fetchProductById(id);
    }

    @PostMapping(value = "/add", consumes = "application/json")
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProductToDatabase(product);
    }
}
