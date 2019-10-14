package org.ecommerce.shoppersstopweb;

import org.ecommerce.model.Brand;
import org.ecommerce.model.Category;
import org.ecommerce.model.Filter;
import org.ecommerce.model.Product;
import org.ecommerce.rest.ProductController;
import org.ecommerce.service.ProductService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppersStopWebApplicationTests {

    @Autowired private ProductController controller;
    @Autowired private ProductService service;

    @Test
    public void contextLoads() {
        assertNotNull(controller);
        Product dummy = new Product();

        dummy.setProductName("Dummy Product");
        dummy.setRating(3.5);
        dummy.setStock(25);
        dummy.setProductPrice(2500);

        Brand orange = new Brand();
        orange.setBrandName("Orange");

        Filter f1 = new Filter();
        Filter f2 = new Filter();
        Filter f3 = new Filter();
        Filter f4 = new Filter();
        Filter f5 = new Filter();

        List<Filter> prodFilters, catFilters;
        prodFilters = new ArrayList<>();
        catFilters = new ArrayList<>();

        prodFilters.add(f1);
        prodFilters.add(f3);
        prodFilters.add(f5);
        catFilters.add(f2);
        catFilters.add(f4);

        f1.setName("Processor");
        f2.setName("RAM");
        f3.setName("Capacity");
        f4.setName("Type");
        f5.setName("Graphics");

        Category laptop = new Category();

        laptop.setCategoryName("LAPTOP");
        laptop.setFilters(catFilters);

        dummy.setFilters(prodFilters);
        dummy.setCategory(laptop);
        dummy.setProductBrand(orange);

        service.saveProductToDatabase(dummy);
    }

}
