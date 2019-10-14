package org.ecommerce.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category_master")
@SequenceGenerator(name = "catseq",
        sequenceName = "category_sequence",
        allocationSize = 1)
public class Category {

    @Id
    @GeneratedValue(generator = "catseq")
    @Column(name = "category_id")
    private int categoryID;

    @Column(length = 30)
    private String categoryName;

    @ManyToMany
    @JoinTable(name = "category_filter_master",
            joinColumns = {@JoinColumn(name = "category_id")},
            inverseJoinColumns = {@JoinColumn(name = "filter_id")})
    private List<Filter> filters;

    {
        filters = new ArrayList<Filter>();
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }
}
