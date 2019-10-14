package org.ecommerce.model;

import javax.persistence.*;

@Entity
@Table(name = "filter_name")
@SequenceGenerator(name = "filterseq",
        sequenceName = "filter_sequence",
        allocationSize = 1)
public class Filter {

    @Id
    @GeneratedValue(generator = "filterseq")
    @Column(name = "filter_id")
    private int filterID;

    private String name;

    public int getFilterID() {
        return filterID;
    }

    public void setFilterID(int filterID) {
        this.filterID = filterID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
