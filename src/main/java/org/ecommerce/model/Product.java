package org.ecommerce.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product_master")
@SequenceGenerator(name = "prodseq",
        sequenceName = "product_sequence",
        allocationSize = 1)
public class Product {

    @Id
    @GeneratedValue(generator = "prodseq")
    @Column(name = "product_id")
    private int productID;

    private String productName;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "brand_id", updatable = true)
    private Brand productBrand;

    private int stock;

    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id", updatable = false)
    private Category category;

    @ManyToMany
    @JoinTable(name = "product_filter_master",
            joinColumns = {@JoinColumn(name = "product_id")},
            inverseJoinColumns = {@JoinColumn(name = "filter_id")})
    private List<Filter> filters;

    private double rating;

    private double productPrice;
    {
        filters = new ArrayList<Filter>();
    }


    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(Brand productBrand) {
        this.productBrand = productBrand;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

}
