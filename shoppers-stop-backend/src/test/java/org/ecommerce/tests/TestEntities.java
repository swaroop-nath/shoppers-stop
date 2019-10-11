package org.ecommerce.tests;

import org.ecommerce.model.Brand;
import org.ecommerce.model.Category;
import org.ecommerce.model.Filter;
import org.ecommerce.model.Product;
import org.ecommerce.service.ProductService;
import org.ecommerce.service.ProductServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
public class TestEntities {

    @Autowired
    private ProductServiceImpl service;

    @Test
    public void testAddProduct() {
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
